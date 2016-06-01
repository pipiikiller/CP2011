package model;
/**
 * This is Map class containing Key and Value
 * @author WinHan
 *
 * @param <K>
 * @param <V>
 */
public class Map <K,V> {
	
	private K key;
	private V value;
	
	/**
	 * Constructor class for Map class
	 * @param key
	 * @param value
	 */
	public Map(K key,V value){
		
		this.key=key;
		this.value=value;
	}
	
	//getter method for key
	 public K getKey() {
		return key;
		    
	 }
//getter method for value
	 public V getValue() {
		return value;
		  
	 }
//setter method for value
	 public void setValue(V value) {
		this.value = value;
		  
	 }
}
