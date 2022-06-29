package mq.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_interface_ArrayList {

	public static void main(String[] args) {
		
		
		/*
		 * List:-->
		 * 		=> List accept duplicate values
		 * 		=> Inorder collection of objects.
		 */
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("one");
		
		
		String IndexObject=list.get(2);
		System.out.println("2nd Index object is --> "+IndexObject);
		
		
		//Get Collection of object count
		System.out.println("Object count is -->  "+list.size());
		
		//Remove Object from collection
		list.remove("one");
		
		//Verify Requried object contains at collection
		boolean flag=list.contains("three");
		System.out.println("Object available status --> "+flag);
		
		
		//Read First Interator value
		String itr=list.iterator().next();
		System.out.println("first iterator of object is --> "+itr);
		
	
		//Check Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Empty status --> "+flag1);
		
		
		//Reading collection of object using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		
		
		
		//Read all Collection object using Forach loop
		for (String eachobj : list) 
		{
			System.out.println("=>"+eachobj);
		}
		
		
		//Convert All Collection of object into Iterators
		Iterator<String> iterator=list.iterator();
		
		//Using while loop read all objects in collection
		while(iterator.hasNext())
		{
			String Obj=iterator.next();
			System.out.println("#"+Obj);
		}
		
		
	
		
	}

}
