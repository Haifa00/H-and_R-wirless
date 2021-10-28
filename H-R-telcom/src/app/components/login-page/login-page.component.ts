import { Component, OnInit } from '@angular/core';
import { Username } from '../../models/UserName';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  loginName:Username ={
    name:"",
    password:0

  };

  constructor() { }

  ngOnInit(): void {
  }
  

}
