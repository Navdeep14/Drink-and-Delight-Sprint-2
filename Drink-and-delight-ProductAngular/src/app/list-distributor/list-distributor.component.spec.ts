import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDistributorComponent } from './list-distributor.component';

describe('ListDistributorComponent', () => {
  let component: ListDistributorComponent;
  let fixture: ComponentFixture<ListDistributorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListDistributorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListDistributorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
