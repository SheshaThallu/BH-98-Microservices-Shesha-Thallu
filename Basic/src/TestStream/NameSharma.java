package TestStream;
import java.util.Arrays;
import java.util.List;
public class NameSharma 
{
	public static void main(String[] args) 
	{
		List<String> mylist1 = Arrays.asList("adinarayana","ganesh","raju");
		mylist1.stream().map(x -> x+"sharma").forEach(x -> System.out.println(x));
		
		mylist1.stream().map(str -> { 
			String x="";
			for(int i=0; i<str.length(); i++) 
			{
				if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
				{
					x=x+str.charAt(i);
				}
	        }
			return x;
		}).forEach(x -> System.out.println(x));
	}
}
