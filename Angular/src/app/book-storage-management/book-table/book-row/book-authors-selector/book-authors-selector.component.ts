import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Book} from "../../../../api/models/book.model";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {BookAuthorsModalComponent} from "./book-authors-modal/book-authors-modal.component";
import {BookStorageService} from "../../../../api/services/book-storage/book-storage.service";

@Component({
  selector: 'app-book-authors-selector',
  templateUrl: './book-authors-selector.component.html',
  styleUrls: ['./book-authors-selector.component.scss']
})
export class BookAuthorsSelectorComponent implements OnInit {

  @Input("book") book: Book;
  @Output("bookChange") bookChange = new EventEmitter<Book>();

  constructor(private modalService: NgbModal, private bookService: BookStorageService) { }

  ngOnInit() {}

  open() {
    const modalRef = this.modalService.open(BookAuthorsModalComponent);
    modalRef.componentInstance.book = this.book;
    modalRef.result.then(value => {
      this.book = value;
      this.bookChange.emit(this.book);
    });
  }

}
