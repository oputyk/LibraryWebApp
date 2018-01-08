import { TestBed, inject } from '@angular/core/testing';

import { BookStorageService } from './book-storage.service';

describe('BookStorageService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [BookStorageService]
    });
  });

  it('should be created', inject([BookStorageService], (service: BookStorageService) => {
    expect(service).toBeTruthy();
  }));
});
