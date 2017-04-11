package Moderate;

import java.util.Random;

public class Rand7fromRand5 {

 int rand5()
	{
		Random r=new Random();
		return r.nextInt(5);
	}
	
	 int rand7()
	{
		while(true)
		{
		int r1=2*rand5();
		int r2=rand5();
		if(r2<4)
		{
			int r=r2%2;
			int num=r+r1;
			if(num<7)
				return num;
		}
		
		}
	}
	
	public static void main(String args[])
	{
		Rand7fromRand5 r=new Rand7fromRand5();
	System.out.println(r.rand7());	
	}
	
	
	
}
