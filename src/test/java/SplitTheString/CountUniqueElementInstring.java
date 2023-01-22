package SplitTheString;

import java.util.LinkedHashSet;

public class CountUniqueElementInstring 
{
	public static void main(String[] args) 
	{
		String st="I am am from SDET-44 Batch";
		String[] s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		for(String str:set)
		{
			int count = 0;
			for(int i=0;i<s.length;i++)
			{
				if(str.equals(s[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str+" is repeating"+count+" times");
			}
		}

	}

}
