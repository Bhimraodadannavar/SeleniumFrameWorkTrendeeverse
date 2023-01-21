package SplitTheString;

import java.util.LinkedHashSet;

public class CountTheDuplicateWordsInAnString {
	public static void main(String[] args) 
	{
		String st = "I am am from set-44 Batch";
		String[]s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		for(String ch:set)
		{
			int count=0;
			for(int i=0; i<s.length;i++)
			{
				if(ch.equals(s[i]))
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(ch+" is repeating  " +count+" times");
			}
		}
	}
}