package Moderate;

public class LivingPeople {

int getMostYear(int[] birth,int[] death)
{
	int year[]=new int[1001];
	for(int i=0;i<1001;i++)
		year[i]=0;
	
	
	for(int i=0;i<birth.length;i++)
	{
		for(int j=birth[i];j<=death[i];j++)
		{
			year[j]++;
		}
	}
	
	int max=0;
	for(int i=0;i<1001;i++)
	{
		if(year[i]>=max)
			max=i;
	}
	for(int i=0;i<9;i++)
	{
	System.out.println(year[i]);	
	}
	
	return max;

}

public static void main(String args[])
{
LivingPeople lp=new LivingPeople();
int [] birth={1,4,3,2};
int[] death={2,7,8,7};
System.out.println(lp.getMostYear(birth, death));
}




}
