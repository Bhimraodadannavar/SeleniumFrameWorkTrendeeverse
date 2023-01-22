package Strings;

import java.util.LinkedHashSet;

public class ToCountNumberOfDuplicate
{

	public static void main(String[] args) 
	{
		String st = "Tester";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))//ch= t e s r  charAT(i)=t e s t e r
				{                   //
					count++;        //
				}                    //
			}                       //
                                     //
			if(count>1)
			{
				System.out.println(ch+" is repeating  " +count+" times");
			}
		}
	}

}
