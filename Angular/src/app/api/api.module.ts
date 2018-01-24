import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BookStorageService } from "./services/book-storage/book-storage.service";
import {MockBookStorageService} from "./services/book-storage/mock-book-storage.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {AuthorService} from "./services/author/author.service";

@NgModule({
  imports: [
    CommonModule,
    HttpClientModule
  ],
  declarations: [

  ],
  providers: [
    BookStorageService,
    MockBookStorageService,
    AuthorService
  ]
})
export class ApiModule { }
