import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from 'src/app/services/api.service';
import { User } from 'src/app/User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user:User = new User();

  registerForm = new FormGroup({
    fullName: new FormControl(null, Validators.required),
    username: new FormControl(null, Validators.required),
    password: new FormControl(null, Validators.required)
  });

  constructor(
    private router: Router,
    private apiService: ApiService
  ) { }

  ngOnInit(): void {
  }

  onSubmit($event: any) {
    this.apiService.login('test');
    console.log('onSubmit', this.registerForm?.value);
    this.user.fullName = this.registerForm?.value?.fullName;
    this.user.userName = this.registerForm?.value?.username;
    this.user.password = this.registerForm?.value?.password;
    if (!this.user.fullName) {
      alert('Please provide full name');
    } else if (!this.user.userName) {
      alert('Please provide username');
    } else if (!this.user.password) {
      alert('Please provide password');
    }  else {
      this.apiService.register(this.user).subscribe(
        result => console.log(result),
        error => alert("Error Occured")
      )
      this.router.navigate(['/login']);
    }
  }

  onLogin() {
    this.router.navigate(['/login']);
  }
}
