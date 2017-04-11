package Moderate;

public class Square {

	double top;
	double left;
	double right;
	double bottom;
	double size;
	public Square(double top,double left,double size)
	{
		this.top=top;
		this.left=left;
		this.size=size;
		right=left+size;
		bottom=top+size;
	}
	
	public Point middle()
	{
		return new Point((this.left+this.right)/2.0,(this.top+this.bottom)/2.0);
	}
	
	public boolean contains(Square other)
	{
		return (this.left<=other.left) && (this.right>=other.right) && (this.top>=other.top) && (this.bottom<=other.bottom);
	}
	public Point extend(Point mid1,Point mid2,double size)
	{
		
		int xdir=mid1.x<mid2.x?-1:1;
		int ydir=mid1.y<mid2.y?-1:1;
		
		if(mid1==mid2)
			return new Point(mid1.x,mid1.y+ydir*size/2);
		
		
		double x=0;
		double y=0;
		double slope=0;
		slope=(mid2.y-mid1.y)/(mid2.x-mid1.x);
		
		
		if(Math.abs(slope)==1)
		{
			x=mid1.x+xdir*size/2;
			y=mid1.y+ydir*size/2;
		}
		else if(Math.abs(slope)<1)
		{
			x=mid1.x+xdir*size/2;
			y=mid1.y+slope*(x-mid1.x);
		}
		else
		{
			y=mid1.y+ydir*size/2;
			x=mid1.x+(y-mid1.y)/slope;
		}
		
		
		return new Point(x,y);
	}
	
	public Line cut(Square other)
	{
		Point p1=extend(this.middle(),other.middle(),this.size);
		Point p2=extend(this.middle(),other.middle(),-1*this.size);
		Point p3=extend(other.middle(),this.middle(),this.size);
		Point p4=extend(other.middle(),this.middle(),-1*this.size);
		
		Point start=p1;
		Point end=p1;
		Point[] points={p2,p3,p4};
		
		for(int i=0;i<points.length;i++)
		{
			if(points[i].x<start.x || (points[i].x==start.x && points[i].y<start.y))
			{
				start=points[i];
			}
			else if(points[i].x>end.x || (points[i].x==end.x && points[i].y>end.y))
			{
				end=points[i];
			}
			
		}
		return new Line(start,end);
		
	}
	
	public String toString()
	{
		return "("+left+","+top+")|("+right+","+bottom+")";
	}
	
	
	
	
	
	
}
