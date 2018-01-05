import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookStorageManagementComponent } from './book-storage-management.component';

describe('BookStorageManagementComponent', () => {
  let component: BookStorageManagementComponent;
  let fixture: ComponentFixture<BookStorageManagementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookStorageManagementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookStorageManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
