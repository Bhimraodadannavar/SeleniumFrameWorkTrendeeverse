package JavaPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcepts 
{
	public static void main(String[] args) 
	{
//	
//		Hashtable<Integer, String> htable= new Hashtable<>();
//		htable.put(20, "Hello");
//		htable.put(10, "hi");
//		htable.put(30, "heyy");
//		htable.put(50, "heyy");//duplicate valus are allowed
//		htable.put(60, "hooo");
//		//htable.put(null, "hooo");//one null key not allowed
//		//htable.put(60,null);//null value not allowed
//		System.out.println(htable);
//		System.out.println(htable.remove(10));
//		System.out.println(htable.contains("Hello"));
//		System.out.println(htable.containsKey(50));
//		System.out.println(htable.get(30));
//		
//		for( Entry<Integer, String> m:htable.entrySet())//fetching element one by one
//		{
//			System.out.println(m.getKey()+"   "+m.getValue());
//		}
//		
		//HashMap
		
//		HashMap<Integer, String> Hmap= new HashMap<>();
//		Hmap.put(20, "Hello");
//		Hmap.put(10, "hi");
//		Hmap.put(30, "heyy");
//		Hmap.put(50, "heyy");//duplicate valus are allowed
//		Hmap.put(60, "hooo");
//		Hmap.put(null, "hooo");   //only one null key not allowed
//		//htable.put(60,null);//null value not allowed
//		Hmap.put(40,null); //multiple values are allowed
//		Hmap.put(80, null);//multiple values are allowed 
//		System.out.println(Hmap);
//		System.out.println(Hmap.remove(10));
//		System.out.println(Hmap.containsValue("Hello"));
//		System.out.println(Hmap.containsKey(50));
//		System.out.println(Hmap.get(30));
//		
//		for( Entry<Integer, String> m:Hmap.entrySet())//fetching element one by one
//		{
//			System.out.println(m.getKey()+"   "+m.getValue());
//		}
		
		//LinkedHashMap
		
//		LinkedHashMap<Integer, String> LHmap= new LinkedHashMap<>();
//		LHmap.put(20, "Hello");
//		LHmap.put(10, "hi");
//		LHmap.put(30, "heyy");
//		LHmap.put(50, "heyy");//duplicate values are allowed
//		LHmap.put(60, "hooo");
//		LHmap.put(null, "hooo");   //only one null key not allowed
//		//htable.put(60,null);//null value not allowed
//		LHmap.put(40,null); //multiple values are allowed
//		LHmap.put(80, null);//multiple values are allowed 
//		System.out.println(LHmap);
//		System.out.println(LHmap.remove(10));
//		System.out.println(LHmap.containsValue("Hello"));
//		System.out.println(LHmap.containsKey(50));
//		System.out.println(LHmap.get(30));
//		
//		for( Entry<Integer, String> m:LHmap.entrySet())//fetching element one by one
//		{
//			System.out.println(m.getKey()+"   "+m.getValue());
//		}
//		
//		//TreeMap
		
		TreeMap<Integer, String> TMap= new TreeMap<>();
		TMap.put(20, "Hello");
		TMap.put(10, "hi");
		TMap.put(30, "heyy");
		TMap.put(50, "heyy");//duplicate values are allowed
		TMap.put(60, "hooo");
		//TMap.put(null, "hooo");   //null keys are not allowed
		//htable.put(60,null);//null value not allowed
		TMap.put(40,null); //multiple values are allowed
		TMap.put(80, null);//multiple values are allowed 
		System.out.println(TMap);
		System.out.println(TMap.remove(10));
		System.out.println(TMap.containsValue("Hello"));
		System.out.println(TMap.containsKey(50));
		System.out.println(TMap.get(30));
		
		for( Entry<Integer, String> m:TMap.entrySet())//fetching element one by one
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		
	}
	
	

}
