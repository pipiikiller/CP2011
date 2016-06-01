import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
public static void main(String args[]){
	
	try{
		BufferedReader br= new BufferedReader(new FileReader("StockTickerStreamData.csv"));
		String line="";
		//String [] arrayItem= new String[1000];
		
		int count=0;
		
		while((line=br.readLine())!=null){
			String[] data=line.split(",");
			
			count++;
			System.out.println(data[2]);
		}
		
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
	
}
}
