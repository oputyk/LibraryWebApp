import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {BookStorageManagementComponent} from "./book-storage-management.component";
import {BookTableComponent} from "./book-table/book-table.component";
import {BrowserModule} from "@angular/platform-browser";
import {ApiModule} from "../api/api.module";
import {BookStorageService} from "../api/services/book-storage/book-storage.service";

@NgModule({
  imports: [
    CommonModule,
    ApiModule
  ],
  declarations: [
    BookStorageManagementComponent,
    BookTableComponent
  ]
})
export class BookStorageManagementModule { }
