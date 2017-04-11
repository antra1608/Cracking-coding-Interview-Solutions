package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class PermutationWithDups {

	
	ArrayList<String> getpermute(String reminder)
	{
		ArrayList<String> result=new ArrayList<String>();
		
		int len=reminder.length();
		if(len==0)
		{
			result.add("");
			return result;
		}
		for(int i=0;i<len;i++)
		{
			String bfr=reminder.substring(0, i);
			String aftr=reminder.substring(i+1, len);
			ArrayList<String> partial=getpermute(bfr+aftr);
			int flag=0;
			for(String s:partial)
			{
				
//				for(String r:result)
//				{
//					if(r.equalsIgnoreCase(s))
//						{flag=1;
//						break;}
//					
//				}
//				if(flag==0)
					result.add(reminder.charAt(i)+s);
				
			}
			
		}
		return result;
	}
	ArrayList<String> printPerms(String s)
	{
		 ArrayList<String>  result=new ArrayList<String>();
		HashMap<Character,Integer> map=buildFreqTable(s);
		int l=map.size();
		printPerms(map," ",s.length(),result);
		return result;
	}
	void printPerms(HashMap<Character,Integer> map,String prefix,int len,ArrayList<String> result)
	{
		if(len==0)
		{
			result.add(prefix);
			return;
		}
		for(Character c:map.keySet())
		{
			int count=map.get(c);
			if(count>=0)
			{
				map.put(c, count-1);
				printPerms(map,prefix+c,len-1,result);
				map.put(c, count);
			}
		}
		
	}
	
	 HashMap<Character, Integer> buildFreqTable(String s) {
		 
		 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		 for(char c:s.toCharArray())
		 {
			 if(!map.containsKey(c))
				 map.put(c, 0);
			 else
				 map.put(c,map.get(c)+1);
		 }

		 
		 return map;
	}
	public static void main(String agrs[])
	{
		String s="aba";
		PermutationWithDups pwd=new PermutationWithDups();
	/*	ArrayList<String> re=pwd.getpermute(s);
		System.out.println(re.size());
		for(int i=0;i<re.size();i++)
		{
			int flag=0;
		//	System.out.println(re.get(i));
			for(int j=i+1;j<re.size();j++)
			{
				if(re.get(i).equalsIgnoreCase(re.get(j)))
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
				System.out.println(re.get(i));
			
		}*/
		ArrayList<String> res=pwd.printPerms("abaaa");
		System.out.println(res.size());
		for(String r:res)
			System.out.println(r);
		
	}
	
}
