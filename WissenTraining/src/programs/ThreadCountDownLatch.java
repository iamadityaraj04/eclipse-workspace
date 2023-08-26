package programs;

import java.util.concurrent.CountDownLatch;

public class ThreadCountDownLatch {
	public static void main (String args[]) throws InterruptedException {
		CountDownLatch cdl=new CountDownLatch(5);
		
		MyThread1 m1=new MyThread1("m1",cdl);
		Thread.sleep(1000);
		
		MyThread1 m2=new MyThread1("m2",cdl);
		Thread.sleep(1000);
		
		MyThread1 m3=new MyThread1("m3",cdl);
		Thread.sleep(1000);
		
		MyThread1 m4=new MyThread1("m4",cdl);
		Thread.sleep(1000);
		
		MyThread1 m5=new MyThread1("m5",cdl);
		Thread.sleep(1000);
		
		cdl.await();//waiting for all the thread to load
		System.out.println("All the thread are running...");
	}
}

class MyThread1 implements Runnable{
	String threadName;
	CountDownLatch cdl;
	
	MyThread1(String threadName, CountDownLatch cdl){
		this.threadName=threadName;
		this.cdl=cdl;
		new Thread(this).start();
	}
	public void run() {
		try {
			System.out.println(threadName+" Started");
			Thread.sleep(1000);
			cdl.countDown();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}