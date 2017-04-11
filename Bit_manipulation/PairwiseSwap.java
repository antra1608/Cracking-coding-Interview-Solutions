package Bit_manipulation;

public class PairwiseSwap {

	
	public static int pairWiseSwap(int a)
	{
		int x=a;
		return (((x&0xaaaaaaaa)>>>1)| ((x&0x55555555)<<1));
		
	}
	public static void main(String args[])
	{
		
		int a=0x5;
		System.out.println(String.format("%X", pairWiseSwap(a)));
		
	}
	
}
