import java.lang.reflect.Array;
import java.util.Stack;

public class TreeMatrix {
	
	
	private Node root;
	private Node current;
	private int count=0;
	private Node leftNode;
	private Node rightNode;
	Stack treeStack = new Stack();
}
	/**
	
	public void add(Node node,Object data){
		
		Node tempNode= new Node(data);
		
		if(root==null){
			
			root=tempNode;
		}else{
			String [] arrayNode= root.getData().toString().split(",");
			String line= arrayNode[2];
			//System.out.println(line);
			double nodeValue=Double.parseDouble((arrayNode[2]));
			
			current= root;
			
			while(current!=null){
				String [] array =current.getData().toString().split(",");
				double value=Double.parseDouble(array[2]);
				
				if(value<=nodeValue){
					//System.out.println(nodeValue+"another value"+value);
					current=leftChild;
					//System.out.println("gfdgfd"+current.toString());
					if(current==null){
						leftChild=tempNode;
						
					}
				}else{
					
					current=rightChild;
					if(current==null){
						rightChild=tempNode;
					}
				}
				
			}
				
			}
			
		}
		*/
	
	/**
	public void add(Object data){
		Node current;
		current= root;
		if(root==null){
			
			root = new Node(data);
			System.out.println(root.toString());
		}
		
		else if(leftNode==null){
			leftNode= new Node(data);
			root=leftNode;
			System.out.println(leftNode.toString());
			
		}else if(rightNode==null){
			rightNode= new Node(data);
			root=rightNode;
			System.out.println(rightNode.toString());
		}
		
	}
	public void addAnother(Node node,double value){
		
		if(root == null)
		{
		  root = new Node(node,value);
		  //System.out.println(value);
		  count++; 
		} 
	
	   else if (value < node.value)
			{
        if (node.left != null) {
            addAnother(node.left, value);
				 count++;
				 System.out.println(node.left.toString());
         } 
			else 
			{
            System.out.println("  Inserted " + value + 
                            " to left of node " + node.value);
            node.left = new Node(value);
        }
    } 
	  else if (value > node.value) {
        if (node.right != null) {
            addAnother(node.right, value);
				 count++;
        } 
			else {
            System.out.println("  Inserted " + value + " to right of node " + node.value);
            node.right = new Node(value);
        }
    }
	  else if (value == node.value){
	  	count++;
	  	node.occur = node.occur++;
		}  
			}
		
	  public void printInOrder(Node node) {
		   
		  if (node != null) {
            printInOrder(node.left);
			
            System.out.println("  Traversed " + node.value);
	
					 String print = Double.toString(node.value); 
				 		treeStack.push(print);
				//		System.out.println("pushed " + print);					
 				
            printInOrder(node.right);
        	}
		
	}
}
	*/

