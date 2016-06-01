import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.concurrent.TimeUnit;
/*@uthor K.A.Gowtham
 * this class is to compare between linkedlist, doubly linkedlist, binary tree, stock ticker 
 * 
 * class Compare
 * 
 * private static final int SEARCH_SIZE = 2      // search size
 * private static final int RESULT_SIZE = 10000 // 	size of the StockTicker array
 * 
 * LinkedList linkedlistStocks = new LinkedList() // Initialize LinkedList obeject
 * StockTicker array arraySTocks = new StockTicker[1000] // Initialize StockerTicker object
 * DoublyLinkedList doubleListsStocks = new DoublyLinkedList() // Initialize DoublyLinkedList object
 * BinaryTree treeStocks = new BinaryTree () // Initialize BinaryTree object
 * int stockSize = 0
 * 
 * private static int count1=0, count2=0, count3=0, count4=0
 * 
 * static Double array searchPrice = new Double(SEARCH_SIZE) 
 * static StockTicker array searchResults1 = new StockTciker[RESULT_SIZE] // Initialize array object to store the array search 
 * static StockTicker array searchResults2 = new StockTciker[RESULT_SIZE] // Initialize array object to store the linkedlist search 
 * static StockTicker array searchResults3 = new StockTciker[RESULT_SIZE] // Initialize array object to store the doublylinkedlist search
 * static StockTicker array searchResults4 = new StockTciker[RESULT_SIZE] // Initialize array object to store the tree search 
 * 
 * 
 */

public class Compare {

	private static final int SEARCH_SIZE = 4;
	private static final int RESULT_SIZE = 10000;
	
	LinkedList linkedListStocks = new LinkedList();
	StockTicker[] arrayStocks = new StockTicker[1000];
	DoublyLinkedList doubleListStocks = new DoublyLinkedList();
	BinaryTree treeStocks = new BinaryTree();
	int stockSize = 0;
	private static int count1=0, count2=0, count3=0, count4=0;
	
	
	
	
	static Double[] searchPrices = new Double[SEARCH_SIZE];
	static StockTicker[] searchResults1= new StockTicker[RESULT_SIZE];
	static StockTicker[] searchResults2= new StockTicker[RESULT_SIZE];
	static StockTicker[] searchResults3= new StockTicker[RESULT_SIZE];
	static StockTicker[] searchResults4= new StockTicker[RESULT_SIZE];
	/*this method is to read the data from StockTickerStreamData file
	 * 
	 * BufferReader csv = new BufferReader(new FileReader(fileName))
	 * 
	 * String data =""
	 * data = csv.readLine()
	 * While ((data = csv.readLine()) not equal to null
	 *        StockTicker st = StockTicker.create(data.split(","))
	 *        if (st not equal to null)
	 *        linkedListStocks.add(st)
	 *        doubleListStocks.add(st)
	 *        treeStocks.insert(st)
	 *        arrayStocks[stockSize++] = st
	 * endIf       
	 * endWhile
	 * 
	 * print ex.printStackTrace() 
	 *        
	 *        
	 *    
	 */
	@SuppressWarnings("resource")
	public void readData(String fileName){
		
		try{
			BufferedReader csv = new BufferedReader(new FileReader(fileName));
		    
		    String data="";
		    data = csv.readLine();
		    while ((data = csv.readLine()) != null){
		    	StockTicker st = StockTicker.create(data.split(","));
		        if (st != null) {
		        	linkedListStocks.add(st);
		        	doubleListStocks.add(st);
		        	treeStocks.insert(st);
		        	arrayStocks[stockSize++] = st;
		        }
		    }
		    
		    
		}catch(Exception ex){
			ex.printStackTrace();
		}
		/*This method is used to look through the price number  and which goes through 8 price numbers
		 * it depends on the searchSize
		 * searchPrices[0] = 1.435
		 * searchPrices[1] = 1.42
		 * searchPrices[2] = 1.42;
		 * searchPrices[2] = 1.44;
		 *searchPrices[3] = 1.43;
		 *searchPrices[4] = 1.445;
		 *searchPrices[5] = 1.415;
		 *searchPrices[6] = 1.41;
		 *searchPrices[7] = 1.405;
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		searchPrices[0]= 1.435;
		searchPrices[1] = 1.42;
		searchPrices[2] = 1.44;
		searchPrices[3] = 1.43;
		//searchPrices[4] = 1.445;
		//searchPrices[5] = 1.415;
		//searchPrices[6] = 1.41;
		//searchPrices[7] = 1.405;
		/*
		searchPrices.add(1.415);
		searchPrices.add(1.395);
		searchPrices.add(1.44);
		*/
	}	
	/*This method is for treesearch
	 * 
	 * For intj=0; j lessthan searchprices.length; j++
	 *     List arraylist StockTicker temp = treeStocks.lookup(searchPrices[j])
	 *    For int i=0; i lessthan temp.size(); i++
	 *         searchResults4[count4++] = temp.get(i)
	 *endFor     
	 *endFor    
	 */
	public void treeSearch(){
		
		for(int j=0; j< searchPrices.length;j++){
			List<StockTicker> temp = treeStocks.lookup(searchPrices[j]);
			for(int i=0; i<temp.size(); i++){
				searchResults4[count4++] = temp.get(i);
			}
		}
		/*
		 * this for loop is to display  all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance of the tree drops too
		 * if u would like u can use it 
		 * 
		for(int i=0; i< count4; i++){
			StockTicker s = searchResults4[i];
			System.out.println("Tree search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		//System.out.println("Tree search found "+ count4 + " records.");
	}
	
	/*this class is for doubleLinkedSearch
	 * 
	 * count 3=0
	 * 
	 * For int i equal to 0; j lessthan searchprices.length; j++
	 *     StockTicker array temp = doubleListStocks.searchEntry(searchPrices[j])
	 * For int i equal to 0;  i lessthan temp.length; i++
	 *     searchResults3[count3++] = temp[i]
	 * endFor
	 * endFor
	 * 
	 */
	public void doubleLinkedListSearch(){
		count3=0;
		
		for(int j=0; j< searchPrices.length;j++){
			StockTicker[] temp = doubleListStocks.searchEntry(searchPrices[j]);
			for(int i=0; i<temp.length; i++){
				searchResults3[count3++] = temp[i];
			}
		}
		
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		/*
		for(int i=0; i< count3; i++){
			StockTicker s = searchResults3[i];
			System.out.println("Double linked list search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		//System.out.println("Double linked list search found "+ count3 + " records.");
		
	}
	
	/*this method is for LinkedListSearch
	 * 
	 * count 2 =0
	 * 
	 * For int j equal to 0; j lessthan searchprices.length; j++
	 *     StockTicker[] temp = linkedListStocks.find(searchPrices[j])
	 * For int equal to 0; i less than temp.length; i++
	 *      searchResults2[count2++] = temp[i]
	 * 
	 * endFor
	 * endFor
	 */     
	
	public void linkedListSearch(){
		count2=0;
		for(int j=0; j< searchPrices.length;j++){
			StockTicker[] temp = linkedListStocks.find(searchPrices[j]);
			for(int i=0; i<temp.length; i++){
				searchResults2[count2++] = temp[i];
			}
		}
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		/*
		for(int i=0; i< count2; i++){
			StockTicker s = searchResults2[i];
			System.out.println("Linked list search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		
		//System.out.println("Linked list search found "+ count2 + " records.");
	}
	
	/*This method is for array search
	 * which is not gping to return anything
	 * For int i equal to zero; i lessthan stockSize; i++ 
	 *    For int j equal to 0; j lessthan searchPrices.length; j++
	 *     if searchPrices[j] equals to arrayStock[i].getPrice()
	 *        searchResults1[count1++] = arrayStocks[i]
	 * endFor
	 * endFor   
	 * endIf   
	 */
	public void arraySearch(){
		
		for(int i=0; i< stockSize; i++){
			for(int j=0;j<searchPrices.length;j++){
				if(searchPrices[j]==arrayStocks[i].getPrice()){
					searchResults1[count1++] = arrayStocks[i];
				}
			}
		}
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
	
		
		/*
		for(int i=0; i< count1; i++){
			StockTicker s = searchResults1[i];
			System.out.println("Array search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		
		//System.out.println("Array search found "+ count1 + " records.");
		
	}
	
   /*this is the main function
    * 
    * Compare  cp = new Compare () // Initialize new Compare object(cp)
    * cp.readData("StockTickerStreamData.csv") // read the data from the .csv file
    * long startTime = System.nanoTime() // print/display in nanotime
    * For  int i equal to zero; i lessthan 100; i++
    *      count4=0
    *      cp.treesearch()
    *endFor      
    * 
    */
	


	public static void main(String[] args){
		
		Compare cp = new Compare();
		cp.readData("StockTickerStreamData.csv");
		long startTime = System.nanoTime();
		for(int i=0; i<100; i++){
			count4 = 0;
			cp.treeSearch();
		}
		
		/*long stopTime = System.nanoTime()
		 * 
		 * double duration4 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS) // set up the time measurement in milliseconds
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		long stopTime = System.nanoTime();
		
		double duration4 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		
		/*
		for(int i=0; i< count4; i++){
			StockTicker s = searchResults4[i];
			System.out.println("Tree search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		
		/*startTime = System.nanoTime()
		 *For int equal to zero; i lessthan 100; i++
		 *    count3=0 
		 *    cp.doubleLinkedListSearch()
		 * endFor
		 * stopTime = System.nanoTime()   
		 * 
		 */
		startTime = System.nanoTime();
		for(int i=0; i<100; i++){
			count3 = 0;
			cp.doubleLinkedListSearch();
		}
		stopTime = System.nanoTime();
		
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		/*
		for(int i=0; i< count3; i++){
			StockTicker s = searchResults3[i];
			System.out.println("Double linked list search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		
		/*double duration3 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, Timeunit.NANOSECONDS)
		 * 
		 * startTime = System.nanoTime()
		 * For int i equal to zero i lessthan 100 i++
		 *     count2=0
		 *     cp.linkedListSearch()
		 *endFor
		 *
		 * stopTime = System.nanoTime
		 */
		double duration3 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
		
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++){
			count2 = 0;
			cp.linkedListSearch();
		}
		stopTime = System.nanoTime();
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		/*
		for(int i=0; i< count2; i++){
			StockTicker s = searchResults2[i];
			System.out.println("Linked list search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		/*double duration2 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS)
		 * 
		 * startTime = System.nanoTime()
		 * For int equal to zero i less than 100 i++
		 *    count1 equal to zero
		 *    cp.arraySearch()
		 *endFor    
		 *    
		 * stopTime = System.nanoTime
		 */
		double duration2 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
		
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++){
			count1=0;
			cp.arraySearch();
		}
		stopTime = System.nanoTime();
		/** this for loop is to display all columns and i did not use this for loop because it takes lot of time (performance issue)
		 * the performance also drops too
		 * if u would like u can use it 
		 * 
		 * 
		 * 
		 */
		/*
		for(int i=0; i< count1; i++){
			StockTicker s = searchResults1[i];
			System.out.println("Array search found "+ s.getDate() + " " + s.getTime() + " " + s.getPrice() + " " + s.getVwap() + " "+ s.getVolume());
		}
		*/
		
		/*double duration1= TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS)
		 * 
		 * print search time for t4 + duration + milliseconds 
		 * print search time for t3 +duration  + milliseconds
		 * print search time for t2 + duration + milliseconds
		 * print search time for t1 +duration  + milliseconds
		 */
		double duration1 = TimeUnit.MILLISECONDS.convert(stopTime - startTime, TimeUnit.NANOSECONDS);
		
		System.out.println("\nTree search time - t4 = " + duration4 + " miliseconds");
		System.out.println("Double linked list search time - t3 = " + duration3 + " miliseconds");
		System.out.println("Linked list search time - t2 = " + duration2 + " miliseconds");
		System.out.println("Array search time - t1 = " + duration1 + " miliseconds");
		
		
	}
	
}	
		