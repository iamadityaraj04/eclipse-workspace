package programs;

import java.util.Optional;

public class OptionalClass {
	
	int data;
	OptionalClass(int data){
		this.data=data;
	}
	
	public static void main(String[] args) {
		OptionalClass num1=null;
		OptionalClass num2=new OptionalClass(40);
		
		Optional<OptionalClass> opT1=Optional.ofNullable(num1);
		System.out.println(opT1); //Optional.empty
		
		Optional<OptionalClass> opT2=Optional.ofNullable(num2);
		
		int result=sum(opT1,opT2);
		System.out.println("Result: "+result);
	}
	public static int sum(Optional op1, Optional op2) {
		OptionalClass num3=(OptionalClass) op1.orElse(new OptionalClass(0));
		System.out.println("num3: "+num3.data); //Output: 0
		
		OptionalClass num4=(OptionalClass) op2.orElse(new OptionalClass(0));
		System.out.println("num4: "+num4.data); //Output: 40
		
		return num3.data+num4.data;
	}
	
}
