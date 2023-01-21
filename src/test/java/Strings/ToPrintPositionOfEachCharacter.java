package Strings;

public class ToPrintPositionOfEachCharacter 
{
	public static void main(String[] args) 
	{
		String st = "Tester";
		String s = st.toLowerCase();
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i)+" is in "+(i+1)+"position");
		}
	}

}
