
public class DemoCons
{
  int val1;
  int val2;
  
  DemoCons()
  {
	  val1=110;
	  val2=20;
	  System.out.println("DemoConsClass :: No arguments constructor");
  }
  DemoCons(int num1)
  {
	val1=num1;
	val2=num1;
	System.out.println("DemoConsClass :: Overloaded constructor with one arguments");
  }
  DemoCons(int num1,int num2)
  {
	  val1=num1;
	  val2=num2;
	 
	  System.out.println("DemoConsClass :: Overloaded constructor with two arguments");
  }
    
    void display()
    {
    	System.out.println("val1="+val1+" val2="+val2);
    }
   public static void main (String args[])
   {
	   DemoCons d1= new DemoCons();
	   d1.display();
	   DemoCons d2=new DemoCons(85);
	   d2.display();
	   DemoCons d3=new DemoCons(78,79);
	   d3.display();
   }
}
