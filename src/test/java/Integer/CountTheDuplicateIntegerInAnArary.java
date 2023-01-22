package Integer;

import java.util.LinkedHashSet;

public class CountTheDuplicateIntegerInAnArary 
{
	public static void main(String[] args) 
	{
		int[] st={5,6,6,9,8,8,1,2};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
		for(int i=0; i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(int in:set)
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(in==st[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(in+" is Repeaing"+count);
			}
		}
		
	}

}
