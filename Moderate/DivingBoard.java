package Moderate;

import java.util.HashSet;

public class DivingBoard {

	
	HashSet<Integer> allLengths(int k,int shorter,int longer)
	{
		HashSet<Integer> lengths=new HashSet<Integer>();
		HashSet<String> visited=new HashSet<String>();
		
		getAllLengths(k,0,shorter,longer,lengths,visited);
		return lengths;
	}
	
	void getAllLengths(int k,int total,int shorter,int longer,HashSet<Integer> length,HashSet<String> visited)
	{
		if(k==0)
		{
			length.add(total);
			return ;
		}
		String key=k+" "+total;
		if(visited.contains(key))
			return;
		getAllLengths(k-1, total+shorter, shorter, longer, length,visited);
		getAllLengths(k-1, total+longer, shorter, longer, length,visited);
		visited.add(key);
		
	}
	public static void main(String args[])
	{
		DivingBoard db=new DivingBoard();
		int k=5;
		int shorter=1;
		int longer=2;
		HashSet<Integer> lengths=db.allLengths(k, shorter, longer);
		System.out.println("size "+lengths.size());
		for(Integer i:lengths)
		{
			System.out.println(i);
		}
	}
	
}
