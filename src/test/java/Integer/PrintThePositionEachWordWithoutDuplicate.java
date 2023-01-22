package Integer;

import java.util.LinkedHashSet;

public class PrintThePositionEachWordWithoutDuplicate 
{
	public static void main(String[] args) 
	{
		int [] st={9,9,1,2,1,7,7,4};
		LinkedHashSet< Integer> set= new LinkedHashSet<>();
		for(int i=0; i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(Integer in:set)
		{
			for(int i=0;i<st.length;i++)
			{
				if(in==st[i])
				{
					System.out.println(st[i]+"th eposition is"+(i+1));
					break;
				}
			}
		}
	}
}
