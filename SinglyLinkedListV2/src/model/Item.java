package model;


import java.util.ArrayList;
/**
 * 
 * @author WinHan
 * THis class is to store each item read from the "StockTickerStreamData.csv" file
 * 
 * private String itemList
 */
public class Item {
	
		private String itemList;
		
	
	/**
	    * Item class constructor
	    * @param string
	     */
	public Item(String string) {
		// TODO Auto-generated constructor stub
		this.itemList=string;
	}
	
	
	/**
	 * This method is Override toString() method to print itemList
	 */
	public String toString(){
	return ""+itemList;	
	}

	
}
