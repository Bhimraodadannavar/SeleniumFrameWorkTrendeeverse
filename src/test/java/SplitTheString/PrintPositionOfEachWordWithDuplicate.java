package SplitTheString;

public class PrintPositionOfEachWordWithDuplicate
{
	public static void main(String[] args) 
	{
		String st="I am am from SDET-44 BAtch";
		String[] s=st.split(" ");

		for(int i=0; i<s.length;i++)
		{
			System.out.println(s[i]+" is in "+(i+1));
		}
	}
}
