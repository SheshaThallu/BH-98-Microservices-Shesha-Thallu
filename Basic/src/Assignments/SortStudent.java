package Assignments;

public class SortStudent 
{
	static Student[] sort(Student[] st)
	{
		for(int i = 0; i < st.length; i++)
		{
			for(int j = i + 1; j < st.length; j++)
			{
				if(st[i].getRollNo()>st[j].getRollNo())
				{
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		return st;
	}
	public static void main(String[] args) 
	{
		Student st1 = new Student(104, "Raju");
		Student st2 = new Student(103, "Adi");
		Student st3 = new Student(102, "Ganesh");
		Student[] st = {st1, st2, st3}; 
		
		for(int i = 0; i < st.length; i++)
		{
			System.out.println(st[i].getRollNo());
		}
		
		sort(st);
		
		System.out.println("----------");
		for(int i = 0; i < st.length; i++)
		{
			System.out.println(st[i].getRollNo());
		}
	}
}
