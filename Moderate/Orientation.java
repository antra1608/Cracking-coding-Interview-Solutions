package Moderate;

public enum Orientation{
	
	left,right,up,down;
	public Orientation getTurn(boolean clockwise)
	{
		if(this==left)
		{
			return clockwise?up:down;
		}
		else if(this== up)
		{
			return clockwise?right:left;
		}
		else if(this==down)
		{
			return clockwise?left:right;
		}
		else
		{
			return clockwise?down:up;
		}
	}
}
