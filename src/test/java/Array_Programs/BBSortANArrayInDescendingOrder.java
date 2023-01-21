package Array_Programs;

public class BBSortANArrayInDescendingOrder 
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
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
