package Assignmentss;

public class EmployeeUtility 
{
	static Employee bonusCalculator(Employee emp)
	{
		if(emp.getDesignation().equals("Manager"))
		{
			emp.setBonus((emp.getSalary()*30)/100);
			return emp;
		}
		else if(emp.getDesignation().equals("Lead"))
		{
			emp.setBonus((emp.getSalary()*25)/100);
			return emp;
		}
		else
		{
			emp.setBonus((emp.getSalary()*20)/100);
			return emp;
		}
	}
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(101, "Raju", 50000.0, 2000.0, "Manager");
		Employee emp2 = new Employee(101, "Ganesh", 40000.0, 1000.0, "Lead");
		Employee emp3 = new Employee(101, "Adhi", 30000.0, 500.0, "Associate");
		System.out.println(bonusCalculator(emp1).getBonus()+emp1.getSalary()+emp1.getCommision());
		System.out.println(bonusCalculator(emp2).getBonus()+emp2.getSalary()+emp2.getCommision());
		System.out.println(bonusCalculator(emp3).getBonus()+emp3.getSalary()+emp3.getCommision());
	}
}
