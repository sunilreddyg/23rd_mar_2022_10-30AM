package mq.java.methods;

import mq.java.constrcutor.RobotA;

public class Run_TVRemoteMethods
{
	
	public static void main(String[] args) 
	{
		new TVRemote().on();
		new TVRemote().NextChannel();
		new TVRemote().off();
		
		new RobotA().jump();
	}

}
