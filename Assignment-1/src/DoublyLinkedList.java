/*@uthor K.A.Gowtham
 * class DoublyLinkedList
 * private integer size
 * private Node pre
 * private Node post 
 */

public class DoublyLinkedList {
    private int size;        
    private Node pre;     
    private Node post;    
    
    
   /*DoublyLinkedList()
    * 
    * pre = new Node()
    * 
    * post = new Node()
    * 
    * pre.next = post // Initialize the next one after the pre will be post 
    * 
    * post.prev = pre // Initialize the previous one of the post will be pre 
    */
    
    public DoublyLinkedList() {
        pre  = new Node();
        post = new Node();
        pre.next = post;
        post.prev = pre;
    }
    
    /*class Node 
     * 
     * private StockTicker item
     * 
     * private Node next 
     * 
     * private Node prev
     */
    
    private class Node {
        private StockTicker item;
        private Node next;
        private Node prev;
    }
    
    // The purpose of this method is to return the size zero if the DoubluLinked List is empty 
    // return size == 0
    
    
    public boolean isEmpty()    
    { 
    	return size == 0; 
    }
    
    //The purpose of this method is to get the size of the DoublyLinked List
    // int size ()
    // return size 

    public int size()           
    { 
    	return size;      
    }

    /* add the item to the list
     * 
     *  add(StockTicker item)
     *  Node last = post.prev // to know the last node 
     *  Node x = new Node() // Initialize new node object
     *  x.item = item
     *  x.next = post
     *  x.prev = last
     *  post.prev = x
     *  last.next = x
     *  size++
     *  
     */
    
    public void add(StockTicker item) {
        Node last = post.prev;
        Node x = new Node();
        x.item = item;
        x.next = post;
        x.prev = last;
        post.prev = x;
        last.next = x;
        size++;
    }
    
    /*search for the item in the list
     * 
     * StockTicker[] searchEntry(double searchData)
     * Node node = pre
     * node = node .next
     * integer count = 0
     * StockTicker [] results = new StockTicker[size] // Initialize StockTicker array object
     * While node not equal to null and node.item not equal to null and count less than or equal to size
     *        if node.item.getPrice() == searchData
     *        results[count] = node.item
     *        count++
     *endWhile
     * if node.next not equal to null
     * node equal to node.next        
     *        
     * endIf
     * 
     * StockTicker[] returns equal to StockTicker[size] // Initialize new StockTicker array object
     * for int i equal to zero; i less than count; i++
     *      results[i] = results[i]
     *   return returns 
     *endFor      
     * 
     */
    
    public StockTicker[] searchEntry(double searchData) {
        Node node = pre;
        node = node.next;
        int count = 0;
        StockTicker[] results = new StockTicker[size];
        while (node != null && node.item != null && count <= size) {
            if (node.item.getPrice() == searchData ) { 
            	results[count] = node.item;
            	count++;
            }

            if (node.next != null) {
            	node = node.next;
            }   
        }
        StockTicker[] returns = new StockTicker[count];
        for(int i=0; i< count; i++)
        	returns[i] = results[i];
        return returns;
    }
    
    /*Use (override) toString method to print the instances as string 
     * 
     * Node run = pre
     * run = run.next
     * 
     * StringBuilder s = new StringBuilder() // Initialize StringBuilder object
     * 
     * While run not equal to null and run.item not equal to null
     * 
     *       StockTicker item = run.item
     *       s.append(item.getPrice() + "") // add the price column to the stringbuilder 
     *       run = run.next
     * endFor
     * 
     *return s.toString  // return the stringbuilder(s)     
     * 
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    
    public String toString() {
    	Node run = pre; 
    	run = run.next;
        StringBuilder s = new StringBuilder();
        while(run != null && run.item != null){
        	StockTicker item = run.item;
            s.append(item.getPrice() + " ");
            run = run.next;
        }
        return s.toString();
    }
    
   
}
