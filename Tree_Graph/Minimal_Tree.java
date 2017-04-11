package Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data)
	{
		this.data=data;
	}
}
public class Minimal_Tree {
	
	public static void main(String args[])
	{
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		TreeNode a5=new TreeNode(5);
		TreeNode a6=new TreeNode(6);
		TreeNode a7=new TreeNode(7);
		
		a1.left=a2;
		a1.right=a3;
		a2.left=a4;
		a2.right=a5;
		a3.left=a6;
		a3.right=a7;
		
		ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
		result=createLevelLinkedList(a1);
		int i=0;
		while(result.size()>i)
		{
			LinkedList<TreeNode> ll =new LinkedList<TreeNode>();
			ll=result.get(i);
			int j=0;
			while(ll.size()>j)
			{
				TreeNode t=ll.get(j);
				System.out.print(t.data+"   ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	
	
public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root)
{
	ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
	LinkedList<TreeNode> current=new LinkedList<TreeNode>();
	if(root!=null)
	{
		current.add(root);
	}
	while(current.size()>0)
	{
		result.add(current);
		LinkedList<TreeNode> parents=current;
		current=new LinkedList<TreeNode>();
		for(TreeNode parent:parents)
		{
			if(parent.left!=null)
				current.add(parent.left);
			if(parent.right!=null)
				current.add(parent.right);
		}
	}
	
	return result;
}
}
