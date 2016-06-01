import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import model.MapOrderMatrix;

public class main {
	/**
	 * This is a main method 
	 * @param args
	 * get start time;
	 * index=0
	 * array[675]= new array[]
	 * scanner sc= new scanner(file);
	 * loop(scan unitl the end)
	 * 	String string= sc.nextLine()
	 * 	array[]=string
	 * 	index++
	 * end Loop
	 * 
	 * sortArray(array)
	 * putMap(array)
	 * get endTime;
	 * calculate executeTime
	 * Display Time;
	 * 
	 */
	public static void main(String args[]){
		for(int i=0;i<101;i++){
		try{
			double startTime= System.currentTimeMillis();
			int index=0;
			String [] array = new String[675];
			//ArrayList<String> array= new ArrayList<String>();
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			sc.useDelimiter("/n");
			
			while(sc.hasNext()){
				String string=sc.nextLine();
				array[index] = string;
				index++;	
			}
			//System.out.println("Before Sorting"+ Arrays.toString(array));
			sortArray(array);
			//System.out.println("After Sorting"+ Arrays.toString(array));
			putMap(array);
			
			double endTime= System.currentTimeMillis();
			double executeTime = endTime-startTime;
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The run time of sorting the array is O(n)");
			System.out.println("The run time of inserting into array O(n)");
			System.out.println("The total run time O(n3)");
			System.out.println("ExecuteTime:"+executeTime);
		}catch(Exception e){
			System.err.println(e);
		}
		}
	}
	
	/**
	 * This method is to put the whole sorted array into the ordered map
	 * @param array
	 * 
	 * Loop(i=0,i<array.length-1;i++)
	 * 	map.put(i,array[i]);
	 * end Loop
	 */
	public static void putMap(String [] array) {

	    // MyMap
	    MapOrderMatrix<Integer, String> map = new MapOrderMatrix<Integer, String>();
	    for (int i=0;i<array.length-1;i++){
	    	map.put(i,array[i]);
	    	
	    }
	  // map.printMap();
	    
	  }
	/**
	 * THis method is to sort the array
	 * basically the main array is copy to second and thirdarray
	 * and compare first index of second array and second index of third array. if second array is
	 * bigger, swap the index
	 * @param array
	 * 
	 * flag=true
	 * 
	 * outer loop(flag)
	 * 	flag=false
	 * 	inner loop(int i=1;i<array.length-1;i++)
	 * 			String splitString= array[i];
	 * 			String splitString2 =array[i+1];
	 * 			String [] secondArray= splitString.split(",");
	 * 			String [] thirdArray=splitString2.split(",");
	 * 			double secondArrayCom = Double.parseDouble(secondArray[2]);
	 * 			double thirdArrayCom= Double.parseDouble(thirdArray[2]);
	 * 			if(secondarraycom >thirdArrayCom)
	 * 				String temp= array[i];
	 * 				array[i]=array[i+1];
	 * 				array[i+1]=temp;
	 * 				flag=true;
	 * 	end inner Loop
	 * end Outer loop
	 */
	public static void sortArray(String[] array){
		
		boolean flag= true;
		
		
		
		while (flag){
			flag= false;
		for(int i=1;i<array.length-1;i++){
			
			String splitString= array[i];
			
			 String splitString2 =array[i+1];
			
			String [] secondArray= splitString.split(",");
			String [] thirdArray=splitString2.split(",");
			
			
			double secondArrayCom = Double.parseDouble(secondArray[2]);
			double thirdArrayCom= Double.parseDouble(thirdArray[2]);
		if(secondArrayCom>thirdArrayCom){
			
			String temp= array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
			flag = true; 
		}
	}
	
}
	}	
}
