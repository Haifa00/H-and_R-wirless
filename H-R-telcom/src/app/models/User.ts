import { Bill } from "./Bill";
import { Device } from "./device";

// Define the User object by the attribute in the database table
export class User { 
	userName: string; 
	firstName: string;
	lastName: string;
    email?: string; // Optional
    bill: Bill; // Every user has a bill, each bill will hold the plans the user has
    devices?: Device[]; // '?' means that the user does not have to have a number of devices(it could be undefined)

	// cunstructor to be called when we create a user, email is given default value because it is optional to the user
	constructor(userName:string, firstName:string, lastName:string, email = '', bill = new Bill(), devices?:Device[]) {
		this.userName = userName; 
		this.firstName = firstName;
		this.lastName = lastName;
        this.email = email;
        this.bill = bill; // we should probably deconstruct this into this.bill.IdBill = bill.IdBill, this.bill.plans[] = bill.plans[]
        // if the devices array passed in the constructor is not empty, for each device int he array we push it to 'this' users devices array
        devices?.forEach( (device:Device,) => { 
            this.devices?.push(device);
        }, this.devices);
	}
}