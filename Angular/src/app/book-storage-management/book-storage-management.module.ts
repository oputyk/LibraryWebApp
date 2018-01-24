import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {BookStorageManagementComponent} from "./book-storage-management.component";
import {BookTableComponent} from "./book-table/book-table.component";
import {BrowserModule} from "@angular/platform-browser";
import {ApiModule} from "../api/api.module";
import {BookStorageService} from "../api/services/book-storage/book-storage.service";
import { BookRowComponent } from './book-table/book-row/book-row.component';
import {FormsModule} from "@angular/forms";
import { BookAuthorsSelectorComponent } from './book-table/book-row/book-authors-selector/book-authors-selector.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { BookAuthorsModalComponent } from './book-table/book-row/book-authors-selector/book-authors-modal/book-authors-modal.component';

@NgModule({
  imports: [
    NgbModule.forRoot(),
    CommonModule,
    ApiModule,
    FormsModule
  ],
  entryComponents: [ BookAuthorsModalComponent ],
  declarations: [
    BookStorageManagementComponent,
    BookTableComponent,
    BookRowComponent,
    BookAuthorsSelectorComponent,
    BookAuthorsModalComponent,
  ]
})
export class BookStorageManagementModule { }
