package Assignments;
import java.util.Scanner;
public class CalGrades 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int marks = sc.nextInt();
		sc.close();
		if(marks>100)
			System.out.println("Invalid");
		else if(marks>=90)
			System.out.println("Grade - A");
		else if(marks>=80)
			System.out.println("Grade - B");
		else if(marks>=70)
			System.out.println("Grade - C");
		else
			System.out.println("Fail");
	}
}
