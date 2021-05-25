import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from '@angular/common/http';
import { User } from "./user";
import { Parent } from './Parent';



const baseURL = 'http://localhost:8092/parent';

@Injectable({
    providedIn: 'root'
  })
  export class ParentserviceService{
      http: HttpClient;
      parents:Parent[]=[];
      user:User=new User(0,"","");
      parent:Parent=new Parent("","","","",this.user);
      constructor(http:HttpClient) {
        this.http = http;
       }
       sendPost(cust:Parent){
        const headers = { 'content-type': 'application/json'};
        const body=JSON.stringify(cust);  
        console.log('---------');
        console.log(body);
       let id = cust.userId;
        this.http.post('http://localhost:8092/parent/add/'+ id ,body,{'headers':headers}).subscribe(
       data=>{
         let dataVal = Object.values(data);
         cust.userId=dataVal[0];
       }
     );
     }
     sendPut(cust:Parent){
      const headers = { 'content-type': 'application/json'};
      const body=JSON.stringify(cust);  
      console.log('---------');
      console.log(body);
      this.http.put('http://localhost:8092/parent/update/id',body,{'headers':headers}).subscribe(
     data=>{
       let dataVal = Object.values(data);
       cust.userId=dataVal[0];
     }
   );
   }
  read(id:any): Observable<any> {
    
    return this.http.get(`http://localhost:8092/parent/view/`+id);
  }
       addParent(cust:Parent){
           this.parents.push(cust);
           this.sendPost(cust);
       }
     
      
      getParents():Parent[]{
        return this.parents;
      }
      fetchParents(){
        this.parents=[];
        this.http.get<Parent[]>("http://localhost:8092/parent/findall").subscribe(
          data=>{
           // console.log('data: '+data); 
            this.convert(data);}
        );
      }
      convert(data:any){
        for(let c of data){
          let cust=new Parent(c.userId,c.parentName,c.mobileNumber,c.emailId,c.user);
          console.log('all----');
          this.parents.push(cust);
        }
      }
      // getCustomer(id:any):Observable<any>{
      //   return this.http.get
      // }
      updateParent(id:String,value:any):Observable<any>{
        return this.http.put(`http://localhost:8092/customer/update/`+id,value);
      }
  }