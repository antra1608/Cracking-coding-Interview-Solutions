package Moderate;

public class SumSwap {
	public static Integer getTarget(int [] array1,int [] array2)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<array1.length;i++)
			sum1+=array1[i];
		for(int i=0;i<array2.length;i++)
			sum2+=array2[i];
		
		if((sum1-sum2)%2!=0)
			return null;
		return (sum1-sum2)/2;
		
	}
	
	public static int [] findSwapValues(int [] array1,int [] array2)
{
	Integer target=getTarget(array1,array2);
	if(target==null)
		return null;
	return findDifference(array1,array2,target);
}
	
	
	public static int [] findDifference(int [] array1,int []  array2,int target)
	{
		int a=0;
		int b=0;
		while(a<array1.length && b<array2.length)
		{
			int difference=array1[a]-array2[b];
			if(difference==target)
			{
				int[] values={array1[a]-array2[b]};
				return values;
			}
			else if (difference<target)
			{
				a++;
			}
			else
			{
				b++;
			}
		}
		return null;
	}
	
	
	public static void main(String args[])
	{
		int array1[]={1,1,1,2,2,4};
		int array2[]={3,3,3,6};
		int a[]=findSwapValues(array1, array2);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
}
