package mq.java.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_Example {

	public static void main(String[] args) {
		
		Map<Number, String> map=new Hashtable<Number, String>();
		map.put(100, "iphone");
		map.put(101, "Samsung");
		map.put(102, "Vivo");
		map.put(103, "OnePlus");
		map.put(104, "Oppo");
		map.put(105, "Realme");
		
		//Get samsung value
		String Val=map.get(101);
		System.out.println(Val);
		
		map.remove(100);
		
		
		for (Number eachkey : map.keySet()) 
		{
			 String ProductNames=map.get(eachkey);
			 System.out.println(ProductNames);
		}
		

	}

}
