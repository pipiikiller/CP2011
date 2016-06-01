
/*@uthor K.A.Gowtham
 * class BinarySearchTree
 * public Node root
 *
 *constructor method for BinarySearchTree 
 * 
 * public BinarySearchTree()
 *     this.root = null
 */

public class BinarySearchTree {
	public Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	
	/*find method. Used to insert the values on to left or right based on the getPrice value
	 * 
	 * public boolean find(StockTicker id)
	 * Node current = root
	 * 
	 * While (current not equal to null)
	 *       if (current.data equals to id) 
	 *        return true
	 * 
	 *       else if current.data.getPrice()>id.getPrice()
	 *       current = current.left  // adds to the left side of the binary search tree
	 *       
	 *       else current = current.right  // adds to the right side of the binary search tree
	 *       
	 * end if and else       
	 * endWhile
	 * 
	 * return false       
	 *        
	 */
	
	
	public boolean find(StockTicker id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data.getPrice()>id.getPrice()){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	
	
	/*This method is to insert the node
	 * 
	 * Node newNode = new Node(id)
	 * if root equals null
	 *     root = newNode
	 *      return
	 *endif 
	 *
	 * Node current = root 
	 * 
	 * Node parent = null 
	 * 
	 * While true 
	 *     parent = current 
	 *     if id.getPrice() < current.data.getPrice()
	 *     current = current.left // adds the parent to the left side 
	 *       if current equals to null
	 *             parent.left = new Node // adds a new node to the parent on the left
	 *             return   
	 * 
	 *   else 
	 *       current = current.right
	 *       if current equals to null
	 *        parent.right = newNode // adds new node to parent on the right 
	 *        return             
	 *end if and else               
	 *               
	 */
	
	
	public void insert(StockTicker id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id.getPrice() < current.data.getPrice()){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	/*this method is used to display the tree
	 * it will display from the root
	 * which is not going to return anything
	 * public void display FromRoot(Node root)
	 *   if (root not equal to null) 
	 *     displayFromRoot(root.left) // displays from the root on the left side
	 *     print root data
	 *     displayFromRoot(root.right) // displays the root on the right side
	 *     
	 *endif      
	 */
	
	
	
	
	public void display(){
		displayFromRoot(root);
	}
	private void displayFromRoot(Node root){
		if(root!=null){
			displayFromRoot(root.left);
			System.out.print(" " + root.data.getPrice());
			displayFromRoot(root.right);
		}
	}
	
}


/*this class is for Node
 * class Node
 * StockTicker data
 * Node left 
 * Node right 
 * 
 * setter constructor method for node 
 * 
 * public Node(StockTicker data)
 *   this.data = data 
 *    left = null
 *    right = null
 *    
 */

class Node{
	StockTicker data;
	Node left;
	Node right;	
	public Node(StockTicker data){
		this.data = data;
		left = null;
		right = null;
	}
}