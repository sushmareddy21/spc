import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ParentserviceService } from './ParentserviceService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'spc';

  router:Router;
  service:ParentserviceService;
  constructor(service:ParentserviceService,router:Router){
    this.service = service;
    this.router = router;
}
}