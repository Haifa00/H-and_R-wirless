import { Plan } from "./Plan";

// Define the Bill object by the attribute in the database table
export class Bill{

    IdBill?: number; // the id is generated from the database so we wont always have it?
    totalCost: number; // totalCost = plan[0].cost + plan[1].cost + .....
    plans?: Plan[]; // each bill can have many plans

    // the user can have no plans so it can be undefined
    constructor(plans?:Plan[] ){
        this.totalCost = 0;
        plans?.forEach( (plan:Plan,) => { 
            this.plans?.push(plan);
            this.totalCost += plan.planCost; // summing the costs of all the users plans to create the bill total
        }, this.plans);
    }
}