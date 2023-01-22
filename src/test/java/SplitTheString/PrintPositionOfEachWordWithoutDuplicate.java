package SplitTheString;

import java.util.LinkedHashSet;

public class PrintPositionOfEachWordWithoutDuplicate 
{
	public static void main(String[] args) 
	{

		String st="I am am from SDET-44";
		String[]	s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();

		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String str:set)
		{
			for(int i=0;i<s.length;i++)
			{
				if(str.equals(s[i]))
				{
					System.out.println(str+" is in "+(i+1));
					break;
				}
			}
		}
	}
}