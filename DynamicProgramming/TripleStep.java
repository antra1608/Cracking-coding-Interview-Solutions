package DynamicProgramming;

public class TripleStep {

	
	 int triple(int n)
	{
		int a[]=new int[n+1];
		int i;
		for(i=0;i<=n;i++)
			a[i]=-1;
		return f(n,a);
		
	}
	
	int f(int n,int a[])
	{
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else if(a[n]>-1)
			return a[n];
		else 
		{
			a[n]=f(n-1,a)+f(n-2,a)+f(n-3,a);
			return a[n];
		}
		
		
	}
	public static void main(String args[])
	{
	TripleStep ts=new TripleStep();
	System.out.println(ts.triple(3));
		
	}
	
	
}
