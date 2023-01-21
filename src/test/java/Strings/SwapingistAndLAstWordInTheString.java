package Strings;

public class SwapingistAndLAstWordInTheString 
{
	public static void main(String[] args) 
	{
		String st= "i am from SDET-44 Batch";//Batch am from SDET-44 i
		String[] s=st.split("");
		String temp = s[0];
		s[0]=s[4];
		s[4]=temp;
		for(int i=0; i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
}