import { Component, OnInit } from '@angular/core';
import { Leaves } from 'src/model/leaves';
import { LeavesService } from 'src/service/leaves.service';

@Component({
	selector: 'app-leaves',
	templateUrl: './leaves.component.html',
	styleUrls: ['./leaves.component.css']
})
export class LeavesComponent implements OnInit {
	leaves!: Leaves[];
	constructor(private leavesService: LeavesService) { }

	ngOnInit(): void {
		this.getLeaves();
	}
	private getLeaves()
	{
		this.leavesService.getLeaves().subscribe(
			data => {
				this.leaves = data;
			});
	}

}
