package InheritanceExamples;

public class B1 extends A1{
	
	int a;
	float b;
	 
	B1(int p,int q)
	{
		a=p;
		super.b=q;
		
	}
	void show()
	{
		super.show();
		System.out.println("B in super class"+super.b);
		System.out.println("A in sub class"+a);
	}
	
	public static void main (String args[])
	{
		B1 subobj = new B1(10,15);
		subobj.show();
	}

}
