package AssignmentsCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortCustomers 
{
	static Map<CreditCard,Customer> sortMap(Map<CreditCard,Customer> usmap)
	{
		List<CreditCard> list = new LinkedList<>();
		list.addAll(usmap.keySet());
		Collections.sort(list);
		Map<CreditCard,Customer> res = new LinkedHashMap<CreditCard,Customer>();
		for(CreditCard creditCard:list)
		{
			res.put(creditCard, usmap.get(creditCard));
		}
		return res;
	}
	
	
//	static List<CreditCard> sortKeys(Set<CreditCard> keyset)
//	{
//		List<CreditCard> list = new LinkedList<>();
//		list.addAll(keyset);
//		Collections.sort(list);
//		return list;
//	}
	
	
	public static void main(String[] args) 
	{
		Map<CreditCard,Customer> map = new LinkedHashMap<CreditCard,Customer>();
		
		map.put(new CreditCard(101, "Naveen", 123, 2025), new Customer("Naveen", 111));
		map.put(new CreditCard(102, "Adi", 145, 2024), new Customer("Adi", 222));
		map.put(new CreditCard(103, "Raju", 133, 2027), new Customer("Raju", 333));
		map.put(new CreditCard(104, "Ganesh", 126, 2030), new Customer("Ganesh", 444));
		map.put(new CreditCard(105, "Shesha", 134, 2022), new Customer("Shesha", 555));
		
		Map<CreditCard,Customer> resmap = new LinkedHashMap<CreditCard,Customer>();
		resmap = sortMap(map);
		
		//System.out.println(resmap);
		
		Iterator<Map.Entry<CreditCard,Customer>> itr = resmap.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<CreditCard,Customer> entry = itr.next();
			System.out.println(entry.getKey()+"  =  "+entry.getValue());
		}
//		System.out.println("\n==========================================================\n");
//		for(CreditCard cc:resmap.keySet())
//		{
//			System.out.println(cc +" = "+ resmap.get(cc));
//		}
		
//		List<CreditCard> ls = sortKeys(map.keySet());
//		for(CreditCard cc:ls)
//		{
//			resmap.put(cc, map.get(cc));
//		}
//		System.out.println(resmap);
		
	}
}



/*  1.map.keySet() -->List of CreditCard ---> Sort --->New Map(return)
    2.Based on returned map insert items into new map */
