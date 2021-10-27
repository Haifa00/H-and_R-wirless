export class PhoneNumber{
    phoneNumberId?: number;// the id is generated from the database so we wont always have it?
    Pnumber: string;


    constructor(Pnumber:string, phoneNumberId?:number ){
        this.phoneNumberId = phoneNumberId;
        this.Pnumber = Pnumber;
    }
}