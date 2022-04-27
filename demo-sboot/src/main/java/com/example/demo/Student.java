package com.example.demo;


public class Student 
{
	private long marks;
	private String name;
	public Student(long marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
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
