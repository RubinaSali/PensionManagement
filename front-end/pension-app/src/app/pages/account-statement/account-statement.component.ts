import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-account-statement',
  templateUrl: './account-statement.component.html',
  styleUrls: ['./account-statement.component.css']
})
export class AccountStatementComponent implements OnInit {

  constructor() { }
  
  accountData = [
    {
      date: '01/01/2022',
      userName: 'Peter Parker',
      accountNumber: '76323717',
      accountType: 'Savings',
      balance: '10,000.00'
    },
    {
      date: '08/01/2022',
      userName: 'Mary Johnson',
      accountNumber: '76534234',
      accountType: 'Savings',
      balance: '8,300.00'
    },
    {
      date: '08/01/2022',
      userName: 'Jessica Griffin',
      accountNumber: '86429301',
      accountType: 'Current',
      balance: '14,640.00'
    },
    {
      date: '08/01/2022',
      userName: 'Carlos Evans',
      accountNumber: '72915629',
      accountType: 'Savings',
      balance: '6,300.00'
    },
    {
      date: '08/01/2022',
      userName: 'Laura Price',
      accountNumber: '23016296',
      accountType: 'Savings',
      balance: '12,900.00'
    },
    {
      date: '08/01/2022',
      userName: 'Willie Powell',
      accountNumber: '10249263',
      accountType: 'Current',
      balance: '10,850.00'
    },
    {
      date: '08/01/2022',
      userName: 'Judy Howard',
      accountNumber: '92640363',
      accountType: 'Savings',
      balance: '15,900.00'
    },
    {
      date: '08/01/2022',
      userName: 'Linda Torres',
      accountNumber: '36402741',
      accountType: 'Savings',
      balance: '6,990.00'
    },
    {
      date: '08/01/2022',
      userName: 'Jack Rivera',
      accountNumber: '29361046',
      accountType: 'Savings',
      balance: '18,500.00'
    },
    {
      date: '08/01/2022',
      userName: 'Lisa Peterson',
      accountNumber: '37401739',
      accountType: 'Current',
      balance: '20,000.00'
    }
  ]

  ngOnInit(): void {    
  }

}
