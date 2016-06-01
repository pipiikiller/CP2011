import java.util.Arrays;

public class test {
	public static void main(String args[]) {
		try{
		//int [] array= {4,3,2,1,9,4,2,10,76};
		//int [] array2={2,8,3,7,1};
		int index=0;
		String [] array3={"213.20,102,1.44,899","100.20,7,1.35,899","213.20,102,1.44,899","23.20,10,1,89"};
		boolean flag= true;
		
		System.out.println("Before sorting"+ Arrays.toString(array3));
		while (flag){
			flag= false;
			
			for(int i=0;i<array3.length-1;i++){
				String splitString= array3[i];
				
				 String splitString2 =array3[i+1];
				
				String [] secondArray= splitString.split(",");
				String [] thirdArray=splitString2.split(",");
				
				String string = secondArray[2];
				String string1= thirdArray[2];
				
				double secondArrayCom = Double.parseDouble(string);
				double thirdArrayCom= Double.parseDouble(string1);
			if(secondArrayCom>thirdArrayCom){
				
			String temp= array3[i];
			array3[i]=array3[i+1];
			array3[i+1]=temp;
			 flag = true; 
			}
		}
		index++;
		System.out.println("After sorting"+ Arrays.toString(array3));
	}
		
		}catch(Exception e){
			
			System.err.println(e);
		}
	}
}
