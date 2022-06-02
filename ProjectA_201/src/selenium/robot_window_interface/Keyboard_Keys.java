package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard_Keys {

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Creating object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);



	}

}
