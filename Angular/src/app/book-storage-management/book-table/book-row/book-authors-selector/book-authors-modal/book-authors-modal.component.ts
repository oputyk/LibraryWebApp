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
              private modal: NgbActiveModal ) { }

  ngOnInit() {
      this.authorService.getAllAuthorsMinInfo().subscribe(authors => {
        this.authors = authors;
        this.fillAuthorsChecked();
    });
  }

  save() {
    this.book.authors = this.getCheckedAuthors();
    this.modal.close(this.book);
  }

  getCheckedAuthors(): Author[] {
    let authors: Author[] = [];
    for(let i: number = 0; i < this.authors.length; i++) {
      if(this.authorsChecked[i]) {
        authors.push(this.authors[i]);
      }
    }
    return authors;
  }

  fillAuthorsChecked() {
    for(let author of this.authors) {
      this.authorsChecked.push(this.book.authors.find(authr => authr.id == author.id) != undefined);
    }
  }
}
