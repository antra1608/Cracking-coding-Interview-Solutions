package DynamicProgramming;

public class MagicIndex {

	public static int getMagicIndex(int a[],int n)
	{
		int i=0;
		while(i<n)
		{
			if(a[i]<i)
			{
				i++;
				continue;
			
			}
			else if(a[i]==i)
				return i;
			else
				return -1;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int a[]=new int[7];
		a[0]=-6;
		a[1]=-4;
		a[2]=-2;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=9;
		int i=getMagicIndex(a,7);
		if(i==-1)
			System.out.println("no magic index");
		else
			System.out.println(i);
	}
}
