import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookAuthorsModalComponent } from './book-authors-modal.component';

describe('BookAuthorsModalComponent', () => {
  let component: BookAuthorsModalComponent;
  let fixture: ComponentFixture<BookAuthorsModalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookAuthorsModalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookAuthorsModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
