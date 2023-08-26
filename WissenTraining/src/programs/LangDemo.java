package programs;

class Clone implements Cloneable {
	int x; 
	public String tostring() {
		return "The object with value of x: "+x;
	}
	public Clone clone() {
		try
		{
			return (Clone)super.clone();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public void finalize() {
		System.out.println("object with value "+x+" getting desgtroyed");
	}
}
public class LangDemo {
	public static void main(String args[]) {
		Clone c1=new Clone();
		c1.x=10;
		
		Clone c2=new Clone();
		c2.x=10;
		
		Clone c3=c1.clone();
		c3.x=2000;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		Class c4=c3.getClass();
		System.out.println("c3 is object of class: "+ c4.getName());
		Class c5="Hello".getClass();
		System.out.println("Hello is object of class: "+ c5.getName());
		
		c2=null;
		c1=null;
		System.gc();

	}
}
