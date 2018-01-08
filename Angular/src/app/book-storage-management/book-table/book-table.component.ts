import { Component, OnInit } from '@angular/core';
import { Book } from "../../api/models/book.model";
import { BookStorageService } from "../../api/services/book-storage/book-storage.service";
import {MockBookStorageService} from "../../api/services/book-storage/mock-book-storage.service";

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit {

  books :Book[];

  constructor(private bookStorageService: BookStorageService) { }

  ngOnInit(): void {
    this.bookStorageService.getAllBooks().subscribe(books => this.books = books);
  }

}
