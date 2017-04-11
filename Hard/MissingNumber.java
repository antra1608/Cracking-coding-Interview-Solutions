package Hard;

import java.util.ArrayList;

public class MissingNumber {

	
	int findMissing(ArrayList<BitInteger> array)
	{
		
		return findMissing(array,0);
		
	}
	
	
	int findMissing(ArrayList<BitInteger> array,int column)
	{
		if(column>=BitInteger.INTEGER_SIZE)
			return 0;
		
		ArrayList<BitInteger> onebits=new ArrayList<BitInteger>();
		ArrayList<BitInteger> zerobits=new ArrayList<BitInteger>();
		for(BitInteger t:array)
		{
			if(t.fetch(column)==1)
				onebits.add(t);
			else
				zerobits.add(t);
		}
		
		
		if(zerobits.size()<=onebits.size())
		{
			int v=findMissing(array, column+1);
			return (v<<1)|0;
		}
		else
		{
			int v=findMissing(array,column+1);
			return (v<<1)|1;
		}
		
	}
	
	
}
