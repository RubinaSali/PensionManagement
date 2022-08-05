import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LamboComponent } from './lambo.component';

describe('LamboComponent', () => {
  let component: LamboComponent;
  let fixture: ComponentFixture<LamboComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LamboComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LamboComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
