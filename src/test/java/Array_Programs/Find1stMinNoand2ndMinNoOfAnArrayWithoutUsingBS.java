package Array_Programs;

public class Find1stMinNoand2ndMinNoOfAnArrayWithoutUsingBS 
{
	public static void main(String[] args) 
	{
		int[] arr={20,10,30,90,80};
		int smin = arr[0];
		int fmin = arr[0];
		for(int i=0;i<arr.length; i++ )
		{
			if(arr[i]<fmin)
			{
				smin=fmin;
				fmin=arr[i];
			}
			else if (arr[i]<smin)
			{
				smin=arr[i];
			}
		}
		System.out.println("The fisrt min number is" +fmin);
		System.out.println("The second min number is" +smin);

	}

}
