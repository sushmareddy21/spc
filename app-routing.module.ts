import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddParentComponent } from './add-parent/add-parent.component';
import { ContactusFormComponent } from './contactus-form/contactus-form.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupPageComponent } from './signup-page/signup-page.component';
const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'aboutus',component:AboutComponent},
  {path:'contactus-form',component:ContactusFormComponent},
  {path:'login',component:LoginComponent},
  {path:'signup-page',component:SignupPageComponent},
  {
    path:'add-parent', component:AddParentComponent
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }