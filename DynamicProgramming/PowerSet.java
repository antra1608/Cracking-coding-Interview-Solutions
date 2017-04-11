package DynamicProgramming;

import java.util.ArrayList;

public class PowerSet {

	
	ArrayList<Integer> getSet(ArrayList<Integer> set,int k)
	{
		ArrayList<Integer> subset=new ArrayList<Integer>();
		int index=0;
		for(int i=k;i>0;i=i>>1)
		{
			if((i & 1)==1)
			{
				subset.add(set.get(index));
			}
			index++;
		}
		
		return subset;
		
		
	}
	ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set)
	{
		int i=1<<set.size();
		ArrayList<ArrayList<Integer>> subset=new ArrayList<ArrayList<Integer>>();
		System.out.println("   "+(2^set.size()));
		for(int k=0;k<i;k++)
		{
			ArrayList<Integer> set1=new ArrayList<Integer>();
			set1=getSet(set,k);
			subset.add(set1);		
					
		}
		return subset;
		
	}
	
	
	public static void main(String args[])
	{
		
		PowerSet ps=new PowerSet();
		ArrayList<Integer> set=new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		ArrayList<ArrayList<Integer>> subset=new ArrayList<ArrayList<Integer>>();
		subset=ps.getSubset(set);
		System.out.println("set size"+set.size()+"subset size"+subset.size());
		for(ArrayList<Integer> itertr :subset)
		{
			System.out.print("{");
			for(Integer i:itertr)
			{
				System.out.print(i);
			}
			System.out.println("}");
			
		}
	}
	
}
