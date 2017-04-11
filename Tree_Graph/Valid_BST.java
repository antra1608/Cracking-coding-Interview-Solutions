package Tree_Graph;

public class Valid_BST {

	public static void main(String args[])
	{
		TreeNode a1=new TreeNode(3);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(4);
		TreeNode a4=new TreeNode(1);
		TreeNode a5=new TreeNode(5);
		a1.left=a2;
		//a1.right=a3;
		a2.left=a4;
		//a3.right=a5;
		if(validBST(a1,null,null))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
	

	static boolean validBST(TreeNode root,Integer min,Integer max)
	{
		if(root==null)
			return true;
		if((min!=null && root.data<=min) || (max!=null && root.data>=max))
			return false;
		if(!validBST(root.left,min,root.data) || !validBST(root.right,root.data,max))
			return false;
		return true;
	}
	
}
