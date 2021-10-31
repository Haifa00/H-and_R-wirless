import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/User';
import { UsersService } from 'src/app/users.service';

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {
  formData : User;

  constructor(private usersService:UsersService) { 
    this.formData = new User();
  }

  

  ngOnInit(): void {
  }
  handleSubmit(): void {
  this.usersService.saveUser(this.formData).subscribe(result
  )
  };


}
function result(result: any) {
  throw new Error('Function not implemented.');
}

