import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {CreatePetsitterComponent} from './create-petsitter.component';

describe('CreatePetsitterComponent', () => {
  let component: CreatePetsitterComponent;
  let fixture: ComponentFixture<CreatePetsitterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [CreatePetsitterComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatePetsitterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
