import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {SeemoreComponent} from './seemore.component';

describe('SeemoreComponent', () => {
  let component: SeemoreComponent;
  let fixture: ComponentFixture<SeemoreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [SeemoreComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeemoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
