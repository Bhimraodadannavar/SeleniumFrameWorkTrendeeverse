package Array_Programs;

public class Append0sAtTheLastInArray2
{

	public static void main(String[] args) 
	{
		int[] arr={4,0,9,0,0};//o/p:-4 9 0 0
        int[]b=new int[arr.length];
        int m=0;
        int n = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]!=0 )
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
