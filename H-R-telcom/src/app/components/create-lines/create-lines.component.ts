import { Component, OnInit } from '@angular/core';
import { DeviceService } from 'src/app/device.service';
import { LinesService } from 'src/app/lines.service';
import { Device } from 'src/app/models/Device';
import { Lines } from 'src/app/models/Lines';
import { Plan } from 'src/app/models/Plan';

@Component({
  selector: 'app-create-lines',
  templateUrl: './create-lines.component.html',
  styleUrls: ['./create-lines.component.css']
})
export class CreateLinesComponent implements OnInit {
//array of lines instead of pn &device
   plan! : Plan;
  phoneNumbers : Number[] = [];
  devices : Device[] = [];
  lines : Lines[] = [];
 

  constructor(private lineService:LinesService, private deviceService : DeviceService ) { }

  ngOnInit(): void {
    this.lineService.generatePhoneNumbers().subscribe(result =>{
      this.phoneNumbers = result;
    })
  
  this.deviceService.getAllDevices().subscribe(result => {
    this.devices = result;
  })
for( let i = 0; i < 3; i++){
 let newLine : Lines = {
    phoneNumber: 1//this.plan.planId
  }
  this.lines.push(newLine);
}
 
}
show(){
  alert("Please choose different phonenumbers");
}
saveLines():void{

  if(this.lines.length == 3){//this.plan.numberOfLines
  for(let i = 0; i < this.lines.length; i++){
    for(let j  = i+1; j < this.lines.length; j++){
      if(this.lines[i].phoneNumber == this.lines[j].phoneNumber){
        this.show();
        return;
      }
    }
  }
    this.lineService.saveLines(this.lines).subscribe(result =>{
      this.lines = result;
      alert("Great! Your new Plan is now Ready!");

    });
  }
  
}
refreshPhoneNumbers(){
  this.lineService.generatePhoneNumbers().subscribe(result =>{
      this.phoneNumbers = result;
    })
}

// removeNumber(i : number):void{
 
//  const index = this.phoneNumbers.indexOf(i, 0);
// if (index > -1) {
//   this.phoneNumbers.splice(index, 1);
// }
//  }


}
