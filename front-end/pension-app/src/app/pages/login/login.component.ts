import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from 'src/app/services/api.service';
import { UserAuth } from '../../userAuth';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userAuth: UserAuth = new UserAuth();
  
  loginForm = new FormGroup({
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required)
  });

  get username() {
    return this.loginForm.get('username');
  }

  constructor(
    private router: Router, private service: ApiService
  ) {
    sessionStorage.clear();
   }

  ngOnInit(): void {
  }

  onSubmit($event: any) {
    this.userAuth.userName = this.loginForm.value.username;
    this.userAuth.password = this.loginForm?.value?.password;
    this.service.login(this.userAuth).subscribe(
      result => {
        sessionStorage.setItem("username",this.userAuth.userName);
        this.router.navigate(['/home']);
      }, error => {
        console.log(error);
        alert("Invalid Credentials") }
    )
      
  }

  onResetPassword() {
    this.router.navigate(['/reset-password']);
  }

  onRegister() {
    this.router.navigate(['/registration']);
  }
}
