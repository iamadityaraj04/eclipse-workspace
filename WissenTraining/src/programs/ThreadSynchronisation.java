package programs;

public class ThreadSynchronisation {
	public static void main(String[] args) {
		new ThreadDemo3("Thread1");
		new ThreadDemo3("Thread2");
		new ThreadDemo3("Thread3");
		new ThreadDemo3("Thread4");
	}
}

class ThreadDemo3 implements Runnable{
	String threadName;
	
	ThreadDemo3(String threadName){
		this.threadName=threadName;
		new Thread(this).start();
	}
	
	public void run() {
		
		synchronized(ThreadSynchronisation.class) {
			System.out.println("\n" + threadName + " Got the permission...");
			for(int i=1;i<=5;i++) {
				System.out.println(threadName+" Count: "+i);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName + " is released...");
		}
	}
}
