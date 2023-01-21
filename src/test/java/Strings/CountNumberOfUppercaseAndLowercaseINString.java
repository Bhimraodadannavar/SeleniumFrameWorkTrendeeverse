package Strings;

public class CountNumberOfUppercaseAndLowercaseINString 
{
	public static void main(String[] args)
	{
		String s = "BAnGaloRe";
		int uppercase = 0;
		int lowercase = 0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				lowercase++;
			}

		}
			System.out.println(uppercase);
			System.out.println(lowercase);
	}


}
