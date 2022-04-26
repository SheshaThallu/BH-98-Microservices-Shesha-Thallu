package Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student3{
	private int id;
	private String name;
	private Department dept;;
	private int cmarks,pmarks,mmarks,total;
	
	public Student3(int id, String name, Department dept, int cmarks, int pmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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

	public Department getDept_id() {
		return dept;
	}

	public void setDept_id(Department dept) {
		this.dept = dept;
	}

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", dept_id=" + dept + "]";
	}
}

class Department
{
	private int id;
	private String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}

public class TestStudentDepartment {

	public static void main(String[] args) {
		
		Department dpt1 = new Department(111, "First");
		Department dpt2 = new Department(222, "Second");
		Department dpt3 = new Department(333, "Third");
		
		Student3 s1 = new Student3(101,"Sumit",dpt1,90,95,93);
		Student3 s2 = new Student3(102,"Rajesh",dpt1,87,95,93);
		Student3 s3 = new Student3(103,"Suraj",dpt2,66,95,78);
		Student3 s4 = new Student3(104,"Tom",dpt2,79,95,93);
		Student3 s5 = new Student3(105,"Shiva",dpt2,90,78,93);
		Student3 s6 = new Student3(106,"Jay",dpt3,90,95,93);
		Student3 s7 = new Student3(107,"Sagar",dpt3,83,67,93);
		
		
		
		
		List<Student3> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		List<Department> departments = Arrays.asList(dpt1,dpt2,dpt3);
		
		for(Student3 st:students)
			st.setTotal(st.getCmarks()+st.getMmarks()+st.getPmarks());
		
		
		Map<Department, List<Student3>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student3::getDept_id));

		System.out.println(studentDeptWise);
		for(List<Student3> st:studentDeptWise.values()) {
			Optional<Student3> studentDeptWise2 = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student3::getTotal)));
		
		System.out.println(studentDeptWise2);
		}
	}

}