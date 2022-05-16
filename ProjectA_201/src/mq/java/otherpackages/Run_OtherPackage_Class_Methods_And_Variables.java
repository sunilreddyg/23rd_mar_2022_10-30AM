package mq.java.otherpackages;

import org.openqa.selenium.chrome.ChromeDriver;

import mq.java.object.NativeInputs;

public class Run_OtherPackage_Class_Methods_And_Variables {

	public static void main(String[] args) 
	{
		
		/*
		 * In order to run other package class methods and
		 * variables we should follow below conditions
		 * 
		 * 		Rule1:-->
		 * 				Any class,method,variable to use outside
		 * 				package we must declare with public modifier
		 * 
		 * 		Rule2:--> We should import other package references
		 * 				 to current class
		 * 
		 * 				import packagename.*;
		 * 				import packagname.Classname;
		 */
		NativeInputs.Mouse();
		ChromeDriver chrome=new ChromeDriver();
		chrome.close();
		
		
	}

}
