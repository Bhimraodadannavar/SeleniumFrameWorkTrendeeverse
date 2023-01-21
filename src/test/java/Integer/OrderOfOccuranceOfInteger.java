package Integer;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfInteger 
{
	public static void main(String[] args) 
	{
		int[] s={5,6,6,7,1,5,0};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();

		for(int i=s.length-1;i>=0;i--)
		{
			set.add(s[i]);
		}
		for(int in:set)
		{
			int count = 0;
			for(int i=0;i<s.length;i++)//for(int i=0;i<s.length;i++)
			{
				if(in==s[i])
				{
					count++;
				}
			}
			System.out.println(in+" = is repeating "+count+"  times");

		}

	}
}