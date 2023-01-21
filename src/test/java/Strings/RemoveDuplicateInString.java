package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInString
{
	public static void main(String[] args) 
	{
		String st = "Tester";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));

		}
		for(Character ch:set)
		{
			System.out.print(ch+" ");
		}

	}
}
