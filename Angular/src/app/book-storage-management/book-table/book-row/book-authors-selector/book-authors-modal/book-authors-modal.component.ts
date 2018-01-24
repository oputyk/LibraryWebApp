import {Component, Input, OnInit} from '@angular/core';
import {Book} from "../../../../../api/models/book.model";
import {AuthorService} from "../../../../../api/services/author/author.service";
import {Author} from "../../../../../api/models/author.model";
import {BookStorageService} from "../../../../../api/services/book-storage/book-storage.service";
import {NgbActiveModal, NgbModalRef} from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-book-authors-modal',
  templateUrl: './book-authors-modal.component.html',
  styleUrls: ['./book-authors-modal.component.scss']
})
export class BookAuthorsModalComponent implements OnInit {

  @Input("book") book: Book;
  authorsChecked: boolean[] = [];
  authors: Author[];
  constructor(private authorService: AuthorService,
              private bookService: BookStorageService,
              private modal: NgbActiveModal ) { }

  ngOnInit() {
      this.authorService.getAllAuthorsMinInfo().subscribe(authors => {
        this.authors = authors;
        this.fillAuthorsChecked();
    });
  }

  save() {
    this.bookService.changeBookAuthors(this.book.id, this.getAuthorsIds()).subscribe(ok => {
        if(ok != null) {
          this.modal.close();
        }
      }
    );
  }

  fillAuthorsChecked() {
    for(let author of this.authors) {
      this.authorsChecked.push(this.book.authors.find(authr => authr.id == author.id) != undefined);
    }
  }

  getAuthorsIds() {
    let authorsIds: number[] = [];
    for(let i: number = 0; i < this.authorsChecked.length; i++) {
      if(this.authorsChecked[i]) {
        authorsIds.push(this.authors[i].id);
      }
    }

    return authorsIds;
  }
}
