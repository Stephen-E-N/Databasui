import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BubbleTableComponent } from './bubble-table.component';

describe('BubbleTableComponent', () => {
  let component: BubbleTableComponent;
  let fixture: ComponentFixture<BubbleTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BubbleTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BubbleTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
