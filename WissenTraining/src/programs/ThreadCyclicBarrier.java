package programs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadCyclicBarrier {
	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cb=new CyclicBarrier(3,new Finished());
		
		for(int i=1;i<10;i++) {
			new MyThread("Tread-"+i, cb);
			Thread.sleep(2000);
		}
	}
}

class MyThread implements Runnable{
	String threadName;
	CyclicBarrier cb;
	
	MyThread(String name,CyclicBarrier cb){
		threadName=name;
		this.cb=cb;
		new Thread(this).start();
		
	}
	public void run() {
		try {
			System.out.println(threadName);
			cb.await();
		}
		catch(InterruptedException | BrokenBarrierException ex) {
			ex.printStackTrace();
		}
	}
}

class Finished implements Runnable{
	public void run() {
		System.out.println("Finished...");
	}
}