package Array_Programs;

public class Find1stMaxNoand2ndMaxNoOfAnArrayWithoutUsingBS 
{
	public static void main(String[] args) 
	{
		int[] arr={20,10,30,90,80};
		int smax = arr[0];
		int fmax = arr[0];
		for(int i=0;i<arr.length; i++ )
		{
			if(arr[i]>fmax)
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if (arr[i]>smax)
			{
				smax=arr[i];
			}
		}

		System.out.println("The fisrt max number is " +fmax);
		System.out.println("The second max number is  " +smax);
	}
}