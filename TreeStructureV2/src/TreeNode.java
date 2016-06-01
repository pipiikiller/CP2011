public class TreeNode
{
    private String key;
    private Object value;
    private TreeNode left, right;
    public TreeNode(){
    	
    }
    public TreeNode( String key, Object value )
    {
        this.key = key;
        this.value = value;
    }
    /**
     * 
     * @param key
     * @param value
     * 
     * if(key compare key <0){
     * 	if(left is not null){
     * 	put data to the left
     * }else{
     * put new left node plus data
     * }
     * 
     * 
     * }else if(key compare to key >0){
     *  	if(right is not null){
     * 	put data to the right
     * }else{
     * put new right node plus data
     * }else{
     * 	value= value;// update the value
     * }
     */
    //if key not found in tree then it is added. 
    public void put( String key, Object value )
    {
        if ( key.compareTo( this.key ) < 0 )         
        {             
            if ( left != null ){                 
                left.put( key, value );  //recursive
                
            }             
            else{                 
                left = new TreeNode( key, value );             
            }         
        }         
        else if ( key.compareTo( this.key ) > 0 ){
        
            if ( right != null ){
            
                right.put( key, value );// recursive
            }
            else{
            
                right = new TreeNode( key, value );
            }
        }
        else{
        
            //update this one
            this.value = value;
        }
    }
    /**
     * Search the data from the tree node according to the key 
     * @param key
     * @return value, left data, right data
     * 
     * if (key == key){
     * 	return value
     * }
     * if (key.compareTo(this.key)<0){
     * return left child value
     * }
     * if (key.compareTo(this.key)>0){
     * return right child value
     * }
     */
    //find Node with given key and return it's value
    public Object get( String key ){
    
        if ( this.key.equals( key ) ){
        
            return value;
        }

        if ( key.compareTo( this.key ) < 0 ){
        
            return left == null ? null : left.get( key );
        }
        else{
        
            return right == null ? null : right.get( key );
        }
    }
    /**
    public void printLeafNodes(TreeNode node) {  
    	   
    	   if(node==null)  
    	    return;  
    	     
    	   if(node.left == null && node.right == null) {  
    	    System.out.printf("%d ",node.value);  
    	   }  
    	   printLeafNodes(node.left);  
    	   printLeafNodes(node.right);  
    	 }  

    	*/
 
    /**
     * override toString methid
     */
    public String toString(){
    	
    	return ""+value;
    }
    
}