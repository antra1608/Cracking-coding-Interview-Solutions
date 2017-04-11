package SortingAndSearching;

public class FindDuplicate {

	void checkDuplicates(int [] array)
	{
		BitSet bs=new BitSet(32000);
		for(int i=0;i<array.length;i++)
		{
			int num=(array[i]-1);
			//System.out.println("num "+num);
			if(bs.get(num))
			{
				System.out.println(num+1);
			}
			else
			{
				bs.set(num);
			}
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		FindDuplicate fd=new FindDuplicate();
		int [] array=new int[10];
		for(int i=0;i<10;i++)
		{
			if(i==5)
				array[i]=5;
			else
				array[i]=i+1;
			
		}
		for(int i=0;i<10;i++)
			System.out.println(array[i]);
		fd.checkDuplicates(array);
		
		
	}


}
