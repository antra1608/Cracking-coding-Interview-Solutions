package SortingAndSearching;

import java.util.Arrays;

public class PeaksandValley {

	
	public static void main(String args[])
	{
		PeaksandValley pav=new PeaksandValley();
		int[] array=new int[5];
		array[0]=5;
		array[1]=3;
		array[2]=1;
		array[3]=2;
		array[4]=3;
		pav.sortValleyPeak(array);
		for(int i=0;i<5;i++)
			System.out.println(array[i]);
		
	}
	void sortValleyPeak(int[] array)
	{
		
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=1;i<array.length;i+=2)
		{
			swap(array,i-1,i);
		}
		
			
	}
	void swap(int [] array,int left,int right)
	{
		int temp=array[left];
		array[left]=array[right];
		array[right]=temp;
		
	}
	
}
