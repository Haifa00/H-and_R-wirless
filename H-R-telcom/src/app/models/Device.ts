import { PhoneNumber } from "./phoneNumber";

// Define the Device object by the attribute in the database table
export class Device {
	deviceID?: number;// the id is generated from the database so we wont always have it?
	deviceName: string;
	specialFeature: string;
    phoneNumber?: PhoneNumber;

	// SpecialFeature is optional and a device does not always a phonenumber so phoneNumber is also optional
	constructor(deviceName:string, specialFeature = '', phoneNumber?:PhoneNumber) {
		this.deviceName = deviceName;
		this.specialFeature = specialFeature;
        this.phoneNumber = phoneNumber;
	}
}