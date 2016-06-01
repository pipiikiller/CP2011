import java.util.Arrays;

public class QuickSortV2 {
	public static void main(String[] args) {
		  Object [] Girls= {new Girl("Wendy",2),new Girl("Sandy",9),new Girl("Fancy",8),
				  new Girl("Wendy",2),
				  new Girl("Handy",10),
				  new Girl("Winny",20)};
		//int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		 
		  
		System.out.println(Arrays.toString(Girls));
 
		int low = 0;
		int high = Girls.length - 1;
 
		quickSort(Girls, low, high);
		System.out.println(Arrays.toString(Girls));
	}
 
	public static void quickSort(Object[] girls, int low, int high) {
		if (girls == null || girls.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		
		Object objectPivot =  girls[middle];
		Girl girl= new Girl();
		girl=(Girl) objectPivot;
		int pivot= girl.getAge();
		
		Object objectGirlLow= girls[low];
		Girl girl2= new Girl();
		girl2=(Girl)objectGirlLow;
		int i=girl2.getAge();
		
		Object objectGirlHigh =girls[high];
		Girl girl3= new Girl();
		girl3=(Girl)objectGirlHigh;
		int j=girl2.getAge();
		
		
				
 
		// make left < pivot and right > pivot
		//int i = low, j = high;
		while (i <= j) {
			Girl girl1= new Girl();
			while (girls[i]<pivot) {
				i++;
			}
 
			while (girls[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = girls[i];
				girls[i] = girls[j];
				girls[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(girls, low, j);
 
		if (high > i)
			quickSort(girls, i, high);
	}
	
}
}