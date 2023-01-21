package Array_Programs;

public class Find1stMinNoOfAnArrayWithoutUsingBS
{
	public static void main(String[] args) 
	{
		int[] arr={20,10,30,90,80};
		int fmin = arr[0];
		for(int i=1;i<arr.length; i++ )
		{
			if(arr[i]<fmin)
			{
				fmin=arr[i];
			}
		}
		System.out.println("The first min number in an Array  "+ fmin);
	}
}
