package AssignmentsCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ArrayEvenFilter 
{
	static List<Integer> filterEven(List<Integer> list)
	{
		//List<Integer> resList = new ArrayList<>();
		List<Integer> resList = new LinkedList<>();
		for(Integer number:list)
		{
			if(number % 2 == 0)
				resList.add(number);
		}
		return resList;
	}
	public static void main(String[] args) 
	{
		//List<Integer> myList = new ArrayList<>();
		List<Integer> myList = new LinkedList<>();
		myList.add(3);
		myList.add(45);
		myList.add(23);
		myList.add(78);
		myList.add(44);
		myList.add(34);
		myList.add(88);
		List<Integer> res = filterEven(myList);
		Iterator<Integer> itr = res.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}