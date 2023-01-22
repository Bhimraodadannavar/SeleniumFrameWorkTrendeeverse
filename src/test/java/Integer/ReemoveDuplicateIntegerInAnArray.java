package Integer;

import java.util.LinkedHashSet;

public class ReemoveDuplicateIntegerInAnArray 
{
	public static void main(String[] args) 
	{
		int[] st= {4,4,5,5,6,6,9,9};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int i=0; i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(Integer in:set)
		{
			System.out.print(in+" ");
		}

	}
}
