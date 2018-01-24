import { Injectable } from '@angular/core';
import {Author} from "../../models/author.model";
import {Observable} from "rxjs/Observable";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class AuthorService {

  constructor(private http: HttpClient) { }

  getAllAuthorsMinInfo(): Observable<Author[]> {
    return this.http.get<Author[]>("api/author/all-min-info");
  }

}
