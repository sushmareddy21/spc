import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Parent } from '../Parent';
import { ParentserviceService } from '../ParentserviceService';
import { User } from '../user';
@Component({
  selector: 'app-add-parent',
  templateUrl: './add-parent.component.html',
  styleUrls: ['./add-parent.component.css']
})
export class AddParentComponent implements OnInit {

  alert:boolean=false;
  user:User=new User(0,"","");
  createdParent:Parent=new Parent("","","","",this.user);
  createdFlag:boolean=false;
  service:ParentserviceService;
  router:Router;
  constructor(service:ParentserviceService,router:Router) {
    this.service=service;
    this.router=router;
   }

  ngOnInit(): void {
  }
  add(data:any){
    console.log(data.user);
    //this.user.userId=data.userId;
    this.user.password=data.password;
    this.user.role=data.role;
    this.createdParent=new Parent(data.userId,data.parentName,data.mobileNumber,data.emailId,this.user);
    this.service.addParent(this.createdParent);
    console.log(this.createdParent);
    this.createdFlag=true;
    // this.router.navigate(['/show-all']);
    this.alert=true;
    
  }
  closeAlert()
  {
    this.alert=false;
  }
}