package TestStream;
import java.util.Arrays;
import java.util.List;
public class FullName 
{
	public static void main(String[] args) 
	{
		List<String> mylist1 = Arrays.asList("adinarayana","ganesh","raju");
		List<String> mylist2 = Arrays.asList("kuruva","renikunta","bhashabathini");
		mylist1.stream().map(x -> x + mylist2.get(mylist1.indexOf(x))).forEach(x -> System.out.println(x));
	}
}