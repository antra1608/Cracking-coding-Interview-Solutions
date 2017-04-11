package SortingAndSearching;



public class SortedMatrixSearch {

	
	Coordinate findElement(int [][] matrix,Coordinate origin,Coordinate dest,int x)
	{
	if(!origin.inbounds(matrix) || !dest.inbounds(matrix))
		return null;
	if(matrix[origin.row][origin.column]==x)
		return origin;
	else if(!origin.isBefore(dest))
		return null;
	
	Coordinate start=(Coordinate)origin.clone();
	int diagDist=Math.min(dest.row-origin.row, dest.column-origin.column);
	
	Coordinate end=new Coordinate(start.row+diagDist,start.column+diagDist);
	Coordinate p=new Coordinate(0,0);
	
	
	while(start.isBefore(end))
	{
		p.setToAverage(start, end);
		if(x>matrix[p.row][p.column])
		{
			start.row=p.row+1;
			start.column=p.column+1;
			
		}
		else
		{
			end.row=p.row-1;
			end.column=p.column-1;
		}
	}	
		return partitionAndSearch(matrix,origin,dest,start,x);
		
	}

Coordinate partitionAndSearch(int[][] matrix,Coordinate origin ,Coordinate dest,Coordinate pivot,int x)
{
	Coordinate lowerLeftOrigin=new Coordinate(pivot.row,origin.column);
	Coordinate lowerLeftDest=new Coordinate(dest.row,pivot.column);
	Coordinate upperRightOrigin = new Coordinate(origin.row,pivot.column);
	Coordinate upperRightDest=new Coordinate(pivot.row-1,dest.column);
	
	Coordinate lowerleft=findElement(matrix,lowerLeftOrigin,lowerLeftDest,x);
	if(lowerleft==null)
	{
		return findElement(matrix,upperRightOrigin,upperRightDest,x);
		
	}
	else 
		return lowerleft;
	
}



	
	int search(int[][]a,int m,int n,int x)
	{
		int i=0;
		int j=n-1;
		while(true)
		{
			if(i==m || j==-1)
				return -1;
			if(a[i][j]==x)
				return x;
			else if(a[i][j]<x)
				i++;
			else
				j--;
			
		}
		
	}
	public static void main(String args[])
	{
		SortedMatrixSearch sm=new SortedMatrixSearch();
		int a[][]=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=4;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=6;
		a[2][0]=5;
		a[2][1]=7;
		a[2][2]=7;
		System.out.println(sm.search(a, 3, 3, 10));
	Coordinate origin=new Coordinate(0,0);
	Coordinate dest=new Coordinate(3,3);
	Coordinate loc=new Coordinate(0,0);
	loc=sm.findElement(a, origin, dest, 6);
	//System.out.println("row "+loc.row+"col "+loc.column);
	
	
	}
	
}
