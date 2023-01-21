package Strings;

import java.util.LinkedHashSet;

public class ToPrintPositionOfEachCharacterWithoutDuplicate 
{
	public static void main(String[] args) 
	{
		String st = "Tester";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for( Character ch:set)
		{
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"is in"+(i+1));
					break;
				}
			}
		}
	}
}
