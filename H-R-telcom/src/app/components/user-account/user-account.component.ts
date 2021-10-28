import { Component, Input, OnInit } from '@angular/core';
import {ACCOUNT} from '../../models/user-table';
import{WORKACCOUNT} from '../../models/user-table'



@Component({
  selector: 'app-user-account',
  templateUrl: './user-account.component.html',
  styleUrls: ['./user-account.component.css']
})
export class UserAccountComponent implements OnInit {

  accountInfo = ACCOUNT;
  workInfo=WORKACCOUNT;

  constructor() { }

  ngOnInit(): void {
  }

}
