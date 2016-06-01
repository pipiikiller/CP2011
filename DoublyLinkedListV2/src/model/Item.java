package model;

public class Item {

    private String instances;
    
    /**
     * Item class constructor
     * @param elements
     */
    public Item(String elements){

        this.instances=elements;
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
    	
    	return ""+this.getInstances();
    }
}
