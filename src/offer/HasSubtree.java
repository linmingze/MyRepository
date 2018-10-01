package offer;

public class HasSubtree {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	 public static boolean  HasSubtree(TreeNode root1,TreeNode root2) {
		 if(root2==null)
			 return false;
	     
	     if(root1==root2){
	    	 if(root2.left!=null)
	    		 HasSubtree(root1.left, root2.left);
	    	 if(root2.right!=null)
	    		 HasSubtree(root1.right, root2.right);
	    	 if(root1.left == null && root1.right==null)
	    		 return true;
	     }
	     return true;
	    }

}
