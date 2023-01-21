package Array_Programs;

public class AditionOf2Array
{
	public static void main(String[] args) 
	{
		int [] a= {2,1,3,5,9};	
		int [] b= {1,4,8,6};
		
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0; i<length;i++)
		{
			//Hi
			try
			{
			System.out.print(a[i]+" "+b[i]);
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}
			
	}
}
