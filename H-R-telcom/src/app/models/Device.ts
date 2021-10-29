
// Define the Device object by the attribute in the database table
export class Device {
	deviceID?: number;// the id is generated from the database so we wont always have it?
	deviceModel: any;
	price: number;

	constructor(deviceModel:any, price:number) {
		this.deviceModel = deviceModel;
		this.price = price;
	}
}

// fill database devices 