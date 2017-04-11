package Hard;

public class Shuffle {

	
	static int rand(int low,int high)
	{
		return (low+(int)Math.random()*(high-low+1));
	}
	
	static int[] shuffle(int []cards,int i)
	{
		if(i==0)
			return cards;
		
		shuffle(cards,i-1);
		int k=rand(0,i);
		int temp=cards[k];
		cards[k]=cards[i];
		cards[i]=temp;
		return cards;
	}
	public static void main(String agrs[])
	{
		
		int cards[]={1,2,3,4,5};
		for(int i=0;i<cards.length;i++)
		{	System.out.print(cards[i]);
		}
		cards=shuffle(cards,4);
		System.out.println("**********");
		for(int i=0;i<cards.length;i++)
			System.out.print(cards[i]);
	}
	
}
