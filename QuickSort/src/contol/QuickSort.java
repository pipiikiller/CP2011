package contol;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.DoublyLinkMatrix;
import model.Item;

public class QuickSort <T extends Comparable <T>> {

	T[] a; // quicksort class as T and declare as arrayList
	/**
	 * get startTime;
	 * declare Items array = size[674]
	 * scanner sc= new scanner(file)
	 * sc.nextLine// to skip the first line which are all String value such as Price, Date, Ask Price and so on
	 * loop(sc.hasNext())
	 * 	line= readLine;
	 * 	array.add(line)
	 * 	String [] array2= array.split(",")
	 * 	double key= array2[2]
	 * 	Item item = new Item(line,key)
	 * 	items[index]=item
	 * 	index++
	 * end Loop
	 * 
	 * QuickSort<Item> qs= new QuickSOrt<>()
	 * qs.a=items
	 * 
	 * print array
	 * sort
	 * print array
	 * get endTime;
	 * calculate executeTime
	 * print executeTime
	 * 
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		int count=1;
		for(int i=0;i<101;i++){
			
		ArrayList<String> array= new ArrayList<>();
		Item [] items= new Item[674];
		int index=0;
		double startTime= System.currentTimeMillis();
		
		try{
			
		
		
			Scanner sc= new Scanner (new File("StockTickerStreamData.csv"));
			sc.useDelimiter("/n");
			sc.nextLine();
			while(sc.hasNext()){
				
				String line = sc.nextLine();
				array.add(line);
				
				String [] array2= array.get(index).split(",");
				double key = Double.parseDouble((array2[2]));
				Item item= new Item(line,key);
				items[index]=item;
				//System.out.println("Elements"+line+"  key"+key);
				index++;
				
			}
			
			
			
		QuickSort<Item> qs= new QuickSort<>();
		//ArrayList<Item> qs= new ArrayList<>();
		
		qs.a=items;
		// prints the given array
				//qs.printArray();
				System.out.println("After Sorting=-------------------------------");
				
				
				// sort the array
			
					
			qs.sort();
			double endTime= System.currentTimeMillis();
			double executeTime= endTime-startTime;
			
			System.out.println(count+"Times"+"---"+"Execute Time:"+ executeTime);
			System.out.println("The run time of reading data from the file is O(n)");
			System.out.println("The run time of searching data from quicksort is O(n)");
			System.out.println("The total run time O(nlogn)");
				
				//prints the sorted array
				//qs.printArray();
			
			count++;
			
			
		}catch(Exception  e){
			System.err.println(e);
			
		}
		}
	}
		
	
	
	/**
	 * left=0
	 * right=length-1
	 * quickSort(left,right)
	 */
	public void sort(){
		int left = 0;
		int right = a.length-1;
			
		quickSort(left, right);
	}
	
	 
	/**
	 * This method is used to sort the array using quicksort algorithm.
	 * It takes left and the right end of the array as two cursors
	 * @param left
	 * @param right
	 * 
	 * if(left>right){
	 * 	end quickSort
	 * }
	 * declare pivot=getMiddle(left,right)
	 * get partition value= partition(left,right,pivot)
	 * quickSort(left,partition-1)
	 * quickSort(partition+1,right)
	 */
	private void quickSort(int left,int right){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// Pivot using median of 3 approach
		T pivot = getMiddle(left, right);
		int partition = partition(left, right, pivot);
		
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(left, partition-1);// chnage 0 to left
		
		quickSort(partition+1, right);
	}
	
	
	
	/**
	 *  This method is used to partition the given array and returns the integer which points to the sorted pivot index
	 * @param left
	 * @param right
	 * @param pivot
	 * @return
	 * 
	 * int leftCursor=left-1;
	 * int rightCursor=right;
	 * outer loop(leftCursor<rightCursor)
	 * 	innerloop(((Comparable<T>)a[++leftCursor]).compareTo(pivot) < 0);
	 * 	innerloop(rightCursor > left && ((Comparable<T>)a[--rightCursor]).compareTo(pivot) > 0);
	 * 	if leftCursor >= rightCursor
	 * 		break;
	 * 	else
	 * 		swap(leftCursor,rightCursor);
	 * end OuterLoop
	 * swap(leftCursor,right)
	 * return leftCursor
	 * 
	 * 
	 */
	private int partition(int left,int right,T pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
        while(((Comparable<T>)a[++leftCursor]).compareTo(pivot) < 0);//move the left cursor to middle by ++
        while(rightCursor > left && ((Comparable<T>)a[--rightCursor]).compareTo(pivot) > 0);//move the right cursor to middle by--
			if(leftCursor >= rightCursor){//when leftcursor is more than right cursor, end the program
				break;
			}else{
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}
	/**
	 * this method is to get middle of the array by calculating sum of left and right of the array divided by 2
	 * sort the left,right,center to get the efficient pivot
	 * @param left
	 * @param right
	 * @return a[right]
	 * 
	 * int center= (left+right)/2
	 * if(a[left] compare with a[center]>0){
	 * 	swap(left,center)
	 * }
	 * if(a[left] compare with a[right]>0){
	 * 	swap(left,right)
	 * }
	 * if(a[center] compare with a[right]>0){
	 * 	swap(center,right)
	 * }
	 * swap(center,right)
	 * 
	 */
	public T getMiddle(int left,int right){
		int center = (left+right)/2;
		
		if(((Comparable<T>)a[left]).compareTo(a[center]) > 0)
			swap(left,center);
		
		if(((Comparable<T>)a[left]).compareTo(a[right]) > 0)
			swap(left, right);
		
		if(((Comparable<T>)a[center]).compareTo(a[right]) > 0)
			swap(center, right);

		swap(center, right);
		return a[right];
	}
	
	// This method is used to swap the values between the two given index
	/**
	 * T temp= a[left]
	 * a[left]=a[right]
	 * a[right]=temp
	 * @param left
	 * @param right
	 */
	public void swap(int left,int right){
		T temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	/**
	 * This method is to print the array from the double link
	 * instantiate doublylinkmatrix
	 * for each(T i:a){
	 * 	dlm.add(i);
	 * 	print i
	 * }
	 */
	public void printArray(){
		DoublyLinkMatrix dlm= new DoublyLinkMatrix();
		for(T i : a){
			dlm.add(i);
			System.out.println(i+" ");
		}
	}
}

