package model;

/**
 * 
 * @author WinHan
 *This class is Node to manipulate the singly linked list. Each Node contains Data, and next pointer
 *
 * Node{
 * 	Node next
 * 	Object data;
 * 
 * }
 *
 */

public class Node  {
	
	Object data;
	Node next;
	
	/**
	 * Node class constructor 
	 * @param data
	 */
	
	public Node(Object e){
		this.data=e;
		
	}
	
	
	/**
	 * This method is to get Nextpointer of a node
	 * @return next
	 */
	public Node getNext() {
		
		return next;
	}
	/**
	 * This method is to set the value of the next pointer of a node
	 * @param next
	 */
	public void setNext(Node temp) {
		this.next=temp;
		
	}
	/**
	 * This method is to retrieve data stored in a node
	 * @return data
	 */
	public Object getData() {
		
		return this.data;
	}
	
	/**
	 * This method is Override toString () method to print the data as String
	 * return ""+ data
	 */
	public String toString(){
		
		return ""+ data;}
	

}
