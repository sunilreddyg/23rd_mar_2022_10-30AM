package mq.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example 
{

	public static void main(String[] args) 
	{
		
		
		Map<Number, String> map=new HashMap<Number,String>();
		map.put(100, "iphone");
		map.put(101, "Samsung");
		map.put(102, "Vivo");
		map.put(103, "OnePlus");
		map.put(null, null);
		map.put(104, null);
		
		//Get samsung value
		String Val=map.get(101);
		System.out.println(Val);
		
		
		for (Number eachkey : map.keySet()) 
		{
			 String ProductNames=map.get(eachkey);
			 System.out.println(ProductNames);
		}
		
		
	}

}
