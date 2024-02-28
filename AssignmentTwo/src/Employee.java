
public class Employee
{
	int empId;
	String empName;
	
	public Employee(int id,String name) 
	{
	  this.empId=id;
	  this.empName=name;
	}
	void info()
	{
	  System.out.println("Id="+empId+ "Name="+empName);	
	}
	public static void main(String args[])
	{
		Employee ob1=new Employee(2050,"arsh");
		Employee ob2=new Employee(205540,"nish");
		ob1.info();
		ob2.info();
	}

}
