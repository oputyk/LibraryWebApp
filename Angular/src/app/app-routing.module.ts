import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {BookStorageManagementComponent} from "./book-storage-management/book-storage-management.component";
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";

const routes :Routes = [
  { path: "bookstoragemanagement", component: BookStorageManagementComponent },
  { path: "", component: DashboardComponent, pathMatch: "full" },
  { path: "**", component: PageNotFoundComponent }
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
