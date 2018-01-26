import {Book} from "./book.model";
/**
 * Created by kamil on 17/01/2018.
 */
export class Author {
  id: number;
  firstName: string;
  lastName: string;
  age: number;
  books: Book[] = [];
}
