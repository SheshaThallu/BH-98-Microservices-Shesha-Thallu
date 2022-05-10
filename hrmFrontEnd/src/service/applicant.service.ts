import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Applicant } from 'src/model/applicant';
@Injectable({
  providedIn: 'root'
})
export class ApplicantService 
{
	applicantUrl!:string;
  	constructor(private http: HttpClient) 
  	{
		this.applicantUrl = 'http://localhost:8080/applicants';
 	}
 	public findAll():Observable<Applicant[]>
 	{
		return this.http.get<Applicant[]>(this.applicantUrl);
	}
}
