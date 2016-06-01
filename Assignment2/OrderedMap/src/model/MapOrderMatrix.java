package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author WinHan
 *
 * @param <K>
 * @param <V>
 */
public class MapOrderMatrix <K,V>{
	private int size;
	
	  private Map<K, V>[] map = new Map[16]; // initialize the predefined size of the map

	  /**
	   * THis is method is to retrieve the value by checking keu
	   * @param key
	   * @return map[i].getValue() or null
	   * 
	   * loop int i = 0; i < size; i++
	   * 	if(map is not null){
	   * 			if (map key is  equal to key){
	   * 				return map[i].getValue()
	   * }
	   * 	null
	   * }
	   */
	  public V get(K key) {
	    for (int i = 0; i < size; i++) {
	      if (map[i] != null) {
	        if (map[i].getKey().equals(key)) {
	        	
	          return map[i].getValue();
	        }
	      }
	    }
	    return null;
	  }
	  /**
	   * Getter method to get size of the map
	   * @return size
	   */
	  public int size() {
		    return size;
		  }
/**
 * This method is to put all the value into map
 * @param key
 * @param value
 * 
 * insert =true
 * loop(int =0;i<size;i++)
 * 	if (map[i].getKey().equals(key)) 
 * 		map set value to value
 * 		insert=false;
 * end loop
 * 	if(insert=true)
 * 		increaseMapSize();
 * 		map[size++] = new Map<K, V>(key, value);
 */
	  public void put(K key, V value) {
	    boolean insert = true;
	    for (int i = 0; i < size; i++) {
	      if (map[i].getKey().equals(key)) {//check duplicate key
	    	  
	        map[i].setValue(value);//override the value in certain key
	        insert = false;
	        
	      }
	    }
	    if (insert) {
	      increaseMapSize();
	      map[size++] = new Map<K, V>(key, value);
	      //System.out.println(size());
	      //size++;
	      
	      
	    }
	  }
	  /**
	   * THis method is very important as it decides whether the size of the map is needed to increase or not
	   * if it is needed, it increases the size in double
	   * if(size is equal to map.length)
	   */
	  private void increaseMapSize() {
		    if (size == map.length) {
		      int newSize = map.length * 2;
		      map = Arrays.copyOf(map, newSize);
		    }
		  }
	  public void printMap(){
		 // System.out.println(map[674].getValue());
		  for(int i=0; i<size;i++){
			  
			  System.out.println("Value"+map[i].getKey()+"----"+"Value:"+map[i].getValue());
		  }
	  }
	  
}
