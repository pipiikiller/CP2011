
public class Node {
	Node left;
	Node right;
	Object value;
	String key;
	int occur;
	
	
	Node(String key,Object value){
		this.value= value;
		this.key=key;
		
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Object getData(){
		
		return this.value;
	}
	
	public String toString(){
		
		return ""+value;
	}


	public void add(String key, Object value) {
		System.out.println(key);
		 if ( key.compareTo( this.key ) < 0 )         
	        {             
	            if ( left != null )             
	            {                 
	                left.add( key, value );             
	            }             
	            else             
	            {                 
	                left = new Node( key, value );             
	            }         
	        }         
	        else if ( key.compareTo( this.key ) > 0 )
	        {
	            if ( right != null )
	            {
	                right.add( key, value );
	            }
	            else
	            {
	                right = new Node( key, value );
	            }
	        }
	        else
	        {
	            //update this one
	            this.value = value;
	        }
		
	}
		
	}
	
	

