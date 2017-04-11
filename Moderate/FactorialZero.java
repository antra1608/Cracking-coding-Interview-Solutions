package Moderate;

public class FactorialZero {

	
	long fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}
	int GetTraling(int n)
	{
		
		if(n%2!=0 || n%5!=0)
			return GetTraling(n-1);
		int count5=0;
		int count2=0;
		
		for(int i=n;i>=1;i--)
		{
		long temp=i;
		while(temp!=0)
		{
			if(temp%5==0)
				count5++;
			else
				break;
			//System.out.println(temp);
			temp/=5;
			
		}
		temp=i;
		//System.out.println(temp);
		while(temp!=0)
		{
			if(temp%2==0)
				count2++;
			else
				break;
			temp/=2;
			
		}
		}
	//System.out.println("c5 "+count5+"c2 "+count2);
		if(count5>count2)
			return count2;
		else
			return count5;

		
	}
	
	public static void main(String args[])
	{
		FactorialZero fz=new FactorialZero();
		System.out.println(fz.GetTraling(40));
		
	}
	
	
}
