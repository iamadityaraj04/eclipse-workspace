package programs;

class XX extends Thread{
	public void run()
	{
		for(int i=0;i<20;i++) {
			System.out.println("i: "+ i);
			//if sleep is used we have to keep it in try catch block
			try {
				if(i%3==0) {
					Thread.sleep(3000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class YY extends Thread{
	public void run()
	{
		for(int j=0;j<20;j++) {
			System.out.println("j: "+ j);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class ZZ extends Thread{
	public void run()
	{
		for(int k=0;k<20;k++) {
			System.out.println("k: "+ k);
			try {
				if(k%3==0) {
					Thread.sleep(2000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadDemo1{
	public static void main(String args[]) {
		XX x1=new XX();
		YY y1=new YY();
		ZZ z1=new ZZ();
		x1.start();
		y1.start();
		z1.start();
		
//		for(int i=0;i<=100;i++) {
//			System.out.println(" "+ i);
//			if(i==30) {
//				z1.suspend();
//			}
//			if(i==50) {
//				x1.stop();
//			}
//			if(i==80) {
//				z1.resume();
//			}
//			try {
//				Thread.sleep(200);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
		
		Thread t1=Thread.currentThread();
		y1.setName("Rohit");
		x1.setPriority(2);
		z1.setPriority(8);
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		System.out.println(t1);
		
		try {
			y1.join();
			//x1.join();
			z1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("x1 is alive: "+x1.isAlive());
		System.out.println("y1 is alive: "+y1.isAlive());
		System.out.println("z1 is alive: "+z1.isAlive());
		
		System.out.println("Main Exit...");
	}
}

