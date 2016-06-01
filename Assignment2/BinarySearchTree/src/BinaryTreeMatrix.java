/**
 * This class is to build binary search tree
 * @author WinHan
 *
 */
public class BinaryTreeMatrix {
	
	static TreeNode root;
	/**
	 * @param num
	 * @overload sortedArrayToBST method
	 * if(num.length==0)
	 * 	return null
	 * 
	 * return sortedArrayToBST(num, 0, num.length - 1);
	 */
	public TreeNode sortedArrayToBST(String[] num) {
		if (num.length == 0)
			return null;
 
		return sortedArrayToBST(num, 0, num.length - 1);
	}
 /**
  * 
  * @param num
  * @param start
  * @param end
  * @return root
  * 
  * if(start>end)
  * 	null
  * int mid=(start+end)/2
  * root= mid
  * left=sortedArrayToBST(num,start,mid-1);
  * right=sortedArrayToBST(num,mid+1,end);
  */
	public TreeNode sortedArrayToBST(String[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}
	/**
	 * print all the nodes
	 * @param node
	 * if(node=null){
	 * 	return null
	 * }
	 * 
	 * print node.val
	 * preOrder(node.left)
	 * preOrder(node.right)
	 */
	public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}