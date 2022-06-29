package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_interface_HashSet
{

	public static void main(String[] args) 
	{
	
		/*
		 * Note:--> 
		 * 		1. Set Doesn't duplicate values
		 * 		2. Set Store object in random order
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");
		
		//Get Collection of object count
		System.out.println("Object count is -->  "+set.size());
		
		//Remove Object from collection
		set.remove("one");
		
		//Verify Requried object contains at collection
		boolean flag=set.contains("three");
		System.out.println("Object available status --> "+flag);
		
		
		//Read First Interator value
		String itr=set.iterator().next();
		System.out.println("first iterator of object is --> "+itr);
		
	
		//Check Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Empty status --> "+flag1);
		
		
		//Read all Collection object using Forach loop
		for (String eachobj : set) 
		{
			System.out.println("=>"+eachobj);
		}
		
		
		//Convert All Collection of object into Iterators
		Iterator<String> iterator=set.iterator();
		
		//Using while loop read all objects in collection
		while(iterator.hasNext())
		{
			String Obj=iterator.next();
			System.out.println("#"+Obj);
		}
		
	}

}
