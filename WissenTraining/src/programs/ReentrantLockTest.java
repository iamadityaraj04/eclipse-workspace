package programs;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
	public static void main(String[] args) throws InterruptedException {
		ReentrantLock lock = new ReentrantLock();
		new MyThreadReentrant1 ("A",lock);
		Thread.sleep(2000);
		new MyThreadReentrant1 ("B",lock);
		Thread.sleep(2000);
		new MyThreadReentrant1 ("C",lock);
		Thread.sleep(2000);
		new MyThreadReentrant1 ("D",lock);
		Thread.sleep(2000);
		
	}
}
class Shared12{
	static int count = 0;
}

class MyThreadReentrant1 implements Runnable{
	String threadName;
	ReentrantLock lock;
	
	public MyThreadReentrant1(String threadName, ReentrantLock lock) {
		this.threadName=threadName;
		this.lock=lock;
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println("\n Starting "+threadName);
		System.out.println(threadName+  " : " +"waiting to get lock on shared resource...");
		lock.lock();
		
		System.out.println(threadName +  " : " +"locked shared resource...");
		Shared12.count++;
		
		System.out.println(threadName + " : " + Shared12.count);
		System.out.println(threadName +  " : " +"releasing the lock for shared resource...");
		
		lock.unlock();
		System.out.println(threadName + " : " + "Finished...");
	}
}

