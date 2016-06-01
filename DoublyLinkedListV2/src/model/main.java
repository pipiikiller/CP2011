package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author WinHan
 * This class is the main class where the program start executing after complied
 * 
 */
public class main {
	
	/**
	 * 
	 * @param args
	 * startTime = get currentTime;
	 * DoublyLinkMatrix dlm= new DoublyLinkMatrix();// instantiate doublylinkmatrix object
	 * 
	 *  Scanner sc= new Scanner(filename)
	 *  sc.useDelimter(/n)
	 *  
	 *  String line=null
	 *  ArrayList itemList= new ArrayList
	 *  
	 *  loop(sc.hasNext){
	 *  	line= readLine()
	 *  	itemList.add(line) // add read line to itemList
	 *  	Item item= new Item(itemList.get(itemList.size()-1))
	 *  	Node node= new Node(item)
	 *  	dlm.add(node)
	 *  
	 *  }
	 *  
	 *  //searching a data from linkedList 
	 *  print a message "Enter the number you want to search"
	 *  get a input from scanner sc2
	 *  
	 *  Item searchItem= new Item(searchString)
	 *  dlm.searchElements(searchItem) // calling searchElements from DoublyLinkedList class
	 *  
	 *  // measure the executing time while searching
	 *  get endTime;
	 *  calcualte executeTime= endTime-startTime
	 *  print executeTime
	 *  
	 */
	public static void main(String args[]){
		final long startTime= System.currentTimeMillis();
		DoublyLinkMatrix dlm= new DoublyLinkMatrix();
		try{
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			sc.useDelimiter("/n");
			String line=null;
			
			while(sc.hasNext()){
				line= sc.nextLine();
				
				Item item= new Item(line);
				Node node= new Node(item);
				dlm.add(node);
			
		}	
			System.out.print("Please Enter the number you want to search:");
			Scanner sc2= new Scanner(System.in);
			String searchString= sc2.nextLine();
			Item searchItem= new Item(searchString);
			dlm.searchElements(searchItem);
			final long endTime= System.currentTimeMillis();
			final long executeTime=endTime-startTime;
			System.out.println("The Executing time(nanosecond):"+executeTime);
			System.out.println("---------Evaluation of running time--------------");
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The run time of searching data from the doubly linked list is O(n)");
			System.out.println("The total run time O(n2)");
			System.out.println("Noted: getting 'input' from the user will be counted on running time of the program");
			}catch(IOException e ){
			
			
		}
	}
}
