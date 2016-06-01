import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author WinHan
 *This is a main method to start the project
 *
 *startTime=get currentTIme;
 *Node tree= new Node;//instantiate the Node
 *seachNode = Stack // to store the tree in the stack
 *
 *Scanner sc = new Scanner// to read the data from the file
 *sc.useDelimeter('/n'); to read the data line after line
 *
 *loop(sc.hasNext){
 * line= sc.nextLine();
 * Item item= new Item(line)
 * tree.put(line,item)// store item into the tree,line as a key and item as a data
 * Item str= tree.get(line) // get all data from the tree to store in the stack
 * searchNode.push()// store in the stack
 * 
 *}
 */

public class main {
	private static Stack<String> searchNode;
	private static String [] searchArray;
	private static int count,count1;
	public static void main(String args[]){
		final long startTime= System.currentTimeMillis();
		Node tree = new Node();
		searchNode= new Stack<String>();
		try{
			
			Scanner sc= new Scanner (new File("StockTickerStreamData.csv"));
			
			sc.useDelimiter("/n");
			String line=null;
			//ArrayList<String> itemList= new ArrayList<String>();
			while(sc.hasNext()){
				line= sc.nextLine();
				Item item= new Item(line);
				//System.out.println(line);
				tree.put(line,item);
				
				Item str = (Item) tree.get(line);
				
				searchNode.push(str.toString());
				
			}
			
/**
 * 	searchArray= new String[searchNode.size() // declare searchArray 
 * Scanner sc2= new Scanner
 * searchString =sc2.nextLine();
 * count= stack.size
 * loop(run until the count is equal to stack size){
 * 	pop all the  tree data from stack
 * 
 * check if(seachString = pop Data){
 * display the data
 * count how many time it is found;
 * }
 * 
 * }
 * 
 * if (count>0){
 * display message that how many the search data has been found
 * }else{
 * display message that it is not found
 * }
 * endTime=get the current time
 * exectuteTime = endTime-startTime
 * display Time taken for the task 
 * display the justifications
 */
			searchArray= new String[searchNode.size()];
			
			System.out.print("Please Enter the price you would like to search");
			Scanner sc2= new Scanner(System.in);
			String searchString= sc2.nextLine();
			count= searchNode.size();
			for(int i=0;i<count;i++){
				searchArray=searchNode.pop().split(",");
				
				//System.out.println("Test"+searchNode.size());
				if(searchString.equals(searchArray[2])){
					System.out.println(Arrays.toString(searchArray));
					count1++;	
				}
			}
			if(count1>0){
				
				System.out.println("Found this,tree");
				System.out.println("The number of times is"+count1);
			
			}else{
				
				System.out.println("Not Found,"+" The number of result found is");
				
			}
			final long endTime= System.currentTimeMillis();
			final long executeTime=endTime-startTime;
			System.out.println("The Executing time(nanosecond):"+executeTime);
			System.out.println("---------Evaluation of running time--------------");
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The r"
					+ "un time of searching data from tree is O(logn)");
			System.out.println("The total run time O(nlogn)");
			System.out.println("Noted: getting 'input' from the user will be counted on running time of the program");
		}catch(IOException e){
			
		}

}
	
}
