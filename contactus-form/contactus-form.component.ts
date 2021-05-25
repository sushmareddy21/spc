import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'contactus-form',
  templateUrl: './contactus-form.component.html',
  styleUrls: ['./contactus-form.component.css']
})
export class ContactusFormComponent implements OnInit {
  data:any;
 constructor() {}

 ngOnInit(){
   
}
Registers(regForm:NgForm)
{
  if(regForm.valid)
  {
this.data=regForm.value;
  }

}
}
