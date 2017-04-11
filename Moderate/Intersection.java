package Moderate;

public class Intersection {

	Coord getIntersection(Coord a1,Coord a2,Coord b1,Coord b2){
		
		Coord ans=new Coord(0,0);
		
		float slope1=((a2.getY()-a1.getY())/(a2.getX()-a1.getX()));
		float slope2=((b2.getY()-b1.getY())/(b2.getX()-b1.getX()));
		if(slope1==slope2)
			return null;
		else
		{
			float m1,c1;
			float m2,c2;
			float equ1[] =new float[3];
			float equ2[] =new float[3];
			
			
			m1=slope1;
			c1=0;
			m2=slope2;
			c2=0;
			
			//y1=m1*x1+c1;
			//y2=m2*x2+c2;
			
			c1=(a1.getY()-(m1*a1.getX()));
			c2=(b1.getY()-(m2*b1.getX()));
			System.out.println("slope 1 "+m1+"slope 2"+m2);
			equ1[0]=1;
			equ1[1]=m1;
			equ1[2]=c1;
			equ2[0]=1;
			equ2[1]=m2;
			equ2[2]=c2;
			
			
			for(int i=0;i<3;i++)
				equ1[i]*=m2;
			
			for(int i=0;i<3;i++)
				equ2[i]*=(m1*(-1));
			
			for(int i=0;i<3;i++)
				System.out.println(equ1[i]);
			
			for(int i=0;i<3;i++)
				System.out.println(equ2[i]);
			
			ans.setY((equ1[2]+equ2[2])/(equ1[0]+equ2[0]));
			ans.setX((ans.getY()-c1)/m1);
		}
		return ans;
	}
	
	
	public static void main(String args[])
	{
		
		
		Intersection i=new Intersection();
		Coord a1=new Coord(3,7);
		Coord a2=new Coord(5,11);
		Coord b1=new Coord(1,2);
		Coord b2=new Coord(6,4);
		
		Coord ans=i.getIntersection(a1, a2, b1, b2);
		System.out.println("x= "+ans.getX()+" y = "+ans.getY());
		
	
	
	}
	
	
}
