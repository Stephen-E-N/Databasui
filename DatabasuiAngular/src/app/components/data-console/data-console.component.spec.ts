import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DataConsoleComponent } from './data-console.component';

describe('DataConsoleComponent', () => {
  let component: DataConsoleComponent;
  let fixture: ComponentFixture<DataConsoleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataConsoleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataConsoleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
