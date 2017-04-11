package Moderate;

import java.util.Stack;

public class Calculator {

	static float Calculate(String r)
	{
		int result=0;
		Stack op=new Stack();
		Stack no=new Stack();
		char a[]=r.toCharArray();
		int i=0;
		while(i<a.length)
		{
			if(a[i]=='*' || a[i]=='/')
				{
						float ans=(float)no.peek()*(a[i+1]-48);
						no.pop();
						no.push(ans);
						//System.out.println(ans);
						i++;
						
				}
			else if(a[i]=='+' || a[i]=='-')
			{
				op.push(a[i]);
			}
			else 
			{
				no.push((float)(a[i]-48));
			}
			i++;
		}
		float ans=0;
		
		while(!op.isEmpty())
		{
			char ope=(char)op.pop();
			float no1=(float)no.pop();
			float no2=(float)no.pop();
			if(ope=='+')
				ans=ans+no1+no2;
			else
				ans=ans+no2-no1;
		}
		
		return ans;
	}
	
	
	
	
	public static void main(String args[])
	{
		String r="2*3+5/6*3+15";
		System.out.println(Calculate(r));
		
	}
	
	
	
}
