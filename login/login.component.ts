import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user!: User;
  empty:boolean = false;
  userservice: UserService;
  errormsg : string = "";
signup()
{
  this.router.navigate(['signup-page']);
}


  constructor(private router:Router, userservice:UserService) {
    this.userservice=userservice;
  }

  ngOnInit(): void {
    this.errormsg = this.userservice.errormsg;
  }

  loginUser(fm:any){
    this.user = new User(fm.id,fm.password,"");
    console.log(fm.id + ' ' + fm.password);
    console.log("**" +this.user);
    this.userservice.loginUser(this.user);
    setTimeout(() => {
      if(this.user.role== "Authentication Failed"){
        this.errormsg = this.user.role;
        this.user.role="";
      }
      else{
        this.router.navigate(['add-parent']);
      }
      

    }, 3000);
  }


    

    //this.user = new User(fm.value.id,fm.value.password);
    //console.log(this.user);
  
}