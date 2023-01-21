package Strings;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String s="Gadag";
		String rev = "";
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}		
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
