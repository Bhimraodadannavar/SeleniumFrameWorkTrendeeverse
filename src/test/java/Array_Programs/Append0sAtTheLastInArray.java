package Array_Programs;

public class Append0sAtTheLastInArray 
{
	public static void main(String[] args) 
	{
		int[] arr={1,0,1,0,0};//o/p:-11000
        int[] b=new int[arr.length];
        int m=0;
        int n = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]==1)
        	{
        		b[m]=arr[i];
        		m++;
        	}
        	else
        	{
        		b[n]=arr[i];
        		n--;
        	}
        }
        for(int i=0; i<b.length;i++)
        {
        	System.out.print(b[i]+"  ");
        }
        
	}
}
