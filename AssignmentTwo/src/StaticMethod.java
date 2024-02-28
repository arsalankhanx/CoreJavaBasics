
public class StaticMethod
{
static int a =17;

void display()
{
	System.out.println("This is an instance method");
}
	static void show()
	{
		System.out.println("This is an static method");
		
	}
	public static void main(String args[])
	{
		StaticMethod sa = new StaticMethod();
		sa.display();
		StaticMethod sm=null;
		
        sm.show();
        int c =sm.a;
        System.out.println(c);
		
		
	}
}
