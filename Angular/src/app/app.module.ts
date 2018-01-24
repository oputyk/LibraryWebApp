import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppFooterComponent } from './app-footer/app-footer.component';
import { AppHeaderComponent } from './app-header/app-header.component';
import { AppRoutingModule } from './/app-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { BookStorageManagementComponent } from './book-storage-management/book-storage-management.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { BookTableComponent } from './book-storage-management/book-table/book-table.component';
import { BookStorageService } from "./api/services/book-storage/book-storage.service";
import {BookStorageManagementModule} from "./book-storage-management/book-storage-management.module";

@NgModule({
  declarations: [
    AppComponent,
    AppFooterComponent,
    AppHeaderComponent,
    DashboardComponent,
    PageNotFoundComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BookStorageManagementModule
  ],
  providers: [
    BookStorageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
