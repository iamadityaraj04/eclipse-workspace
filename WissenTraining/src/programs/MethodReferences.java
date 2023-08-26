package programs;

interface NewInterfaceForMaps{
	public void mapButton();
}

public class MethodReferences {
	
	public void displayMap()
	{
		System.out.println("Display google maps..");
	}
	
	public static void displayMapStatic() {
		System.out.println("Display google maps from static method..");
	}
	public static void main(String[] args) {
		MethodReferences obj=new MethodReferences();
		
		NewInterfaceForMaps newInterface1=obj :: displayMap;
		newInterface1.mapButton();
		
		//do not need to create object to refer static method
		NewInterfaceForMaps newInterface2=MethodReferences :: displayMapStatic;
		newInterface2.mapButton();
	}
}
