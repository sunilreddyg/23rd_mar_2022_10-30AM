package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipboard {

	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Creating object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		String text="Quality Training by Real time Experts on various Technologies as per market needs makes us the best software training institute.";
		
		//Selecting a text 
		StringSelection Stext=new StringSelection(text);
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Add copied content to clipbord
		clipboard.setContents(Stext, Stext);
		
		
		//Press Contrl+V button
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
