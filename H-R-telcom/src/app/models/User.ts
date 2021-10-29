import { UserPlan } from "./userPlan";


// Define the User object by the attribute in the database table
export class User { 
	userId?: number; 
	firstname?: string;
	lastname?: string;
    username: any; // Optional
    password?: any; 
    // add array of user plans because every user may has more than one
    userPlans:UserPlan[];


    

    constructor(firstname:string,lastname:string,username:any,password:any,userPlans:UserPlan[]){
        this.firstname=firstname;
        this.lastname=lastname;
        this.username=username;
        this.password=password;
        this.userPlans=userPlans;

    }
}