import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockMgtComponent } from './stock-mgt.component';

describe('StockMgtComponent', () => {
  let component: StockMgtComponent;
  let fixture: ComponentFixture<StockMgtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockMgtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockMgtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
