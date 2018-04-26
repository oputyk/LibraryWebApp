/**
 * Created by kamil on 26/01/2018.
 */
import {Author} from "./author.model";

export class BookList {
  bookName: string;
  authors: Author[] = [];
  bookIds: number[];
}
