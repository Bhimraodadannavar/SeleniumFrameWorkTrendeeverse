package SplitTheString;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) 
	{
		String st = "I am am from set-44 Batch";
		String[]s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<>();

		for(int i=s.length-1;i>=0;i--)
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
			System.out.println(str+"  is repeating  "+count+"  times");

		}

	}

}
