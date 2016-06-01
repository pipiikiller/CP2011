package model;

public class Item implements Comparable <Item>{

    private String instances;
    private double key;
    
    /**
     * Item class constructor
     * @param elements
     */
    public Item(String elements){

        this.instances=elements;
    }

    public Item(String elements, double key) {
		this.instances =elements;
		this.key=key;
	}

	/**
     * this method is to get data 
     * @return instances
     */
    public String getInstances(){

        return instances;
    }
    /**
     * This is override toString() method is print instance as String
     * return "" + getInstances()
     */
    public String toString(){
    	
    	return ""+this.getInstances()+"  Key:"+this.key;
    }
    
    public double getKey(){
    	
    	return this.key;
    }
    
    @Override
    public int compareTo(Item Item2){
    	Item item = (Item) Item2;
    	
    if (this.key>item.getKey())
    	return 1;
    
    if(this.key<item.getKey())
    	return -1;
    
    if(this.key== item.getKey())
    	return 0;
    
    return 0;
    			
    	
}
}
