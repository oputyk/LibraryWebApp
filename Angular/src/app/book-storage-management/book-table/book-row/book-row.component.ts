import {Component, Input, OnInit} from '@angular/core';
import {Book} from "../../../api/models/book.model";
import {BookStorageService} from "../../../api/services/book-storage/book-storage.service";

@Component({
  selector: '[app-book-row]',
  templateUrl: './book-row.component.html',
  styleUrls: ['./book-row.component.scss']
})
export class BookRowComponent implements OnInit {

  @Input("book") book: Book;
  editMode: boolean;
  message: string;

  constructor(private bookStorageService: BookStorageService) {
    this.editMode = false;
  }

  ngOnInit() {
  }

  editBook(event: Event): void {
    this.editMode = true;
  }

  saveBook(event: Event): void {
    this.bookStorageService.editBook(this.book).subscribe((book: Book) => {
      this.editMode = !(book != null);
    });
  }
}
