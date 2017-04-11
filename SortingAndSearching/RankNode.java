package SortingAndSearching;

public class RankNode {

	int data;
	RankNode left,right;
	int leftsize=0;
	RankNode(int n)
	{
		data=n;
	}
	public void insert(int d)
	{
		if(d<=data)
		{
			if(left!=null)
				left.insert(d);
			else
				left=new RankNode(d);
			leftsize++;
		}
		else
		{
			if(right!=null)
			right.insert(d);
			else 
				right=new RankNode(d);
	}
	}
	public int getRank(int d)
	{
		if(data==d)
			return leftsize;
		else if(d<data)
		{
			if(left==null)
				return -1;
			else
				return left.getRank(d);
			}
			else
			{
				int rightRank=right==null?-1:right.getRank(d);
				if(rightRank==-1)
					return -1;
				else
					return leftsize+1+rightRank;
			}
				
			
			
		}
		
	
	
}
