package programs;

class Room {
	int length;
	int width;
	Room(){
		System.out.println("==============");
	}
	Room(String str){
		this();//must be the first statement inside constructor
		System.out.print("Area: ");
	}
	Room(int length, int width){
		this("");
		this.length=length;
		this.width=width;
		this.areaOfRoom();
	}
	public void areaOfRoom() {
		System.out.println(length*width);
	}
}
public class RoomMain{
	public static void main(String args[]) {
		new Room(10,68);
//		Room r2=new Room(100,648);
//		Room r3=new Room(423,34);
	}
}