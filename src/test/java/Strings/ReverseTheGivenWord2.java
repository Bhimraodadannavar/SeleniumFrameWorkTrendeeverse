package Strings;

public class ReverseTheGivenWord2 
{
	public static void main(String[] args) 
	{
		String st= "I am from SET-44 Batch";
		String[] s=st.split("");
		for(int i=s.length-1;i>=0;i--)
		{
			String str = s[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print("");
		}
	}
}


