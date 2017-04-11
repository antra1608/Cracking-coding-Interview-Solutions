package Tree_Graph;

public class Common_ancester {

	public static void main(String a[])
	{
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		TreeNode a5=new TreeNode(5);
		 a1.left=a2;
		 a1.right=a5;
		 a2.right=a3;
		 a3.right=a4;
	
	TreeNode ans=commonAncester(a1, a4, a3);
	System.out.println("ancestor is"+ans.data);
	
	
	
	}
	
	static TreeNode commonAncester(TreeNode root,TreeNode p,TreeNode q)
	{
		if(!covers(root,p) || !covers(root,q))
		{
			return null;
		}
		return ancestorHelper(root,p,q);
	
	}
	
	static TreeNode ancestorHelper(TreeNode root, TreeNode p,TreeNode q)
	{
		if(root==null || root==p || root==q)
		return root;
		 boolean pIsOnLeft=covers(root.left,p);
		 boolean qIsOnLeft=covers(root.left,q);
		 if(pIsOnLeft!=qIsOnLeft)
			 return root;
		 TreeNode childSide=pIsOnLeft ? root.left : root.right;
		 return ancestorHelper(childSide, p, q);
		 
		
	}
	
	static boolean covers(TreeNode root,TreeNode p)
	{
		if(root==null) return false;
		if(root==p)
			return true;
		return covers(root.left,p) || covers(root.right,p);
	}
	
}
