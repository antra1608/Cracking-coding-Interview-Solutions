package DynamicProgramming;

public class RecursiveMultiply {

	int digitMultiply(int a,int b)
	{
		int bigger=(a>b)?a:b;
		int smaller=(a<b)?a:b;
		return digitMultiplyHelper(smaller,bigger);
	}
	
	int digitMultiplyHelper(int smaller,int bigger)
	{
		if(smaller==0)
			return 0;
		else if(smaller==1)
			return bigger;
		else
		{
			int s=smaller>>1;
		    int half=digitMultiplyHelper(s,bigger);
		    if(smaller%2==0)
		    	return half+half;
		    else
		    	return half+half+bigger;
		}
	}
	
	public static void main(String[] args) {

		RecursiveMultiply rs=new RecursiveMultiply();
		System.out.println(rs.digitMultiply(4, 5));
		
		
		
	}

}
