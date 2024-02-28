package InheritanceExamples;

public class C extends B{
	 void display()
	 {
		 System.out.println("C");
		 
	 }
	 
	 public static void main (String args[])
	 {
		 C c = new C();
		 c.get(10,15);
		 c.show();
		 c.showB();
		 c.display();
	 }

}
