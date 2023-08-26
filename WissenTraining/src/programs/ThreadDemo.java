package programs;


class Thread1 extends Thread{
	public void run()
	{
		for(int i=0;i<20;i++) {
			System.out.println("i: "+ i);
		}
	}
}
class Thread2 extends Thread{
	public void run()
	{
		for(int j=0;j<20;j++) {
			System.out.println("j: "+ j);
		}
	}
}
class Thread3 extends Thread{
	public void run()
	{
		for(int k=0;k<20;k++) {
			System.out.println("k: "+ k);
		}
	}
}
class ThreadDemo{
	public static void main(String args[]) {
		Thread1 x1=new Thread1();
		Thread2 y1=new Thread2();
		Thread3 z1=new Thread3();
		x1.start();
		y1.start();
		z1.start();
		System.out.println("Main Exit...");
	}
}