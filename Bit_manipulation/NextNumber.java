package Bit_manipulation;

public class NextNumber {

	
	static int getNext(int n)
	{
		int c=n;
		int c0=0;
		int c1=0;
		while(((c&1)==0)&& (c!=0))
		{
			c0++;
			c>>=1;
		}
		
		while((c&1)==1)
		{
			c1++;
			c>>=1;
		}
		
		if(c0+c1==31 || c0+c1==0)
			return -1;
		int p=c0+c1;
		n|=(1<<p);
		n&=~((1<<p)-1);
		n|=(1<<(c1-1))-1;
		
		return n;
	}
	
	public static void main(String args[])
	{
		
	int n=13948;
	int bit[]=new int[32];
	int i=0;
	System.out.println(getNext(n));
	/*
	while(n!=0)
	{
		bit[i]=n%2;
		n=n/2;
		i++;
		
	}
	System.out.println("bits are:");
	for(int l=31;l>=0;l--)
	{
		System.out.print(bit[l]);
	}
	System.out.println();

	i=31;
		while(bit[i]==0)
			i--;
		bit[i+1]=1;
		bit[i--]=0;
		for(int l=31;l<=0;l--)
		{
			System.out.print(bit[l]);
		}
		System.out.println();

		int count=0;
		
		while(i!=0)
		{
			if(bit[i]==1)
			{
				bit[i]=0;
			count++;
			}i--;
		}
		System.out.println("count"+count);
		int k=0;
		while(k!=count)
		{
			bit[k]=1;
			k++;
			
		}
		for(int l=31;l>=0;l--)
		{
			System.out.print(bit[l]);
		}
		System.out.println();
	}*/
	}
}
