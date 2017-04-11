package SortingAndSearching;

public class SparseSearch {

	int search(String []strings,String x,int first,int last)
	{
		if(first>last)
			return -1;
		int mid=(first+last)/2;
		if(strings[mid].isEmpty())
		{
			int right=mid+1;
			int left=mid-1;
			while(true)
			{
				if(right<=last && !strings[right].isEmpty())
				{
					mid=right;
					break;
				}
				else if(left>=first && !strings[left].isEmpty())
				{
					mid=left;
					break;
				}
				left--;
				right++;
				
			}
			
		}
		if(strings[mid].equals(x))
		{
			return mid;
		}
		else if(strings[mid].compareTo(x)<0)
		{
			return search(strings,x,first,mid-1);
		}
		else if(strings[mid].compareTo(x)>0)
		{
			return search(strings,x,mid+1,last);
		}
		return -1;
		
	}
	
	int search(String[]strings,String str)
	{
		if(strings==null || str==null|| str=="")
			return -1;
		
		return search(strings,str,0,strings.length-1);
		
	}
	public static void main(String  args[])
	{
		SparseSearch ss=new SparseSearch();
		String[] strings={"at","","","","ball"};
		System.out.println(ss.search(strings, "ball"));
	}
}
