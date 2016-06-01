package model;

import java.lang.reflect.Array;
/**
 * 
 * @author WinHan
 *	This class is to manipulate nodes in a single linked list manner
 * 
 *	Node head;
 *  int size;
 */
public class SinglyLinkMatrix {
	private Node head;
	private int size;
	/**
	 * 
	 * @param data
	 * Node temp = new Node(data)// to store data in temp before setting to next node
	 * Node currnetn =head
	 * 
	 * if head=null{
	 * 		head=temp
	 * }
	 * 
	 * else{ 
	 * 	loop(current.next!=null){
	 * 		current = current.getNext()			
	 * }
	 * 	current.setNext(temp)
	 * }
	 * size++
	 */
public void add(Object data){
		
		Node temp= new Node(data);
		Node current= head;
		
		if(head==null){
			head=temp;
		}else{
			
			while(current.getNext()!=null){
				current= current.getNext();
				
			}
			current.setNext(temp);
		}
				
		this.size++;
	}

/**
 * This method is to search the data from the linked list
 * @param data
 * Node searchNode= new Node(data);
 * Node current =head;
 * int count=0;
 * loop(current!=null){
 *  array= current.toString().split(",");
 *  if(array[ index 2] = searchNode){
 *  	print array
 *  	count++;
 *  }
 *  	current=current.next;	
 *  		}
 *  	if(count>0){
 *  	print("Found this,singly");
 *  	print("The number of times is"+count);
 *  	return count;
 *  		}else{
 *  		System.out.println("Not Found,"+" The number of result found is");
 *  		return 0;
		}
 * @return
 */
	public int SearchItem(Object data){
		
		int count=0;
		Node searchNode= new Node(data);
		Node current=head;
		if (head==null){
			return 	0;
			
			}else{
		
				while(current!=null){
					String [] array= current.getData().toString().split(",");
					
					if(array[2].equals(searchNode.toString())){
						
						System.out.println(current.getData().toString());
						count++;
					
					}
					current=current.getNext();
				}
				if(count>0){
					
					System.out.println("Found this,singly");
					System.out.println("The number of times is");
					return count;
				}
				else{
					
					System.out.println("Not Found,"+" The number of result found is");
					return count;
				}	
			}	
		}
	
	/**
	 * This method is to get the size of the singly linked list
	 * @return size
	 */
	public int size() {
		
		return this.size;
	}

	
	/**
	 * This method is override toString() method to print data in the linkedList
	 * String list=""
	 * list = head.getData // get the data from the head of the node
	 * 
	 *Then check whether there is another data after the head with loop
	 * 
	 * Node curr= head.getNext
	 * while (curr != null){
	 * 		list += "[" + curr.getData() + "]"
	 * 		curr = curr.getNext()
	 *  }
	 *  return list
	 */
	public String toString() {
		String list = "";
		list += "[" + this.head.getData() + "]";

		Node curr = head.getNext();
		while (curr != null){
			list += "[" + curr.getData() + "]";
			curr = curr.getNext();
    }

    return list;

}
	
	
}
