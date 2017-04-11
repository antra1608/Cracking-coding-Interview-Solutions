package Moderate;

public class NumberMax {

	
	int max(int a,int b)
	{
		int c=a-b;
		int d=c|0;
		int e=d>>31;
		int k=e&1;
		System.out.println("e"+k);
		return d;
		
	}
	int flip(int a)
	{
		return 1^a;
	}
	int maxNaive(int a,int b)
	{
		int c=a-b;
		int k=flip((c>>31)&0x1);
		int q=flip(k);
		System.out.println("k="+k+" q="+q);
		return (a*k+b*q);
		
	}
	
	
	public static void main(String args[])
	{
		NumberMax nm=new NumberMax();
		System.out.println(nm.maxNaive(6, 9));
	}
	
}
