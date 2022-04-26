package AssignmentDateTimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMonths 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("May","June","April","January");
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				try {
					SimpleDateFormat sdformat = new SimpleDateFormat("MMM");
					return sdformat.parse(o1).compareTo(sdformat.parse(o2)); 
				} catch (ParseException ex) {
					return o1.compareTo(o2);
				}
			}
		});
		System.out.println(list);
	}
}
