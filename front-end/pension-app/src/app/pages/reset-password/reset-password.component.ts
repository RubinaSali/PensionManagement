import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-reset-password',
  templateUrl: './reset-password.component.html',
  styleUrls: ['./reset-password.component.css']
})
export class ResetPasswordComponent implements OnInit {

  resetForm = new FormGroup({
    newPassword: new FormControl(null, Validators.required),
    confirmPassword: new FormControl(null, Validators.required)
  });

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit($event: any) {
    if (this.resetForm.valid) {
      if (this.resetForm.value.newPassword === this.resetForm.value.confirmPassword) {
        alert('Password updated successfully!');
      } else {
        alert('New password and confirm password should same');
      }
    } else {
      alert('Please provide required values');
    }
  }
}
