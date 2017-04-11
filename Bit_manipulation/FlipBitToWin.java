package Bit_manipulation;

public class FlipBitToWin {

public static void main(String args[])
{
int i=65;
int k=0;
boolean a[]=new boolean[32];
while(i!=0)
{
	if(i%2==0)
		a[k]=false;
	else 
		a[k]=true;
	i=i/2;
	k++;
}
int j=0;
int p=0;
int b[]=new int[32];
int e[]=new int[32];

while(true)
{
	if(j==32)
		break;
	k=j;
	while(a[j]==true)
		j++;
	b[p]=k;
	e[p]=j-1;
	p++;
	if(j==32)
		break;
	
	while(j!=32 && a[j]==false )
		{
		j++;
		}
	
}

int max=0;
j=0;
while(true)
{
	if(e[j]+2==b[j+1])
	{
		if(max<e[j+1]-b[j]+1)
			max=e[j+1]-b[j]+1;
		
	}
	j++;
	if(b[j]==0)
		break;
}
System.out.println("max"+max);

}


}
