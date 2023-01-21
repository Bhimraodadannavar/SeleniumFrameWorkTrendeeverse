package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInAnStringSplit 
{
	public static void main(String[] args) 
	{
		String st="i am am from sdet-44";
		String[]s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);

		}
		for(String ch:set)
		{
			System.out.print(ch+" ");
		}


	}
}
