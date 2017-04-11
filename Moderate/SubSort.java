package Moderate;

public class SubSort {

	
	public static int findIndices(int [] arr)
	{
		int dif=0;
		int strt=0;
		int end=arr.length-1;
		
		int m,n;
		while(arr[strt]<=arr[strt+1])
			strt++;
		while(arr[end]>=arr[end-1])
			end--;
		System.out.println("strt "+strt+" end "+end);
		
		for(int i=strt;i<=end-1;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(arr[i]>=arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int i=0;
	//	for(int k=0;k<arr.length;k++)
		//	System.out.println(" "+arr[k]);
		while(arr[i]<arr[strt])
			i++;
		m=i;
		System.out.println("m "+m);
		i=arr.length-1;
		while(arr[i]>arr[end])
			i--;
		n=i;
		System.out.println("n "+n);
		dif=n-m;
		return dif;
	}
	
	public static void main(String args[])
	{
		int arr[]={2,2,4,7,10,11,7,12,1,7,16,18,1};
		System.out.println(findIndices(arr));
		
	}
}
