import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { AccountDetail } from 'src/app/accountDetail';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-account-detail',
  templateUrl: './account-detail.component.html',
  styleUrls: ['./account-detail.component.css']
})
export class AccountDetailComponent implements OnInit {

  detail: AccountDetail = new AccountDetail();
  accountDetailsForm = new FormGroup({
    holderName: new FormControl(null, Validators.required),
    bankName: new FormControl(null, Validators.required),
    accountNumber: new FormControl(null, Validators.required),
    branch: new FormControl(null, Validators.required),
    accountType: new FormControl(null, Validators.required),
    ifsc: new FormControl(null, Validators.required),
    pan: new FormControl(null, Validators.required),
    salary: new FormControl(null, Validators.required)
  });

  constructor(private service: ApiService) { }

  ngOnInit(): void {
  }

  onSubmit($event: any) {
    this.detail.id = sessionStorage.getItem("username");
    this.detail.accountHolderName = this.accountDetailsForm.value.holderName;
    this.detail.bankName = this.accountDetailsForm.value.bankName;
    this.detail.branch = this.accountDetailsForm.value.branch;
    this.detail.accountType = this.accountDetailsForm.value.accountType;
    this.detail.ifscCode = this.accountDetailsForm.value.ifsc;
    this.detail.panNumber = this.accountDetailsForm.value.pan;
    this.detail.netSalary = this.accountDetailsForm.value.salary;
    this.detail.accountNumber = this.accountDetailsForm.value.accountNumber;

    this.service.accountDetail(this.detail).subscribe(
      result => alert("Successfully Updated"),
      error => alert("Something went wrong!")
    )

  }
}
