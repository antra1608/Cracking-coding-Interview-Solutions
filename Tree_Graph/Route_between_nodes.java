package Tree_Graph;

import java.util.LinkedList;

//enum State{unvisited,visited,visiting;}

class Node
{
	public String name;
	public Node[] children;
	public String state;
	Node(String name,String state)
	{
		this.name=name;
		this.state=state;
		
	}
	public Node[] getAdjacent()
	{
		
		return children;
		
	}
	
}
class Graph
{
	public Node[] nodes;

	public Node[] getNodes()
	{
		return nodes;
	}
}

public class Route_between_nodes {
	
	
	public static void main(String args[])
	{
		Node a=new Node("a","unvisited");
		Node b=new Node("b","unvisited");
		Node c=new Node("c","unvisited");
		Node d=new Node("d","unvisited");
		Node e=new Node("e","unvisited");
		Node[] a1=new Node[3];
		Node[] d1=new Node[3];
		Node[] c1=new Node[3];
		Node[] b1=new Node[3];
		
		a1[0]=b;
		a1[1]=c;
		a1[2]=d;
		
		d1[0]=c;
		c1[0]=b;
		b1[0]=e;
		a.children=a1;
		c.children=c1;
		b.children=b1;
		d.children=d1;
		
		Graph g=new Graph();
		Node[] n=new Node[5];
		
		n[0]=a;
		n[1]=b;
		n[2]=c;
		n[3]=d;
		n[4]=e;
		g.nodes=n;
		if(search(g,d,a))
			System.out.println("path exits");
		else
			System.out.println("path does not exits");
		
	}
	
	static boolean search(Graph g,Node start,Node end)
	{
		if(start==end)
			return true;
		
		// operates as queue
		LinkedList<Node> q =new LinkedList<Node>();
		
		for(Node u: g.getNodes())
		{
			u.state="unvisited";
		}
		
		start.state="visiting";
		q.add(start);
		Node u;
		while(!q.isEmpty())
		{
			u=q.removeFirst();
			if(u!=null)
			{
				Node[] x=u.getAdjacent();
				try{
				for(Node v:x)
				{
					if(v!=null)
					if("unvisited".equalsIgnoreCase(v.state))
					{
						if(v==end)
							return true;
						else
						{
							v.state="visiting";
							q.add(v);
						}
					}
				}
				}
				catch(Exception e)
				{
					return false;
				}
				u.state="visited";
			}
		}
		
		return false;
	}
}
