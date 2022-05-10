import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from 'src/model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
	

  	employeeUrl!:string;
  	constructor(private http: HttpClient) 
  	{
		this.employeeUrl = 'http://localhost:8080/employees';
 	}
 	public findAll(): Observable<Employee[]>
 	{
		return this.http.get<Employee[]>(this.employeeUrl);
	}
	createEmployee(employee: Employee) {
		this.http.post('http://localhost:8080/addemployee',employee);
	}
	deleteEmployeeById(id:string)
	{
		this.http.delete('http://localhost:8080/deleteemployee/${'+id+'}');
	}
}
