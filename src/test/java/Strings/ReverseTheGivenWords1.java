package Strings;

public class ReverseTheGivenWords1
{
	public static void main(String[] args) 
	{
		String st= "I am from SET-44 Batch";
		String[] s=st.split(" ");
		for(int i= s.length-1; i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}

}
