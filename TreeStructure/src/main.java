import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]){
		//Node root = null;
		//TreeMatrix tm = new TreeMatrix();
		int lineNo=0;
		//System.out.println("Test");
		Node node= new Node();
		try{
		
			
			Scanner sc= new Scanner(new File("StockTickerStreamData.csv"));
			
			ArrayList<String> itemList= new ArrayList<String>();
			String line="";
			sc.useDelimiter("/n");
			
			while(sc.hasNext()){
				line=sc.nextLine();
				
				itemList.add(line);
				
			}
			//System.out.println(itemList.size()+""+itemList.get(3));
			
			
			for(int i=1;i<itemList.size()-1;i++){
				//System.out.println(itemList.get(i));
				Item item= new Item(itemList.get(i).toString());
				String key=item.toString();
				//System.out.println(nodeValue);
				//Node node= new Node(key,item);
				//System.out.println(node.toString());
				node.add(key, item);
				
			}
			
			
		}catch(Exception e){
			System.err.println(e);
			
		}
		
	}
}
//String [] arrayNode= item.toString().split(",");
//tm.addAnother(node,nodeValue);
//tm.printInOrder(node);
//double nodeValue=Double.parseDouble((arrayNode[2]));
