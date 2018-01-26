import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
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
  @Output("removedBook") removedBook = new EventEmitter();
  editMode: boolean;
  redEmptyFields: boolean = false;

  constructor(private bookStorageService: BookStorageService) {
  }

  ngOnInit(): void {
    this.editMode = false;
    if(this.book.id < 0) {
      this.editMode = true;
    }
  }

  editBook(event: Event): void {
    this.editMode = true;
  }

  saveBook(event: Event): void {
    if(!this.isBookEmpty()) {
      this.redEmptyFields = false;
      if (this.book.id > 0) {
        this.saveBookEdit();
      } else {
        this.saveBookNew();
      }
    } else {
      this.redEmptyFields = true;
    }
  }

  private saveBookEdit(): void {
    this.bookStorageService.editBookMaxInfo(this.book).subscribe((book: Book) => {
      this.editMode = !(book != null);
      this.book = book;
    });
  }

  private saveBookNew(): void {
    this.bookStorageService.addBookMaxInfo(this.book).subscribe((book: Book) => {
      this.editMode = !(book != null);
      this.book = book;
    })
  }

  bookChange(event: Book): void {
    this.book = event;
  }

  deleteBook(event: Event): void {
    if(this.book.id > 0) {
      this.bookStorageService.deleteBook(this.book.id).subscribe((id: number) => {
        this.removedBook.emit(this.book.id);
      });
    } else {
      this.removedBook.emit(this.book.id);
    }
  }

  isBookEmpty(): boolean {
    if(this.book.name == null || this.book.isbn == null) {
      return true;
    } else if(this.book.name.length == 0) {
      return true;
    }
    return false;
  }
}
