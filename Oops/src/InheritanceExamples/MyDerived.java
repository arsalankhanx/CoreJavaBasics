package InheritanceExamples;

public class MyDerived extends MyBase {
	int y=22;
	void show()
	{
		System.out.println("y="+y);
		
	}
	
	public static void main (String args[])
	{
		MyDerived md = new MyDerived();
		
		md.show1();
		md.show();
	}

}
