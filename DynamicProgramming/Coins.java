package DynamicProgramming;

public class Coins {

	
	
	int makeChange(int n,int denoms[],int index)
	{
		
		if(index>=denoms.length-1)
			{
			System.out.println();
			return 1;
			}int ways=0;
		int denomAmount=denoms[index];
		
		for(int i=0;i*denomAmount<n;i++)
		{
			int balance=n-i*denomAmount;
			System.out.println("amount is"+n+"index is: "+index+"balance is:"+balance+ " for i= "+i);	
			
			ways+=makeChange(balance,denoms,index+1);
		}
		return ways;
	}
	
	int makeChange(int n)
	{
		int [] denoms = {25,10,5,1};
		return makeChange(n,denoms,0);
	}
	
	int makeChangeDp(int n,int []denoms,int index,int[][] map)
	{
		if(map[n][index]>0)
			return map[n][index];
		
		if(index>=denoms.length-1)
			return 1;
		int ways=0;
		int denom=denoms[index];
		for(int i=0;i*denom<n;i++)
		{
			int balance=n-(i*denom);
			ways+=makeChangeDp(balance,denoms,index+1,map);
		}
		map[n][index]=ways;
		return ways;
		
	}
	
	int makeChangeDp(int n)
	{
		int [] denoms={25,10,5,1};
		int [][] map=new int[n+1][denoms.length];
		int ans=makeChangeDp(n,denoms,0,map);
		for(int i=0;i<n+1;i++)
		{		for(int j=0;j<denoms.length;j++)
				System.out.print(map[i][j]);
			System.out.println();
		}		
	    return ans;
	}
	public static void main(String agrs[])
	{
		Coins cs=new Coins();
		System.out.println(cs.makeChange(10));
		System.out.println(cs.makeChangeDp(10));
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

