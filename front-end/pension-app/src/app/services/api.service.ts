import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  //HTTP client

  constructor(private http: HttpClient) { }

  API_URL = 'http://localhost:8090';

  login(data: any) {
    let request = {
      username: 'sanjani',
      password: '123'
    }
    return this.http.post(`${this.API_URL}/api/user/login`, data);
  }

  register(data: any) {
    let request = {
      fullName: '',
      phoneNumber: '',
      username: 'sanjani',
      password: '123'
    }
    return this.http.post(`${this.API_URL}/api/user/register`, data);
  }

  getPersonalDetail() {
    return this.http.get(`${this.API_URL}/api/user/getPersonalDetail`);
  }

  personalDetail(data: any){
    let request ={
      id: '',
      title: '',
      firstName: '',
      lastName: '',
      fatherName: '',
      mobileNumber: '',
      email: '',
      aadhar: '',
      dateOfBirth: '',
      residentialAddress: '',
      permanentAddress: ''
    }
    return this.http.post(`http://localhost:8091/user/updatePersonalDetail/${sessionStorage.getItem("username")}`, data);
  }

  getAccountDetail(){
    return this.http.get(`${this.API_URL}/api/account/getAccountDetail`);
  }

  accountDetail(data: any){
    let request ={
      id: '',
      accountHolderName: '',
      accountNumber: '',
      accountType: '',
      bankName: '',
      branch: '',
      ifscCode: '',
      panNumber: '',
      netSalary: ''
    }
    return this.http.post(`http://localhost:8089/user/user/updateAccountDetail`, data);
  }

  getAccountStatement(){
    return this.http.get(`${this.API_URL}/api/account/getAccountStatement`);
  }

  getPensionStatement(){
    return this.http.get(`${this.API_URL}/api/pension/getPensionStatement`);
  }
}
