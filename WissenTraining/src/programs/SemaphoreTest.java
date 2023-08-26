package programs;

import java.util.*;
import java.util.concurrent.Semaphore;


class SemaphoreTest {
	public static void main(String[] args) {
		Semaphore sem=new Semaphore(1);
		
		new DisplayNumbers1("Thread1", sem);
		new CompDisplayNames("Thread2", sem);
	}
}
class DisplayNumbers1 implements Runnable{
	String threadName;
	Semaphore sem;
	
	DisplayNumbers1(String threadName, Semaphore sem){
		this.threadName=threadName;
		this.sem=sem;
		new Thread(this).start();
	}
	
	public void run() {
		try {
			sem.acquire();
			System.out.println("\n"+threadName+" Got the permission...");
			
			for(int i=0;i<5;++i) {
				System.out.println(threadName +": "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(threadName+ " is released...");
		sem.release();
	}
}

class CompDisplayNames implements Runnable{
	String threadName;
	Semaphore sem;
	
	CompDisplayNames(String threadName, Semaphore sem){
		this.threadName=threadName;
		this.sem=sem;
		new Thread(this).start();
	}
	public void run() {
		try {
			List<String> strName=Arrays.asList("Rohit", "Pandey", "Rahul", "Puneet", "Ravi");
			sem.acquire();
			System.out.println("\n"+threadName+" Got the permission...");
			
			for(String name: strName) {
				System.out.println(threadName+": "+name);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(threadName+ " is released...");
		sem.release();
	}
}