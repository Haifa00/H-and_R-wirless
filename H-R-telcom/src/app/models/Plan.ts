// Define the Plan object by the attribute in the database table
export class Plan{

    planId?: number;// the id is generated from the database so we wont always have it?
    numberOfDevices: number;
    planCost: number;
    callMinutes: number;
    textAmount: number;
    internetData: number;

    constructor(numberOfDevices: number, planCost: number, callMinutes: number, textAmount: number, internetData: number){
        this.numberOfDevices = numberOfDevices;
        this.planCost = planCost;
        this.callMinutes = callMinutes;
        this.textAmount = textAmount;
        this.internetData = internetData;
    }
}