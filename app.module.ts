import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactusFormComponent } from './contactus-form/contactus-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { SignupPageComponent } from './signup-page/signup-page.component';
import { AddParentComponent } from './add-parent/add-parent.component';
import { HttpClientModule } from '@angular/common/http';
import { ShowStudentComponent } from './show-student/show-student.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactusFormComponent,
    LoginComponent,
    SignupPageComponent,
    AddParentComponent,
    ShowStudentComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }