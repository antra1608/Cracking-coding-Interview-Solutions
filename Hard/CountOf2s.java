package Hard;

public class CountOf2s {

	
	static int count2sInRangeAtDigit(int number,int d)
	{
		int powerOf10=(int)Math.pow(10, d);
		int nextPowerOf10=powerOf10*10;
		int right=number%powerOf10;
		int rounddown=number-number%nextPowerOf10;
		int roundup=rounddown+nextPowerOf10;
		
		
		int digit=(number/powerOf10)%10;
		if(digit<2)
		{
			return rounddown/10;
		}
		else if(digit==2)
		{
			return rounddown/10+right+1;
		}
		else
		{
			return roundup/10;
		}
	}
	
	static int count2sInRange(int number)
	{
		int count=0;
		int len=String.valueOf(number).length();
		
		for(int i=0;i<len;i++)
		{
			count+=count2sInRangeAtDigit(number,i);
		}
		return count;
	}
	
	public static void main(String args[])
	{
		System.out.println(count2sInRange(23));
	}
}
