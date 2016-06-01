package model;


/**
 * class DoublyLink Matirx
 * 
 * Node head,tail,temp,current
 * int size
 * 
 * DoublyLinkMatrix(){// constructor method , the default value of head and tail will be null
 * 	head=null
 * 	tail=null
 * 
 * }
 * 
 */
import java.util.Arrays;

public class DoublyLinkMatrix {
	
	static Node head;
	Node tail;
	Node temp;
	static Node current;
	int size;
	
	public DoublyLinkMatrix(){
		
		head=null;
		tail=null;
	}
	
	/**
	 * @param data
	 * 
	 * add(){ // add function to add 
		 newLink = new Node(data)
		 if head = null;
		 	head = newLink;
		 	head.previous=null
		 	head.next=null
		 	
		 	else
		 		current =head;
		 		loop(current.next!=null){
				 current= current.next;
				 
			 }
			 current.next=newLink;
			 newLink.previous=current;
			 newLink.next=null;
		 		
		  }
		 */
	public void add(Object data){
		
		 Node newLink = new Node(data);
		
		 if(head==null){
			 head= newLink;
			 head.previous=null;
			 head.next=null;
			 
		 }else{
			 
			 current =head;
			 while(current.next!=null){
				 current= current.next;
				 
			 }
			 current.next=newLink;
			 newLink.previous=current;
			 newLink.next=null;
		 }
		 }
		
	
	/**
	 * This method is to get the size of the linked list
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	
/**
 * This method returns when the linked list is empty
 * @return
 */
	public boolean isEmpty(){
		
		return head==null;
	}
	
	/**
	 * This method is to search the data from the linked list
	 * @param s
	 * Node searchNode= new Node(s);
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
	 *  	print("Found this,doubly");
	 *  	print("The number of times is"+count);
	 *  	return count;
	 *  		}else{
	 *  		System.out.println("Not Found,"+" The number of result found is");
	 *  		return 0;
			}
	 * @return
	 */
	
	public int searchElements(Object s){
		Node searchNode= new Node(s);
		Node current =head;
		int count=0;
		
		
			while(current!=null){
				String [] array= current.toString().split(",");
				if(array[2].equals(searchNode.toString())){
					System.out.println(Arrays.toString(array));
					count++;
				}
					
			current=current.next;	
			}
			
			if(count>0){
				
				System.out.println("Found this,doubly");
				System.out.println("The number of times is"+count);
				return count;
			}else{
				
				System.out.println("Not Found,"+" The number of result found is");
				return 0;
			}
		}
	
	/**
	 * This method is to print linked list from head to tail
	 * 
	 * current =head
	 * loop(current!=null){
			
			print( "|" + current.data + "|" , " --> " + "|" + current.data + "|" );	
			
			current = current.next;
			
		}
		}
	 */
	public static void print(){
		current = head;
		
		
		while(current!=null){
			
			System.out.printf( "|" + current.data + "|" , " --> " + "|" + current.data + "|" );	
			
			current = current.next;
			
		}
		}
	}
		
	
	
	
