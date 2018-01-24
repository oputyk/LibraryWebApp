import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookAuthorsSelectorComponent } from './book-authors-selector.component';

describe('BookAuthorsSelectorComponent', () => {
  let component: BookAuthorsSelectorComponent;
  let fixture: ComponentFixture<BookAuthorsSelectorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookAuthorsSelectorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookAuthorsSelectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
