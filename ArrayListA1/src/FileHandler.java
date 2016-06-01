
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import model.Instances;

	public class FileHandler {
	
	/**
	 * 
	 * @param args
	 * This is the main method to run the program
	 * 
	 */
	public static void main(String [] args){
		
		
		String[]elements= readFile("StockTickerStreamData.csv");
		int lengthOfElements=0;
		
		for(int i=0;i< elements.length;i++){
			lengthOfElements=i;
			
		}
		
		//calling getAttributes method to assign attributes in arrays
		String[] attributes= getAttribute(elements);
		//System.out.println(Arrays.toString(elements)+elements.length);
		ArrayList<String> instances=getInstances(elements,lengthOfElements);
		searchAttributes(instances);
		
}
	
	public static String searchAttributes(ArrayList<String> arrayList){
		final long startTime = System.currentTimeMillis();
		System.out.println("Enter the number you want to search");
		
		Scanner sc= new Scanner(System.in);
		String searchElement =sc.nextLine();
		ArrayList<Integer> position= new ArrayList<Integer>(); 
		int count=0;
		
		for(int i=0;i<arrayList.size();i++){
			
			if(arrayList.get(i).toString().equals(searchElement)){
				
				position.add(i);
				count++;
				
			}
		}
		if (count>0){
			
			System.out.println("The data is found");
		}else{
			System.out.println("Sorry ,The data is not found");	
		}
			
		final long endTime = System.currentTimeMillis();
		double executeTime=(endTime-startTime);
		for(Integer s: position){
			System.out.println("Positions are "+s);
			
		}
		return null;
		
		
	}
	
	/**
	 * This method is to split each record from every single array index. Then save them into attributes array
	 * @param array
	 * @param length
	 * @return attributes
	 */
	public static ArrayList<String> getInstances(String[] array, int length){
		String[] temp=null;
		String word;
		ArrayList<String>attributes= new ArrayList<String>();
		
		
		for (int i=1; i<=length;i++){
		temp= array[i].split(",");
			for(int j=0;j<9;j++){
				word=temp[j];
				attributes.add(word);
			}
		
		
		//System.out.println(Arrays.toString(attributes));
		}
		//System.out.println(attributes.get(500));
		//System.out.println(attributes[8]);
		return attributes;
		
		
	}
	
	/**
	 * this method is to read instances from the StockTikerStreamData file and store into array
	 * @param file
	 * 
	 * 
	 * @return instance 
	 */
	public static String [] readFile(String file){
		
		try {
			Scanner sc1= new Scanner(new File(file));
			int count=0;
			// count the number of line
			while(sc1.hasNext()){
				count=count+1;
				sc1.next();
			}
			String [] instance= new String[count];
			
			Scanner sc2= new Scanner(new File(file));
			// read the elements from the file and store into arrays
			for(int i=0;i<count;i++){
			instance[i]=sc2.next();
			}
			
			return instance;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	/**
	 * This method is to read the first index of the elements array and split them into single attributes.
	 * @param array
	 * @return attributes
	 */
	public static String[] getAttribute(String [] array){
		int index=0;
		
		String[] attributes=array[index].split(",");
		return attributes;
	}
}