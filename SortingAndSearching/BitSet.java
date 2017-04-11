package SortingAndSearching;

public class BitSet {

	
	int [] bitset;
	BitSet(int n)
	{
		bitset=new int[(n>>5)+1];
		
	}
	boolean get(int pos)
	{
		int wordNumber=(pos>>5);
//		System.out.println("wordnum"+wordNumber+"pos"+pos);
		int bitNumber=(pos & 0x1F);
		return	((bitset[wordNumber]&(1<<bitNumber))!=0);
		
	}
	void set(int pos)
	{
		int wordNumber=(pos>>5);
		int bitNumber=(pos & 0x1F);
		bitset[wordNumber]|=(1<<bitNumber);
	}
	
	
	
}
