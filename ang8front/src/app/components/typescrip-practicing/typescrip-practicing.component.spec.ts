import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TypescripPracticingComponent } from './typescrip-practicing.component';

describe('TypescripPracticingComponent', () => {
  let component: TypescripPracticingComponent;
  let fixture: ComponentFixture<TypescripPracticingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TypescripPracticingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TypescripPracticingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
