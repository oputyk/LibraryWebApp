///<reference path="../../../../../node_modules/@angular/core/src/metadata/lifecycle_hooks.d.ts"/>
import {Injectable, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Book} from "../../models/book.model";
import {Observable} from "rxjs/Observable";

@Injectable()
export class BookStorageService {

  constructor(private http: HttpClient) {  }

  getAllBooksMaxInfo(): Observable<Book[]> {
    return this.http.get<Book[]>("api/book/all-max-info");
  }

  editBookMaxInfo(book: Book): Observable<Book> {
    return this.http.post<Book>("api/book/update-max-info", book);
  }

}
