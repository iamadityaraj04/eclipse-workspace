package programs;

public class ArrayDemo {
	public static void main(String args[]) {
		//
		int a[];
		int[] d=new int[5];
		
		int[] g;
		int[] h,k,m;
		
		int[] arr= {11,22,33,44,55,66,77};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------");
		for(int it: arr) {
			System.out.println(it);
		}
		
		//input through command line arguments
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
//		}
//		for(String s: args) {
//			System.out.println(s);
//		}
		
		int[][] md=new int[5][]; //rows is compulsary
		md[0]=new int[5];
		md[1]=new int[50];	
		md[2]=new int[15];	
		md[3]=new int[35];	
		md[4]=new int[55];		
		
		for(int i=0; i<md.length;i++) {
			for(int j=0;j<md[i].length;j++) {
				System.out.print(md[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------");
		
		
		Student[] s=new Student[5];
		String[] names= {"Aditya","Shubham","Rahul","Sashi","Akash"};
		
		for(int i=0;i<s.length;i++) {
			s[i]=new Student();
			s[i].name=names[i];
		}
		
		for(Student st: s) {
			System.out.println("Name: " +st.name);
		}
	}
}
class Student{
	String name;
}