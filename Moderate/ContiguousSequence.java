package Moderate;

import javax.swing.text.AbstractDocument.LeafElement;

public class ContiguousSequence {

	
	public static int findMaxSum(int a[])
	{
		int max=0;
		int sum=0;
		int tempMax=0;
		int index=0;
		for(int i=0;i<a.length-2;i++)
		{
			sum=a[i];
			tempMax=a[i];
			index=i;
			for(int j=i+1;j<=a.length-1;j++)
			{
				sum+=a[j];
				if(sum>tempMax)
				{
					tempMax=sum;
					index=j;
				}
				
			}
			if(tempMax>max)
			{	max=tempMax;
			
			}
		}
		return max;
		
	}
	
	
	public static int getMaxSum(int a[])
	{
		int maxsum=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(sum>maxsum)
				maxsum=sum;
			else if(sum<0)
				sum=0;
		}
		return maxsum;
		
		
	}
	public static void main(String args[])
	{
		int a[]={2,-8,3,-2,4,-10,20};
		System.out.println(getMaxSum(a));
		
		
		
	}
	
}
