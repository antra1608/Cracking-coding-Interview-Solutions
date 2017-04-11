package Hard;

import java.util.HashMap;

public class LettersandNumbers {

	
	
	static int [] computeDeltasArray(char [] array)
	{
		int [] deltas=new int[array.length];
		int delta=0;
		for(int i=0;i<array.length;i++)
		{
			if(Character.isLetter(array[i]))
				delta++;
			else if ((Character.isDigit(array[i])))
				delta--;
			deltas[i]=delta;
		}
		return deltas;
		
	}
	
	static int [] findLongestMatch(int[] deltas)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(0, -1);
		int max[]=new int[2];
		for(int i=0;i<deltas.length;i++)
		{
			if(!map.containsKey(deltas[i]))
			{
				map.put(deltas[i], i);
			}
			else
			{
				int match=map.get(deltas[i]);
				int distance=i-match;
				int longest=max[1]-max[0];
				if(distance>longest){
					max[1]=i;
					max[0]=match;
				}
			}
		}
		return max;
	}
	static char[] extractSubarray(char[] array,int start,int end)
	{
		char [] sub=new char[end-start+1];
		for(int i=start,j=0;i<end;i++,j++)
		{
			sub[j]=array[i];
		}
		return sub;
	}
	static char[] findLongestSubarray(char[] array)
	{
		int[] deltas=computeDeltasArray(array);
		int[] match=findLongestMatch(deltas);
		return extractSubarray(array,match[0]+1,match[1]);
		
		
	}
	public static void main(String args[])
	{
		char[] array={'a','b','1','2','c'};
		char[] set=findLongestSubarray(array);
	for(int i=0;i<set.length;i++)
		System.out.println(set[i]);
	}
	
}
