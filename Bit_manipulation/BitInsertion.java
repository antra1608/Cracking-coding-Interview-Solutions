package Bit_manipulation;



public class BitInsertion {


static int insert(int n,int m,int i,int j)
{
	
	int k;
	int p;
	p=1;
	p=~p;
	for(k=0;k<j;k++)
	{
		p=p<<1;
		
	}
	int q=1;
	for(k=0;k<i;k++)
	{
		p=p|q;
		q=q<<1;
	}
	n=n&p;
	for(k=0;k<i;k++)
	{
		m=m<<1;
		
	}
	n=n|m;
	
	
return n;
}
	
	
	
	public static void main(String args[])
	{
		int m,n,i,j;
		n=1024;
		m=19;
		i=2;
		j=6;
		System.out.println("n is :"+n);
		
		n=insert(n,m,i,j);
		
		System.out.println("n is :"+n);
	}
	
	
}
