
public class Girl implements Comparable<Girl>{
	
	
	String girlName ;
	 double age;
	

	public Girl(String name, double age){
			
		this.girlName= name;
		this.age=age;
		
	}


	public String getGirlName() {
		return girlName;
	}

	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	
	
	
	public double getAge() {
		return age;
	}
	

	public void setAge(double age) {
		this.age = age;
	}

	
	public String toString(){
		
		return ""+girlName+"  "+age;
	}


	@Override
	public int compareTo(Girl o) {
		Girl g=(Girl) o;
		
		if(this.age>g.getAge())
			return 1;
		
		if(this.age<g.getAge())
			return -1;
		
		if(this.age==g.getAge())
			return 0;
		return 0 ;
	}
}
