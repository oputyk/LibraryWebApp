import {Author} from "./author.model";
/**
 * Created by kamil on 08/01/2018.
 */
export interface Book {
  id: number;
  name: string;
  authors: Author[];
}
