package Moderate;

import java.util.HashMap;

public class PondSizes {

	public static int getPondSize(int a[][],int m,int n)
	{
		int count=0;
		HashMap<NewPond,Integer> map=new HashMap<NewPond,Integer>();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					NewPond pond=new NewPond(i,j);
					getPond(a,i,j,m,n,pond,map);
					System.out.println(map.get(pond));
					count++;
		//			displayPond(a,m,n);
				}
			}
		}
		int i=0;
		while(i!=map.size())
		{
	//		System.out.println("pond size"+map.get(i));
			i++;
		}
		return count;
		
	}
	
	public static void displayPond(int a[][],int m,int n)
	{
		System.out.println("Aftr changes");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(" "+a[i][j]);
			System.out.println();
		}
	}
	 public static void getPond(int a[][],int i,int j,int m,int n,NewPond pond,HashMap<NewPond,Integer> map)
	 {
		 if( (i<m && i>=0) && (j<n && j>=0) && a[i][j]==0 )
		 {
			 a[i][j]=-1;
			 if(!map.containsKey(pond))
			 {
				 map.put(pond, 1);
			 }
			 else
			 {
				 map.put(pond, map.get(pond)+1);
			 }
			 getPond(a,i+1,j,m,n,pond,map);
			 getPond(a,i+1,j+1,m,n,pond,map);
			 getPond(a,i,j+1,m,n,pond,map);
			 getPond(a,i+1,j-1,m,n,pond,map);
			 
		 }
		 else
			 return ;
		 
	 }
	
	 public static void main(String args[])
	 {
		 
		 int b[]={0,2,1,0};
		 int a[][]={b,{0,1,0,1},{1,1,0,1},{0,1,0,1}};
		 System.out.println(getPondSize(a,4,4));
		 
	 }
}
