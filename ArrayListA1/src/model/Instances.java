package model;

public class Instances {
	
	private String [] instances;
	private String [] array;

	
	
	public Instances(String[] array){
		array=this.array;
		
	}
	
	public void setAttributes(int  i){
		
		instances=array[i].split(",");
		
	}
	
	
	public String[] getInst(){
		
		return instances;
		
	}
	
	
	
	

}
