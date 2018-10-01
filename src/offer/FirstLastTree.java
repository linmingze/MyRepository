package offer;

public class FirstLastTree {
	
	
	
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 public static TreeNode construct(int[] pre , int[] in,int ps,int pe,int is,int ie)
	 {
		 int rootVal = pre[ps];
		 TreeNode root = new TreeNode(rootVal);
		 root.left = root.right = null;
		 if(ps>pe || is>ie)
		 {
			 return null;
		 }
		 for(int i=ps;i<=pe;i++)
		 {
			 if(in[i]==rootVal)
			 {
				 root.left = construct(pre, in, ps+1, ps+i-is, is, i-1);
				 root.right = construct(pre, in, ps+i-is+1, pe, i+1, ie);
				 break;
			 }
		 }
		 return root;
	 }
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		 if(pre.length<=0 || in.length<=0)
			 return null;
		 
		 
		 return construct(pre, in, 0, pre.length-1, 0, in.length-1);
	        
	    }
	 public static void main(String[] args) {
		int[] a=new int[3];
		System.out.println(a.length);
	}

}
