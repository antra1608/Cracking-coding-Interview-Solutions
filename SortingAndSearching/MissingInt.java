package SortingAndSearching;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MissingInt {

	
	public static void main(String args[]) throws FileNotFoundException
	{
		MissingInt mi=new MissingInt();
	//	mi.generateFile("input4.txt", 1000, 100);
		mi.findMissing("input4.txt");
	}
	
	void generateFile(String file ,int max,int missing) throws FileNotFoundException
	{
		PrintWriter p=new PrintWriter(file);
		for(int i=0;i<max;i++)
		{
			if(i!=missing)
				p.println(i);
			if (i % 10000 == 0) {
				System.out.println("Now at location: " + i);
			}
			
		}
		p.flush();
		p.close();
		
		
		
	}
	void findMissing(String filename) throws FileNotFoundException 
	{
		long numberOfInt=((long)Integer.MAX_VALUE)+1;
		Scanner sc =new Scanner(new FileReader(filename));
		byte[] bitfield=new byte[(int)(numberOfInt/8)];
	
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
		System.out.println("n is "+n);
			bitfield[(n/8)]|=1<<(n%8);
			
		}
		
		for(int i=0;i<numberOfInt;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((bitfield[i] & (1<<j))==0)
				{
					System.out.println((((i)*8)+j)+"is missing i= "+i+"j = "+j);
					return;
				}
			}
		}
		
	}
	
	
}
