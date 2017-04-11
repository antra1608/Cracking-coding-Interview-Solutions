package Moderate;

import java.util.HashSet;

public class Board {

	private HashSet<Position> whites=new HashSet<Position>();
	private Ant ant=new Ant();
	private Position topLeftCorner=new Position(0,0);
	private Position bottomRightCorner=new Position(0,0);
	public Board()
	{
		
	}
	 public void moveK(int k)
	{
		for(int i=0;i<k;i++){
		ant.turn(isWhite(ant.position));
		flip(ant.position);
		ant.move();
		ensureFit(ant.position);
		System.out.println("printting***************");
		System.out.println(printS());
		
		
		}
		
	}
	private void flip(Position position)
	{
		if(whites.contains(position))
		{
			whites.remove(position);
		}
		else
		{
			whites.add(position);
		}
	}
	
	private void ensureFit(Position position)
	{
		int row=position.row;
		int column=position.column;
		topLeftCorner.row=Math.min(topLeftCorner.row, row);
		topLeftCorner.column=Math.min(topLeftCorner.column, column);
		bottomRightCorner.row=Math.max(bottomRightCorner.row, row);
		bottomRightCorner.column=Math.max(bottomRightCorner.column, column);
	}
	
	
	public boolean isWhite(Position p)
	{
		return whites.contains(p);
	}
	
	public boolean isWhite(int row,int column)
	{
		return whites.contains(new Position(row,column));
	}
	public  String printS()
	{
		StringBuilder sb=new StringBuilder();
		int rowMin=topLeftCorner.row;
		int rowMax=bottomRightCorner.row;
		int columnMin=topLeftCorner.column;
		int columnMax=bottomRightCorner.column;
		
		for(int r=rowMin;r<=rowMax;r++)
		{
			for(int c=columnMin;c<=columnMax;c++)
			{
				if(r==ant.position.row && c==ant.position.column)
				{
					sb.append(ant.orientation);
				}
				else if(isWhite(r,c))
				{
					sb.append("x");
				}
				else
				{
					sb.append("_");
				}
				sb.append("\n");
			}
		}
		sb.append("Ant: "+ant.orientation+"\n");
		return sb.toString();
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		int rowMin=topLeftCorner.row;
		int rowMax=bottomRightCorner.row;
		int columnMin=topLeftCorner.column;
		int columnMax=bottomRightCorner.column;
		
		for(int r=rowMin;r<=rowMax;r++)
		{
			for(int c=columnMin;c<=columnMax;c++)
			{
				if(r==ant.position.row && c==ant.position.column)
				{
					sb.append(ant.orientation);
				}
				else if(isWhite(r,c))
				{
					sb.append("x");
				}
				else
				{
					sb.append("_");
				}
				sb.append("\n");
			}
		}
		sb.append("Ant: "+ant.orientation+"\n");
		return sb.toString();
	}
	public static void main(String args[])
	{
		Board b=new Board();
		System.out.println(b.toString());
		b.moveK(3);
	//	System.out.println(b.toString());
	}
	
}
