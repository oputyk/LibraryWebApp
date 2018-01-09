import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {BookStorageManagementComponent} from "./book-storage-management.component";
import {BookTableComponent} from "./book-table/book-table.component";
import {BrowserModule} from "@angular/platform-browser";
import {ApiModule} from "../api/api.module";
import {BookStorageService} from "../api/services/book-storage/book-storage.service";
import { BookRowComponent } from './book-row/book-row.component';

@NgModule({
  imports: [
    CommonModule,
    ApiModule
  ],
  declarations: [
    BookStorageManagementComponent,
    BookTableComponent,
    BookRowComponent
  ]
})
export class BookStorageManagementModule { }
