import { Component, OnInit } from '@angular/core';
import { User } from '../../models/User';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  loginName:User ={
    firstname:"",
    lastname:"",
    username:"",
    password:"",
    userPlans:[]
  }


  

  constructor() { }

  ngOnInit(): void {
  }
  

}
