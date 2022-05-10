import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplicantListComponent } from './applicant-list/applicant-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

const routes: Routes = [
	{
		path:'employees', component: EmployeeListComponent
	},
	{
		path:'applicants', component: ApplicantListComponent
	}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
