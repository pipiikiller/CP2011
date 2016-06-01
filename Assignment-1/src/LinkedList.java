/*@uthor K.A.Gowtham
 * The implementation of this class is to manipulate the data for singly linked list
 * 
 * 
 * Node head 
 * 
 * integer size
 * 
 * 
 * head = new Node(null) // Initialize the head to new Node where the value is null
 * 
 * 
 * size = 0 // Initialize the size is equal to zero
 * 
 * 
 */

public class LinkedList
{
	
	private Node head;
	private int size;
	
	
	public LinkedList()
	{
		
		head = new Node(null);
		size = 0;
	}
	/*Node temp = new Node (data)
	 * Node Current = head 
	 * 
	 * While current.getNext != null
	 * current = current.getNext()
	 * 
	 * current.setNext(temp)
	 * 
	 * size ++// this means it is gonna return the value first and increase the size
	 * 
	 * endWhile
	 */
	
	
	/* the purpose of the method is to store/add the temp in to new node and where the current node is equal to head
	 * 
	 *While current.getNext() is not equal to null 
	 *  current = current.getNext()
	 * endWhile 
	 * current.setNext(temp)
	 * size ++
	 */
	
	public void add(StockTicker data)
	{
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		current.setNext(temp);
		size++;
	}
	
	/* add the item to the list
	 * 
	 * Node temp = new Node (data)
	 * 
	 * Node current = head
	 * 
	 * for i equal to 1; i less than index and current.getNext() not equal to null; i ++
	 * 
	 * current = current.getnext()
	 * 
	 * endFor 
	 * 
	 * temp.setNext(current.getNext())
	 * 
	 * current.setNext(temp)
	 * size++
	 */
	
	public void add(StockTicker data, int index)
	{
		Node temp = new Node(data);
		Node current = head;
		
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());
		
		current.setNext(temp);
		size++;
	}
	/*Get the item from the list
	 * My explanation for this part is not that correct but when u look through the code u will be understanding it better.
	 * 
	 * if index less than or equal to 0 
	 * return null
	 * 
	 * Node current = head.getNext()
	 * 
	 * For integer = 1; i less than index; i++
	 * 
	 *       if current.getNext() equal to null
	 *       return null 
	 * 
	 *  current = current.getNext()
	 *  
	 *  endFor
	 * return current.getData()
	 * 
	 */
	
	
	public StockTicker get(int index)
	{
		
		if(index <= 0)
			return null;
		
		Node current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getData();
	}
	
	
	
	/*remove the item from the list
	 * if the current which is equal to head is equal to null then it will return false
	 * it will go to next next head of the node
	 * it will eventually decrease the size
	 * 
	 * if index less than 1 or index greater than size 
	 *   return false 
	 *   
	 * Node current = head;  
	 * For integer i equal to 1; i less than index; i++
	 *       if current.getNext() == null
	 *          return false 
	 * 
	 *      current = current.getNext()
	 *      
	 * endFor
	 * 
	 * size--      
	 * 
	 * return true
	 * 
	 */
	
	public boolean remove(int index)
	{
		if(index < 1 || index > size())
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--;
		return true;
	}
	
	
	/*
	 * find the item in the list
	 * 
	 * StockTicker [] find (double data)
	 * Node elem = head.next
	 * int count = 0
	 * StockTicker[] results = new StockTicker[size];// Initialize the StockTicker array object
	 * while elem not equal to null and elem.getData() not equal to null
	 *      if elem.getData().getPrice() == data 
	 *      results[count++] equal to elem.getData
	 * 
	 * endWhile
	 * 
	 * elem equal to elem.getnext()
	 * 
	 * StockTicker array returns = new StockTicker[count]  // Initialize another array object
	 * For int i equal to zero; i less than count; i++
	 *      return[i] = reuslts[i]
	 * return returns // return the returns array
	 */
	
	
	public StockTicker[] find(double data) {
	    Node elem = head.next;
	    int  count = 0;
	    StockTicker[] results = new StockTicker[size];
	    while (elem != null && elem.getData() != null) {
	    	if(elem.getData().getPrice() == data){
	    		results[count++]= elem.getData();
	    	}
	        elem = elem.getNext();
	    }
	    StockTicker[] returns = new StockTicker[count];
        for(int i=0; i< count; i++)
        	returns[i] = results[i];
	    return returns;
	}
	// this method is to get the size of the linked list
	// int size()
	// return size
	public int size()
	{
		return size;
	}
	
	/*this method is to print the data in linkedlist manner
	 * 
	 * Node current = head.getNext()// get the data from the head of the node
	 * 
	 * String output = ""
	 * 
	 * While current not equal to null
	 * output = output + "[" + current.getData().toString() + "]"
	 * 
	 * current = current.getNext() // to check whether there is any data after the head 
	 * 
	 * endWhile 
	 * 
	 * 
	 * return output
	 * 
	 * 
	 * 
	 * 
	 */
	public String toString()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
	/*The node class is used to manipulate the singly linkedlist. All the nodes contains data and next pointer
	 * 
	 * Node
	 * 
	 * Node next
	 * 
	 * StockTicker data
	 * 
	 * 
	 */
	private class Node
	{
		
		Node next;
		StockTicker data;
		
		/*this the constructor for node class \
		 * 
		 * 
		 */
		
		public Node(StockTicker data)
		{
			next = null;
			this.data = data;
		}
		
		/*the purpose of this mehtod is to store the data of the node
		 * 
		 * 
		 * 
		 * 
		 */
		
		public StockTicker getData()
		{
			return data;
		}
		/*
		 * The purpose of this method is to look/get next pointer of the node
		 * 
		 */
		
		public Node getNext()
		{
			return next;
		}
		
		
		/*
		 * The purpose of this method is to set the value for the next pointer of the node 
		 * 
		 */
		
		public void setNext(Node next)
		{
			this.next = next;
		}
	}
}
