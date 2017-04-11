package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Parens {

	

	
	
	ArrayList<String> getParens(int n)
	{
		ArrayList<String> result=getDupParens(n);
		ArrayList<String> r1=new ArrayList<String>();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String s:result)
		{
			if(!map.containsKey(s))
				map.put(s, 0);
		//	else
			//	map.put(s, map.get(s)+1);
			
		}
		Iterator entries=map.entrySet().iterator();
		while(entries.hasNext())
		{
			Entry e=(Entry) entries.next();
			Object key=e.getKey();
			System.out.println("adds "+key.toString());
			r1.add(key.toString());
		}
//		map.forEach((k,v)->result.add(k));
		System.out.println("map size"+map.size()+"result size"+r1.size());
		
		return r1;
		
	}
	
	
	 ArrayList<String> getDupParens(int n) {
		// TODO Auto-generated method stub
ArrayList<String> result=new ArrayList<String>();

	 if(n==2)
	 {
		 result.add("()()");
		 result.add("(())");
		 return result;
	 }	 
	 else
	 {
		 ArrayList<String> partial=getDupParens(n-1);
		 for(String s:partial)
		 {
			 result.add(s+"()");
			 result.add("()"+s);
			 result.add("("+s+")");
			 
		 }
		 
		 return result;
	 }
	 }

	 void addParen(ArrayList<String> list,int leftrem,int rightrem,char[] str,int index)
	 {
		 if(leftrem<0 || rightrem<0 || rightrem<leftrem)
			 return;
		 if(leftrem==0 && rightrem==0)
		 {
			 String s=String.copyValueOf(str);
			 list.add(s);
			 
		 }
		 else
		 {
			 if(leftrem>0)
			 {
				 str[index]='(';
				 addParen(list, leftrem-1, rightrem, str, index+1);
			 }
			 if(rightrem>leftrem)
			 {
				 str[index]=')';
				 addParen(list, leftrem, rightrem-1, str, index+1);
			 }
			 
		 }
		 
	 }
	 
	 //method given in book
	 ArrayList<String> generateParens(int n)
	 {
		 char[] str=new char[2*n];
		 ArrayList<String> list=new ArrayList<String>();
		 addParen(list,n,n,str,0);
		 return list;
	 }

	public static void main(String args[])
	{
		
		Parens p =new Parens();
		ArrayList<String> ps=p.getParens(5);
		System.out.println("size"+ps.size());
		for(String s:ps)
		{
			System.out.println(s);
			
		}
		ArrayList<String> pe=p.generateParens(5);
		System.out.println("size"+pe.size());
		for(String s:pe)
		{
			System.out.println(s);
			
		}
	}
	
	
}
