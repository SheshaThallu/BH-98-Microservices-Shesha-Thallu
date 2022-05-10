import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/model/employee';
import { EmployeeService } from 'src/service/employee.service';

@Component({
	selector: 'app-employee-list',
	templateUrl: './employee-list.component.html',
	styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

	employees!: Employee[];
	constructor(private employeeService: EmployeeService) { }

	ngOnInit(): void {
		this.employeeService.findAll().subscribe(
			data => {
				this.employees = data;
			});
	}
	createEmployee() {
		let name = (<HTMLInputElement>document.getElementById('name')).value;
		let email = (<HTMLInputElement>document.getElementById('email')).value;
		let address = (<HTMLInputElement>document.getElementById('address')).value;
		let department = (<HTMLInputElement>document.getElementById('department')).value;
		let contactNo = (<HTMLInputElement>document.getElementById('contactNo')).value;
		let joiningDate = (<HTMLInputElement>document.getElementById('joiningDate')).value;

//		let employee = new Employee(name,email,address,department,contactNo,joiningDate);
//		this.employeeService.createEmployee(employee);
	}
	deleteEmployee(employee:Employee){
		this.employeeService.deleteEmployeeById(employee.id);
	}
}
