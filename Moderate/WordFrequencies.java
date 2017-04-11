package Moderate;

import java.util.HashMap;

public class WordFrequencies {

	
	HashMap<String,Integer> SetDictionary(String [] book)
	{
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String word:book)
		{
			String temp=word.trim().toLowerCase();
			if(!map.containsKey(temp))
			{
				map.put(temp, 1);
				
			}
			else
			{
				map.put(temp, map.get(temp)+1);
			}
			
			
		}
		return map;
	}
	
	int getFrequencies(String []book,String word)
	{
		HashMap<String,Integer> map=SetDictionary(book);
		if(map==null || word==null)
			return -1;
		if(map.containsKey(word))
		{
		return map.get(word.toLowerCase().trim());
	
		}
		return 0;
		}
	
	
	public static void main(String args[])
	{
		WordFrequencies wf=new WordFrequencies();
		String [] book={"book","book","shelf","a","a","a","   "};
		String word="book";
		System.out.println(wf.getFrequencies(book, word));
	}
	
	
}
