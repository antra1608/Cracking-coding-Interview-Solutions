package Hard;

public class RandomSet {
	static int rand(int low,int high)
	{
		int a=(int)(Math.random()*(high-low+1));
		System.out.println("a= "+a);
		return (low+a);
	}
	
	
	
	static int[] pickMeRecursively(int[] original,int m,int i)
	{
		if(i+1==m)
		{
			
		}
		else if(i+1>m)
		{
			int[] subset=pickMeRecursively(original,m,i-1);
			int k=rand(0,i);
					if(k<m)
						subset[k]=original[i];
			return subset;
		}
		return null;
	}
	
	
	
	static int[] pickMIteratively(int[] original,int m)
	{
		int[] subset=new int[m];
		
		for(int i=0;i<m;i++)
			subset[i]=original[i];
		
		for(int i=m;i<original.length;i++)
		{
			int k=rand(0,i);
			if(k<m)
				subset[k]=original[i];
		}
		return subset;
	}
	public static void main(String args[])
	{
		int[] original={1,2,3,4,5,6,7,8};
		int[] subset=pickMIteratively(original, 3);
		for(int i=0;i<subset.length;i++)
			System.out.print(subset[i]);
	}
	
	
	
}
