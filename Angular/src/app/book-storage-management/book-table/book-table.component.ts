import { Component, OnInit } from '@angular/core';
import { Book } from "../../api/models/book.model";
import { BookStorageService } from "../../api/services/book-storage/book-storage.service";
import {MockBookStorageService} from "../../api/services/book-storage/mock-book-storage.service";
import {max} from "rxjs/operator/max";
import {min} from "rxjs/operators";

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit {

  books: Book[];

  constructor(private bookStorageService: BookStorageService) {   }

  ngOnInit(): void {
    this.bookStorageService.getAllBooksMaxInfo().subscribe(books => this.books = books);
  }

  removedBook(id: number) {
    this.books = this.books.filter(book => book.id != id);
  }

  addBook(event: Event) {
    let newBook: Book = new Book();
    let bookIds: number[] = this.books.map(book => book.id);
    bookIds.push(0);
    newBook.id = (Math.min(...bookIds)) - 1;
    this.books.push(newBook);
  }
}
