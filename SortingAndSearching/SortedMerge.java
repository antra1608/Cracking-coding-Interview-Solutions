package SortingAndSearching;

import java.util.HashMap;

public class SortedMerge {

int [] Sorted_Merge(int []a,int []b)
{
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	int i,j;
	i=0;
	j=0;
	int index=0;
	while(true)
	{
		System.out.println("in eclipse");
		if(j==b.length)
		{
			System.out.println("first");
			while(a[i]!=0)
			{
				map.put(index, a[i]);
				i++;
				index++;
			}
			break;
		}
		else if(a[i]==0)
		{
			System.out.println("second");
			
			while(j<b.length)
			{
				map.put(index, b[j]);
				j++;
				index++;
			}
			break;
		}
		else
		{
			System.out.println("third");
			
			if(a[i]<b[j] )
		{
			map.put(index, a[i]);
			i++;
			
		}
		else if(a[i]>=b[j])
		{
			map.put(index, b[j]);
			j++;
			
		}
		else 
			break;
			}
		index++;
		
		
	}
	int k=0;
	System.out.println("in map"+map.size());
	while(k<map.size())
	{
		a[k]=map.get(k);
		System.out.println(map.get(k));
		k++;
	}
	
	return a;

}


public static void main(String args[])
{
	SortedMerge sm=new SortedMerge();
	int a[]={1,6,8,9,10,0,0,0,0};
	int b[]={2,3,9,11};
	a=sm.Sorted_Merge(a, b);
//	for(int i=0;i<a.length;i++)
		//System.out.println(a[i]);
	
}

}
