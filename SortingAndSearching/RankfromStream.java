package SortingAndSearching;

public class RankfromStream {
RankNode root=null;


void track(int number)
{
	if(root==null)
	{
		root=new RankNode(number);
	}
	else
	{
		root.insert(number);
		
	}

}

int getRankOfNumber(int number)
{
	return root.getRank(number);
}
}
