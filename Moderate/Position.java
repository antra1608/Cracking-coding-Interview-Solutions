package Moderate;

public class Position {

	int row;
	int column;
	public Position(int row,int column)
	{
		this.row=row;
		this.column=column;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Position)
		{
			Position p=(Position) o;
			return p.row==row && p.column==column;
		}
		return false;
	}
	
	public int hashCode()
	{
		return (row*31)^column;
	}
	public Position clone()
	{
		return new Position(row,column);
	}
	
}
