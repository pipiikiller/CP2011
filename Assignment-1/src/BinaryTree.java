import java.util.ArrayList;
import java.util.List;
/*@uthor K.A.Gowtham
 * class BinaryTree
 * private Node root
 * 
 * private class Node 
 * Node left 
 * Node right
 * StockTicker data
 * 
 * Node (StockTIcker newData)
 * left equal to null
 * 
 * right equal to null
 * 
 * data = new Data
 */



public class BinaryTree { 
   
  private Node root; 
 
  private class Node { 
    Node left; 
    Node right; 
    StockTicker data;
    
    Node(StockTicker newData) { 
      left = null; 
      right = null; 
      data = newData; 
    }
    
  }

  /*
   * this a method for binary tree
   * 
   * public BinaryTree
   * root equal to null
   * 
   */
  
  
  public BinaryTree() { 
    root = null; 
  } 

  /*this method is for List StockTicker array list look up which return nothing
   * 
   * public List<StockTicker> lookup (double data)
   * return (lookup(root, data))
   * 
   */
  
  public List<StockTicker> lookup(double data) { 
    return(lookup(root, data)); 
  } 
 
/*
 * this method is private List StockTicker array list look up 
 * 
 * private List<StockTicker> lookup(Node, node, double data)
 * List arraylist StockTicker results = new ArrayList<StockTicker>() // Initialize new arraylist object 
 * If node equals null
 *    results = new ArrayList<StockTicker>()
 *endIf    
 * If node not equal to null and data equals to node.getPrice()    
 *     results.add(node.data) // adds the data to the arraylist
 *     
 *     If node.left not equal to null
 *        results.addAll(lookup(node.left, data)) // adds the data to the left 
 *     
 *     If node.right not equal to null
 *         results.addAll(lookup(node.right, data))
 *    
 *  else if node not equal to null and data less than node.data.getPrice()  
 *        results.addAll(lookup(node.left, data))
 * 
 * else if node not equal to null    
 *      results.addAll(lookup(node.right, data))
 *      
 * endIf and Else     
 * 
 * return results
 */
  
  private List<StockTicker> lookup(Node node, double data) {
	List<StockTicker> results = new ArrayList<StockTicker>();
    if (node==null) { 
    	results = new ArrayList<StockTicker>(); 
    }

    if (node != null && data==node.data.getPrice()) { 
    	results.add(node.data);
    	if(node.left != null)
    		results.addAll(lookup(node.left, data));
    	if(node.right != null)
    		results.addAll(lookup(node.right, data)); 
    } 
    else if (node != null && data < node.data.getPrice()) { 
    	results.addAll(lookup(node.left, data)); 
    } 
    else if(node != null){ 
    	results.addAll(lookup(node.right, data)); 
    } 
    return results;
  } 
 

  /*this method/function is to insert data
   * which return nothing 
   * 
   * public void insert(StockTicker data)
   * root = insert(root, data) // inserts the data to the root
   */
  public void insert(StockTicker data) { 
    root = insert(root, data); 
  } 
 
/*this private methos/fucntion  to insert node into the tree (i mean left or right side of the binary tree)
 * 
 * private Node insert(Node node, StockTicker data)
 * 
 * If node equals to null
 *    node = new Node(data)
 *    
 *   else
 *      if data.getprice() lessthan or equal to node.data.getPrice() 
 *          node.left = insert(node.left,  data) // adds data to the left side of the binary tree
 *          
 *    else       
 *       node.right = insert(node.right, data)
 *       
 *end If and  else       
 * 
 *return node 
 * 
 */
   
  private Node insert(Node node, StockTicker data) { 
    if (node==null) { 
      node = new Node(data); 
    } 
    else { 
      if (data.getPrice() <= node.data.getPrice() ) { 
        node.left = insert(node.left, data); 
      } 
      else { 
        node.right = insert(node.right, data); 
      } 
    }

    return(node); 
  } 
}