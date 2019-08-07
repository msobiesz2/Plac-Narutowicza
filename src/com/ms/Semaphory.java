package com.ms;

import java.util.concurrent.Semaphore;

public class Semaphory {
	
	Semaphore pusty = new Semaphore(1);
	Semaphore pelny = new Semaphore(0);

}


 class Threads extends Thread
{
	@Override
	 public void run() 
	{
		try 
		{
			
		}
		catch(Exception e) 
		{
			System.out.println("Exception caught");
		}
	}
}