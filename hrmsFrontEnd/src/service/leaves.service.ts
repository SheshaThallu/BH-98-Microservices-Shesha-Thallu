import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Leaves } from 'src/model/leaves';

@Injectable({
	providedIn: 'root'
})
export class LeavesService {
	private baseURL = "http://3.110.105.245:8080/leaves";
	constructor(private httpClient: HttpClient) { }
	getLeaves():Observable<Leaves[]>
	{
		return this.httpClient.get<Leaves[]>(`${this.baseURL}`);
	}
	createLeaves(leaves: Leaves): Observable<Object> {
		return this.httpClient.post(`${this.baseURL}`, leaves);
	}
	getLeavesByEmpIdAndYearAndMonth(empId: number, year: number, month: number): Observable<Leaves>{
		return this.httpClient.get<Leaves>(`${this.baseURL}/${empId}/${year}/${month}`);
	}
}
