import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user-service';

@Component({
  selector: 'app-signup-page',
  templateUrl: './signup-page.component.html',
  styleUrls: ['./signup-page.component.css']
})
export class SignupPageComponent implements OnInit {
  data: any;
  empty:boolean = false;
  userservice:UserService;
  user:any;
  login()
{
  this.router.navigate(['login']);
}


  constructor(private router:Router, userservice:UserService) { 
    this.userservice=userservice;

  }

  ngOnInit(): void {
  }
  signupUser(fm:any){
    this.user = new User(0,fm.password,fm.role);
    console.log(fm.password + " "+fm.role);
    console.log("**" +this.user );
    //console.log(fm.value.roleselect.value);
    this.userservice.createUser(this.user);
  }
}