package Bit_manipulation;

public class Conversion {

	
	public static int bitSwapRequired(int a,int b)
	{
		int count=0;
		int c;
		for(c=a^b;c!=0;c>>=1)
			count=count+c&1;
		return count;
	}
	public static int bitSwapRequired1(int a,int b)
	{
		int count=0;
		for(int c=a^b;c!=0;c=c&(c-1))
		{
			count++;
		}
		return count;
	}
	
	public static void main(String args[])
	{
		int a=29;
		int b=15;
		int bitA[]=new int[32];
		int bitB[]=new int[32];
		
		
		int k=0;
		while(a!=0)
		{
			bitA[k]=a%2;
			a=a/2;
			k++;
		}
		 k=0;
		while(b!=0)
		{
			bitB[k]=b%2;
			b=b/2;
			k++;
		}
		int count=0;
		for(k=31;k>=0;k--)
			System.out.print(bitA[k]);
		System.out.println();
		for(k=31;k>=0;k--)
			System.out.print(bitB[k]);

		for(k=0;k<=31;k++)

		{
			if(bitA[k]!=bitB[k])
				count++;
		}
		System.out.println(count);
		
		
		
	}
	
}
