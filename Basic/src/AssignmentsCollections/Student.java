package AssignmentsCollections;

public class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override public String toString()
    {
        return "[ rollno=" + rollNo + ", name="+ name +"]";
    }
	@Override public int compareTo(Student comparestu)
    {
        int compareRollNo = comparestu.getRollNo();
        return this.getRollNo() - compareRollNo;
    }
}
