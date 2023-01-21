package Array_Programs;

public class FindSecondMaximumNumberInanArrayUsingBubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr={20,10,30,90,80};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1 ;j<arr.length;j++)
			{

				if(arr[i]<arr[j])
				{
					//swapping using  third variable
					int temp = arr[i];	
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.println(arr[i]+" ");
			//10 20 30 80 90
			//arr[0]=10 arr[1]=20 arr[2]=30 arr[3]=80 arr[4]=90
		}
		System.out.println(arr[1]);
	
}

}
