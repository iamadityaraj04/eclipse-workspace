package programs;


class Run implements Runnable{
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class RunnableDemo {
	public static void main(String args[]) {
		//AAA a1=new AAA();
		//Creating multiple thread of single object
//		Thread t1=new Thread(a1);
//		Thread t2=new Thread(a1);
//		Thread t3=new Thread(a1);
		
		Thread t1=new Thread(new Run());
		Thread t2=new Thread(new Run());
		Thread t3=new Thread(new Run());
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main Exit...");
		
	}
}
