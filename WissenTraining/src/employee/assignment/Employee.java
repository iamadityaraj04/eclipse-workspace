package employee.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

abstract class Employee{
	private int id;
	private String name;
	private int age;
	private String designation;
	private float salary;
	public static int count=0;
	
	//constructor to get details
	public Employee(float salary, String designation) {
		id=InvalidInputException.readId();
		name=InvalidInputException.readName();
		age=InvalidInputException.readAge();
		this.salary=salary;
		this.designation=designation;
		enterData(id,name,age,this.salary,this.designation);
		count++;
	}
	
	public static void enterData(int id,String name,int age, double salary,String designation){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			PreparedStatement ps=connect.prepareStatement("insert into EMPDATA values(?,?,?,?,?);");
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.setDouble(4,salary);
			ps.setString(5,designation);
			
			ps.execute();
			ps.close();
			connect.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}


//method to display information
	/*public final String toString() {
		//return "Name: "+name+"\n"+"Age: "+age+"\n"+"Designation: "+designation+"\n"+"Salary: ₹"+salary+"\n";
		return name+" | "+age+" | "+salary+" | "+designation;
		
	}*/
	
	//method to get and set data
	public float getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setSalary(float salary) {
		if(salary>=0) {
			this.salary=salary;
		}	
	}
	public abstract void raiseSalary();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static ArrayList<Employee> readFromFile() {
	
	try
	{	
		File f=new File("emp/employee.ser");
		if(f.exists()) {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp/employee.ser"));
			ArrayList<Employee> list=(ArrayList<Employee>)ois.readObject();
			return list;
		}
		else
		{
			System.out.println("No record exists!");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
return new ArrayList<Employee>();
}*/
	
	
	//writing data in file
	/*public void writeToFile()
	{
		try 
		{
			File dir=new File("emp");
			dir.mkdir();
			File f=new File(dir,"employee.ser");
			f.createNewFile();
			
			PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println(name+" | "+age+" | "+salary+" | "+designation);
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}*/
	
	/*public static void writeToFile(ArrayList<Employee> list) {
		try
		{	
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("emp/employee.ser"));
			oos.writeObject(list);
			oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//reading data from file
	/*public static void readFromFile()
	{
		try 
		{
			File fr=new File("emp/employee.txt");
			if(fr.exists()) {
				BufferedReader br=new BufferedReader(new FileReader(fr));
				String line=null;
				while((line=br.readLine()) !=null)
				{
					StringTokenizer st=new StringTokenizer(line,"|");
					System.out.println("Name: "+st.nextToken());
					System.out.println("Age: "+st.nextToken());
					System.out.println("Salary: "+st.nextToken());
					System.out.println("Designation: "+st.nextToken());
					System.out.println();
				}
				br.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}*/

}