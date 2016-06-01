import java.io.File;
import java.util.Arrays;
import java.util.Scanner;



public class main {
	/**
	 * THis is main method 
	 * @param args
	 * 
	 * TreeNode root;
	 * get startTime
	 * int index=0;
	 * declare array= new String[675];
	 * Scanner sc= new Scanner (file);
	 * loop(sc.hasNext())
	 * 	String string= sc.nextLine();
	 * 	array[index]=string;
	 * 	index++;
	 * end loop
	 * 
	 * sortArray(array);
	 * BinaryTreeMatrix s = new BinaryTreeMatrix()
	 * root=s.sortedArrayToBST(array,0,674)
	 * print binary tree
	 * get endTime
	 * calculate executeTime
	 * print Justification messages
	 */
	
	
	public static void main(String args[]){
		TreeNode root;
		 for(int i=1;i<101;i++){
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
			
			BinaryTreeMatrix s = new BinaryTreeMatrix();
			
			root=s.sortedArrayToBST(array, 0, 674);
			//s.preOrder(root);
			double endTime= System.currentTimeMillis();
			double executeTime = endTime-startTime;
			System.out.println(i+"Times");
			System.out.println("Tree(node) = 2Tree(node/2) + C");
			System.out.println(" Tree(node) -->  Time taken for an array of size n:"+ executeTime);
			
			System.out.println(" C   -->  Constant");
			
		}catch(Exception e){
			System.err.println(e);
		}
		 }
		
	}
	
	//sort the array before storing it in the binary search tree
	/**
	 * There are three arrays in this class-mainarray, secondArray and thirdArray.
	 * secondArray contains the first index of the price of the main array and thirdarray contains the second index of the price of the main array
	 * By comparing secondArray and thirdArray's prices, it sort as descending order
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
