package Hard;

public class BitInteger {

	
	public static int INTEGER_SIZE;
	private boolean[] bits;
	public BitInteger()
	{
		bits=new boolean[INTEGER_SIZE];
		
	}
	public BitInteger(int value)
	{
		bits=new boolean[INTEGER_SIZE];
		for(int j=0;j<INTEGER_SIZE;j++)
		{
			if(((value>>j)&1)==1) bits[INTEGER_SIZE-1-j]=true;
			else
				bits[INTEGER_SIZE-1-j]=false;
		}
	}
	
	
	public int fetch(int k)
	{
		if(bits[k])
			return 1;
		else 
			return 0;
	}
	
	public void set(int k,int bitvalue)
	{
		if(bitvalue==0) bits[k]=false;
		else
			bits[k]=true;
	}
	
	public void set(int k,char bitvalue)
	{
     
		 if(bitvalue=='0')
			 bits[k]=false;
		 else 
			 bits[k]=true;
	}
	
	
	public void set(int k,boolean bitvalue)
	{
		bits[k]=bitvalue;
	}
	
	public void swapvalues(BitInteger number)
	{
		for(int i=0;i<INTEGER_SIZE;i++)
		{
			int temp=number.fetch(i);
			number.set(i, this.fetch(i));
			this.set(i, temp);
		}
	}
	
	public int toInt()
	{
		int number=0;
		for(int j=INTEGER_SIZE-1;j>=0;j--)
		{
			number=number|fetch(j);
			if(j>0)
			{
				number=number<<1;
			}
		}
		return number;
	}
	
	
}























