package AssignmentsCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortStudent 
{
	public static void main(String[] args) 
	{
		
		//List<Student> stList = new ArrayList<>();
		List<Student> stList = new LinkedList<>();
		stList.add(new Student(104, "Raju"));
		stList.add(new Student(103, "Adi"));
		stList.add(new Student(102, "Ganesh"));
		
		for(Student st:stList)
		{
			System.out.println(st);
		}
		
		Collections.sort(stList);
		
		System.out.println("----------");
		for(Student st:stList)
		{
			System.out.println(st);
		}
	}
}
