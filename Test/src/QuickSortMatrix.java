

public class QuickSortMatrix {
	

	
		
		static Node head;
		Node tail;
		Node temp;
		static Node current;
		int size;
		
		public QuickSortMatrix(){
			
			head=null;
			tail=null;
			size=0;
		}
		
		public boolean isEmpty()
		{
		 return (head == null);
		         }
		public void addV2(Item data){
			
			Node newNode = new Node(data);
	        if (isEmpty())
	     {
	              head = newNode;
	          tail = newNode;
	          size++;
	              }
	       else
	      {
	              tail.next = newNode;
	              newNode.previous = tail;
	         }
	          tail = newNode;
		}
		
		public void print()
		{
		 Node current = head;
		 while (current != null)
		 {
		     current.displayInfo();
		     current = current.next;
		     }//end while
		 }//end print

		public void sort(QuickSortMatrix list){
			sort(list, this.head, this.tail);
			
		}

		private void sort(QuickSortMatrix list, Node head, Node tail) {
			 if (head < tail) {
		            int pivot = partition(array, left, right);
		            sort(array, left, pivot - 1);
		            sort(array, pivot + 1, right);
		        }
			
		}
		
}
