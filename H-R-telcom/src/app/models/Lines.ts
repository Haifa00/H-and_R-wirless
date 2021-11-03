import { Device } from "./Device";



export class Lines{
    lineId?: number;// the id is generated from the database so we wont always have it?
    phoneNumber? : number;
    userPlanId?:number;
    device_Id?:number; // may the line has a device



    constructor(phoneNumber?:number,userPlanId?:number, device_Id?:number, line_Id?:number){
        this.lineId = line_Id;
        this.phoneNumber = phoneNumber;
        this.userPlanId = userPlanId;
        this.device_Id = device_Id;
    }
    
}