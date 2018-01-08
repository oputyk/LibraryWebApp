import {Observable} from "rxjs/Observable";
import {Injectable} from "@angular/core";
import "rxjs/add/observable/of";
import * as fakeBook from "../../test-data/fake-books.json"
import {Book} from "../../models/book.model";
/**
 * Created by kamil on 08/01/2018.
 */

@Injectable()
export class MockBookStorageService {

  constructor() {  }

  getAllBooks(): Observable<any> {
    console.log(fakeBook);
    return Observable.of(fakeBook);
  }
}
