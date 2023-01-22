package Integer;

import java.util.LinkedHashSet;

public class PrintThePositonOfEcahWordWithDuplicate 
{
	public static void main(String[] args) 
	{
		int[] st={1,2,2,3,3,8};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
		for(int i=0; i<st.length;i++)
		{
			System.out.println(st[i]+" is in position"+(i+1));
		}
	}
}
