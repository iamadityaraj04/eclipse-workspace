package programs;

class Sync implements Runnable{
	
	
	//synchronized public void run() {
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " has started...");
		
		//synchronizing particular block of code
		synchronized(this){
			for(int i=0;i<=20;i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		
	}
}

public class Synchronization {
	public static void main(String args[]) {
		Sync s1=new Sync();
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		Thread t3=new Thread(s1);
		
		t1.setName("Adi");
		t2.setName("Shubbu");
		t3.setName("Pandu");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Exit...");
	}
}
