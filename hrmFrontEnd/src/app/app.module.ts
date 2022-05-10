import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { ApplicantListComponent } from './applicant-list/applicant-list.component';
import { HttpClientModule } from '@angular/common/http';
import { ApplicantService } from 'src/service/applicant.service';
import { EmployeeService } from 'src/service/employee.service';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    ApplicantListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ApplicantService, EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
