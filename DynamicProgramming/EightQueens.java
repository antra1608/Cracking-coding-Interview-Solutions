package DynamicProgramming;

import java.util.ArrayList;

public class EightQueens {

	int GRID_SIZE=8;
	
	void placeQueens(int row,Integer[] columns,ArrayList<Integer[]> results)
	{
		if(row==GRID_SIZE)
		{	results.add(columns.clone());
			return;
		}
		
		for(int i=0;i<GRID_SIZE;i++)
		{
			if(checkValid(columns,row,i))
			{
				columns[row]=i;
				placeQueens(row+1,columns,results);
				
				
			}
			
		}
		
	}
	
	boolean checkValid(Integer [] columns,int row,int col)
	{
		for(int row1=0;row1<row;row1++)
		{
			if(col==columns[row1])
				return false;
			if(((Math.abs(columns[row1]-col)))==(Math.abs((row1-row))))
					{
				return false;
					}
		}
		return true;
		
	}
	
	public static void main(String args[])
	{
		EightQueens eq=new EightQueens();
		ArrayList<Integer[]> results=new ArrayList<Integer[]>();
		Integer[] column=new Integer[8];
		eq.placeQueens(0, column, results);
		for(int i=0;i<results.size();i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(column[j]);
			}
			System.out.println();
		}
	}
	
}
