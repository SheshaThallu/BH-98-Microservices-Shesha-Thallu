import { Component, OnInit } from '@angular/core';
import { Applicant } from 'src/model/applicant';
import { ApplicantService } from 'src/service/applicant.service';

@Component({
  selector: 'app-applicant-list',
  templateUrl: './applicant-list.component.html',
  styleUrls: ['./applicant-list.component.css']
})
export class ApplicantListComponent implements OnInit {

	applicants!: Applicant[];
  	constructor(private applicantService: ApplicantService) { }

  	ngOnInit(): void {
		this.applicantService.findAll().subscribe(
			data => {
				this.applicants = data;
			});
  	}

}
