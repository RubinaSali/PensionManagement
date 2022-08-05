import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { PersonalDetail } from 'src/app/personalDetail';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-personal-detail',
  templateUrl: './personal-detail.component.html',
  styleUrls: ['./personal-detail.component.css']
})
export class PersonalDetailComponent implements OnInit {

  detail: PersonalDetail = new PersonalDetail();
  personalDetailsForm = new FormGroup({
    title: new FormControl(null, Validators.required),
    firstName: new FormControl(null, Validators.required),
    lastName: new FormControl(null, Validators.required),
    fatherName: new FormControl(null, Validators.required),
    mobile: new FormControl(null, Validators.required),
    email: new FormControl(null, Validators.required),
    aadhaar: new FormControl(null, Validators.required),
    dob: new FormControl(null, Validators.required),
    residentialAddress: new FormControl(null, Validators.required),
    permanentAddress: new FormControl(null, Validators.required)
  });

  constructor(private service: ApiService) { }

  ngOnInit(): void {
  }

  onSubmit($event: any) {
    this.detail.firstname =  this.personalDetailsForm.value.firstName;
    this.detail.lastname =  this.personalDetailsForm.value.lastName; 
    this.detail.fatherName =  this.personalDetailsForm.value.fatherName;
    this.detail.mobileNumber =  this.personalDetailsForm.value.mobile;
    this.detail.email =  this.personalDetailsForm.value.email;
    this.detail.aadharNumber =  this.personalDetailsForm.value.aadhaar;
    this.detail.dateOfBirth =  this.personalDetailsForm.value.dob;
    this.detail.residentialAddress =  this.personalDetailsForm.value.residentialAddress;
    this.detail.permanentAddress =  this.personalDetailsForm.value.permanentAddress;
    this.detail.id =  sessionStorage.getItem("username");
    // if (this.personalDetailsForm.valid) {
      this.service.personalDetail(this.detail).subscribe(
        result => alert('Updated Successfully'),
        error => alert("Something went wrong!")
      )
  }
}
