package model;

/**
 * 
 * @author WinHan
 *This class is Node to manipulate the doubly linked list. Each Node contains Data,next pointer and previous pointer
 *
 * Node{
 * 	Node next,previous;
 * 	Object data;
 * 
 * }
 *
 */
public class Node {
	
	Node next;
	Node previous;
	Object data;
	
	/**
	 * Node class constructor 
	 * @param data2
	 */
	public Node(Object data2){
		this.data=data2;
		
	}
	
	public Node(){
		data=null;
		previous=null;
		next=null;
		
	}
	public void displayInfo()
	{
	 System.out.print(data + " ");
	 }
	/**
	 * This method is to get Nextpointer of a node
	 * @return next
	 */
	public Node getNext(){
		
		return this.next;	
	}
	
	/**
	 * this method is to get Previous pointer of a node
	 * @return previous
	 */
	public Node getPrevious(){
		
		return this.previous;	
		}
	
	/**
	 * This method is to retrieve data stored in a node
	 * @return data
	 */
	public Object getData(){
		
		return this.data;
		
	}
	
	/**
	 * This method is to set the value of the next pointer of a node
	 * @param next
	 */
	public void setNext(Node next){
		next=this.next;
		
	}
	
	/**
	 * This method is to set the value of the next pointer of a node
	 * @param previous
	 */
	public void setPrevious(Node previous){
		
		previous=this.previous;
	}
	
	/**
	 * This method is Override toString () method to print the data as String
	 * return ""+ data
	 */
	public String toString() {
	    return "" + data;
	  }
}
