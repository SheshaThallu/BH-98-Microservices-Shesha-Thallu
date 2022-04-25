package Assignments;
public class TestObjectClass1{

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Rajesh");
		System.out.println(emp1);
		Employee emp2 = new Employee(101,"Rajesh");
		System.out.println(emp2);

		System.out.println(emp1.equals(emp2));

		//if two objects are equal will they have same hascode or different?
		//yes

		//if two objects are different will they have same hashcode?
		//may or may not have same hashcode


	}

}