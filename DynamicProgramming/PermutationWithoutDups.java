package DynamicProgramming;

import java.util.ArrayList;

public class PermutationWithoutDups {

	
	ArrayList<String> getPerms(String remainder)
	{
		int len=remainder.length();
		ArrayList<String> result=new ArrayList<String>();
		
		
		if(len==0)
		{
			result.add("");
			return result;
		}
		for(int i=0;i<len;i++)
		{
			String bfr=remainder.substring(0,i);
			String aftr=remainder.substring(i+1,len);
			ArrayList<String> partial=getPerms(bfr+aftr);
			
			for(String s:partial)
			{
			result.add(remainder.charAt(i)+s);
			}
		}
		return result;
	}
	public static void main(String[] args) {

		PermutationWithoutDups pwd=new PermutationWithoutDups();
		ArrayList<String> result=pwd.getPerms("aba");
		for(String s:result)
		{
			System.out.println(s);
		}
	
	
	}

}
