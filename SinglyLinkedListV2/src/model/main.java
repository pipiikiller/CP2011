package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import Item;

public class main {
	/**
	 * 
	 * @param args
	 * startTime = get currentTime;
	 * SinglyLinkMatrix slm= new DoublyLinkMatrix();// instantiate singlylinkmatrix object
	 * 
	 *  Scanner sc= new Scanner(filename)
	 *  sc.useDelimter(/n)
	 *  
	 *  String line=null
	 *  ArrayList itemList= new ArrayList
	 *  
	 *  loop(sc.hasNext){
	 *  	line= readLine()
			Item item= new Item(line);
	 *  	Node node= new Node(item)
	 *  	dlm.add(node)
	 *  
	 *  }
	 *  
	 *  //searching a data from linkedList 
	 *  print a message "Enter the number you want to search"
	 *  get a input from scanner sc2
	 *  
	 *  Item t = new Item(searchString)
	 *  slm.search(t) // calling searchElements from DoublyLinkedList class
	 *  print the result of the search
	 *  
	 *  // measure the executing time while searching
	 *  get endTime;
	 *  calcualte executeTime= endTime-startTime
	 *  print executeTime
	 *  
	 */
	public static void main(String []args){
		final long startTime= System.currentTimeMillis();
		SinglyLinkMatrix slm= new SinglyLinkMatrix();
		try{
			
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			sc.useDelimiter("/n");
			String line=null;
			
			while(sc.hasNext()){
				line= sc.nextLine();
				
				Item item= new Item(line);
				Node node= new Node(item);
				slm.add(node);
				
				
			}
			System.out.print("Please Enter the number you want to search:");
			Scanner sc2= new Scanner(System.in);
			String searchString= sc2.nextLine();
			Item t= new Item(searchString);
			System.out.println(slm.SearchItem(t));
			final long endTime= System.currentTimeMillis();
			final long executeTime=endTime-startTime;
			System.out.println("The Executing time(nanosecond):"+executeTime);
			System.out.println("---------Evaluation of running time--------------");
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The run time of searching data from the singly linked list is O(n)");
			System.out.println("The total run time O(n2)");
			System.out.println("Noted: getting 'input' from the user will be counted on running time of the program");
						
		}catch(IOException e ){
			e.printStackTrace();
			
		}
		
	}
}
