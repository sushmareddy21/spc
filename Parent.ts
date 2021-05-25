
import { User } from "./user";

export class Parent{
    userId:string;
    parentName:string;
    mobileNumber:string;
    emailId:string;
    user:User;
    constructor(userId:string,parentName:string,mobileNumber:string,emailId:string,user:User)
    {
        this.userId=userId;
        this.parentName=parentName;
        this.mobileNumber=mobileNumber;
        this.emailId=emailId;
        this.user=user;
    
    }
    
}