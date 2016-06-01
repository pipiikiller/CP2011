

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * 
 * @author WinHan
 *This class is item class where the data read from the file will be stored as an object
 */
public class Item {
	
		private String itemList;
		
	
// This is a constructor method for Item class
		//@param string
	public Item(String string) {
		// TODO Auto-generated constructor stub
		this.itemList=string;
	}
	
	//This is override toString method to print the data
	public String toString(){
	return ""+itemList;	
	}

	
	
}
