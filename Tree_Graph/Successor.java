package Tree_Graph;
public class Successor {
	
	
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
		
		pojo p =new pojo();
		p.flag=0;
		successor(a1, a5, p);
	}
	
	static void successor(TreeNode root,TreeNode node,pojo flag )
	{
		if(root==null)
		{
			return ;
		}
		if(root.left!=null)
		{
			successor(root.left,node,flag);
		}
		if(flag.flag==1)
		{
			System.out.println("succesor is "+root.data);
			flag.flag=0;
			return;
		}
		if(root==node)
		{
			flag.flag=1;
		}
		
		if(root.right!=null)
		{
			successor(root.right,node,flag);
		}
		return;
	}
	
}
