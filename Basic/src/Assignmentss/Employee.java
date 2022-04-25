package Assignmentss;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private double commision;
	private String designation;
	private double bonus;
	Employee(int id, String name, double salary, double commision, String designation)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commision = commision;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
