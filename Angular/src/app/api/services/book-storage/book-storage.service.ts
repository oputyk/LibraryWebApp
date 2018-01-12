///<reference path="../../../../../node_modules/@angular/core/src/metadata/lifecycle_hooks.d.ts"/>
import {Injectable, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Book} from "../../models/book.model";
import {Observable} from "rxjs/Observable";

@Injectable()
export class BookStorageService {

  constructor(private http: HttpClient) {  }

  getAllBooks(): Observable<Book[]> {
    return this.http.get<Book[]>("api/book-storage/all");
  }

  editBook(book: Book): Observable<Book> {
    return this.http.post<Book>("api/book-storage/edit-book", book);
  }

}
