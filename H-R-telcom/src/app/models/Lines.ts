import { Device } from "./Device";



export class Lines{
    lineId?: number;// the id is generated from the database so we wont always have it?
    phoneNumber: number;
    // userPlanId:number;
    device?:Device; // may the line has a device



    constructor(phoneNumber:number,  device?:Device){
        this.phoneNumber = phoneNumber;
        // this.userPlanId = userPlanId;
        this.device=device;
    }
}