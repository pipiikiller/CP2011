import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author WinHan
 *
 */
public class main {
/**
 * 	   startTime = get currentTime;
	 * array element=[676];
	 * int index=0;
	 * 
	 *  Scanner sc= new Scanner(filename)
	 *  sc.useDelimter(/n)
	 *  
	 *  String string=null
	 *  sc.useDelimiter("/n");// to store each line in each index of the array
	 *  
	 *  loop(sc.hasNext){
	 *  	string= readLine()
	 *  	elements[index]=line // add read line to itemList
	 *  	index++
	 *  
	 *  }
	 *  searchElements(elements) // calling searchElements function 
	 *  // measure the executing time while searching
	 *  get endTime;
	 *  calcualte executeTime= endTime-startTime
	 *  print executeTime
	 *  
 * @param args
 */
	public static void main(String args[]){
			final long startTime= System.currentTimeMillis();
			String[] elements= new String[676];
			int index=0;
		try{
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			String string="";
			sc.useDelimiter("/n");
			while(sc.hasNext()){
				string= sc.nextLine();
				elements[index]=string;
				index++;
				
			}
			
			searchElements(elements);
			final long endTime= System.currentTimeMillis();
			final long executeTime=endTime-startTime;
			System.out.println("The Executing time(nanosecond):"+executeTime);
			
			System.out.println("---------Evaluation of running time--------------");
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The run time of searching data from the array is O(n)");
			System.out.println("The total run time O(n2)");
			System.out.println("Noted: getting 'input' from the user will be counted on running time of the program");
			
		}catch(Exception e){
			
			
		}
	}
	
	/**
	 * 	 * This method is to search the data from the linked list
	 * @param elements
	 * int index=0
	 * int count=0;
	 * Scanner sc2= new Scanner //get the user input from scanner sc2
	 * display message letting user know to input the string want to search
	 * String searchString =sc2.nextline()
	 * 
	 * 
	 * 
	 * loop(elements!=null){
	 *  String splitString= elements[index];
		String [] secondArray= splitString.split(",");
	 *  if(secondArray[ index 2] = searchString){
	 *  	print array
	 *  	count++;
	 *  }
	 *  	current=current.next;	
	 *  		}
	 *  	if(count>0){
	 *  	print("Found this,array");
	 *  	print("The number of times is"+count);
	 *  	return count;
	 *  		}else{
	 *  		System.out.println("Not Found,"+" The number of result found is");
	 *  		return 0;
			}
	 *
	 */
	public static void searchElements(String[] elements){
		int count=1;
		int index=0;
		
		try{
			Scanner sc2= new Scanner(System.in);
			System.out.print("Enter the number you want to search:");
			String searchString= sc2.nextLine();
			
			while(elements != null){
				String splitString= elements[index];
				String [] secondArray= splitString.split(",");
				//System.out.println("Test"+secondArray[2]);
			
				if(secondArray[2].equals(searchString)){
					System.out.println(Arrays.toString(secondArray));
					System.out.println("COunt"+count);
					count++;
				}
				index++;
			
			}
			
			if(count>0){
				
				System.out.println("Found this,array");
				System.out.println("The number of times is"+count);
				
			}else{
				
				System.out.println("Not Found,"+" The number of result found is");
				
			}
			
		}catch(Exception e){
			
			//System.err.println(e);
		}
		
	}
}
