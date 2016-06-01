import java.util.Scanner;

public class main {
	public static void main(String args[]){
		try{
			
			System.out.println("Enter your boobsize");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your name");
			Scanner sc1= new Scanner(System.in);
			String boob=sc.nextLine();
			String name= sc1.nextLine();
			
		Girl girl1= new Girl(boob,name);
		Girl girl2 = new Girl(boob,name,"adult");
		girl2.checkAge("adult");
		
		System.out.println(girl1.getBoobSize());
	}catch(Exception e ){
		
		
	}
	}
}
