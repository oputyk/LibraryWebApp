import {Component, Input, OnInit} from '@angular/core';
import {Book} from "../../../api/models/book.model";
import {BookStorageService} from "../../../api/services/book-storage/book-storage.service";
import {Author} from "../../../api/models/author.model";

@Component({
  selector: '[app-book-row]',
  templateUrl: './book-row.component.html',
  styleUrls: ['./book-row.component.scss']
})
export class BookRowComponent implements OnInit {

  @Input("book") book: Book;
  editMode: boolean;

  constructor(private bookStorageService: BookStorageService) {
    this.editMode = false;
  }

  ngOnInit() {
  }

  editBook(event: Event): void {
    this.editMode = true;
  }

  saveBook(event: Event): void {
    this.bookStorageService.editBookMaxInfo(this.book).subscribe((book: Book) => {
      this.editMode = !(book != null);
      this.book.name = book.name;
    });
  }
}
