package Moderate;

public class Point {

	
	double x;
	double y;
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public boolean isEqual(Point p)
	{
		if((this.x==p.x)&&(this.y==p.y))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "x = "+x+" y = "+y;
	}
	
	
}
