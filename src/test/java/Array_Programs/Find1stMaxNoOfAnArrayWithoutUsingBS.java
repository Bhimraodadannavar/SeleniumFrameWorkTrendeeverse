package Array_Programs;

public class Find1stMaxNoOfAnArrayWithoutUsingBS {

	public static void main(String[] args) 
	{
		int[] arr={20,10,30,90,80};
		int fmax = arr[0];//20
		for(int i=1;i<arr.length; i++ )
		{
			if(arr[i]>fmax)
			{
				fmax=arr[i];
			}
		}
		System.out.println("The first max number in an Array "+ fmax);
	}
}
