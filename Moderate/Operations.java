package Moderate;

public class Operations {

	
	int negate(int b)
	{
		int i;
		int neg=0;
		i=(b>0)?-1:1;
		int count=0;
		b=Math.abs(b);
		while(count!=b)
		{
			neg+=i;
			count++;
		}
		return neg;
	}
	int subtract(int a,int b)
	{
		
		
		return a+negate(b);
	}
	
	
	
	int multiplication(int a,int b)
	{
		if(b>a)
			return multiplication(b, a);
		int x=Math.abs(a);
		int y=Math.abs(b);
		
		int count=0;
		int mul=0;
		while(count!=y)
		{
			mul+=x;
			count++;
		}
		
		if((b>0 && a>0)||(b<0 && a<0))
		{
			return (mul);
		
	}else
	{
			return negate(mul);
	}
	}
	
	int divide(int a,int b)
	{
		int x=Math.abs(a);
		int y=Math.abs(b);
		int count=0;
		while(x!=0)
		{
			x=subtract(x, y);
			count++;
		}
		if((b>0 && a>0)||(b<0 && a<0))
		{
			return (count);
		
	}else
	{
			return negate(count);
	}	
		
	}
	public static void main(String args[])
	{
		Operations ap=new Operations();
		System.out.println(ap.divide(40, 8));
	}
	
}
