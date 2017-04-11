package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
public static void main(String args[])
{
GroupAnagrams ga=new GroupAnagrams();
String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
ga.sort(array);
//System.out.println(AssortedMethods.stringArrayToString(array));
for(int i=0;i<array.length;i++)
	System.out.println(array[i]);
}
	
	void sort(String [] array)
	{
		HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
		for(String s:array)
		{
			String key=sortChars(s);
			ArrayList<String> a=new ArrayList<String>();
			if(!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);
			
		}
		
		int index=0;
		for(String key:map.keySet())
		{
			ArrayList<String> list=map.get(key);
			for(String t:list)
			{	array[index]=t;
			index++;
			}
		}
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
		
	}
	String sortChars(String s)
	{
		char[] contest=s.toCharArray();
		Arrays.sort(contest);
		return new String(contest);
	}
	
	
}
