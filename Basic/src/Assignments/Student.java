package Assignments;

public class Student 
{
	private int rollNo;
	private int marks;
	private String name;
	Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	Student(String name, int marks)
	{
		this.marks = marks;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String getGrade()
	{
		if(marks>100)
			return "Invalid Marks";
		if(marks>=90)
			return name + " got Grade - A";
		if(marks>=80)
			return name + " got Grade - B";
		if(marks>=70)
			return name + " got Grade - C";
		return name +" is Fail";
	}
}
