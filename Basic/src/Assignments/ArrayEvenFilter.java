package Assignments;

public class ArrayEvenFilter 
{
	static int[] filterEven(int array[])
	{
		int j=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 2 == 0)
			{
				j++;
			}
		}
		int[] res = new int[j];
		j=0;
 		for(int i = 0; i < array.length; i++)
		{
 			if(array[i] % 2 == 0)
			{
 				res[j] = array[i];
				j++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {3,45,23,78,44,34,88};
		int[] array = filterEven(arr);
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
