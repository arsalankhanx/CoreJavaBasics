/* program to demonstrate the parameterized constructor */

public class Cube1 
{
   int length,breadth,height;
   int getvolume()
   {
	   return(length*breadth*height);
   }
   
   Cube1()
   {
	   length=12;
	   breadth=22;
	   height=14;
   }
   Cube1(int l,int b,int h)
   {
	   length=l;
	   breadth=b;
	   height=h;
   }
   
   public static void main(String args[])
   {
	   Cube1 obj1=new Cube1();
	   Cube1 obj2=new Cube1(3,3,3);
	   System.out.println("volume of cube="+obj1.getvolume());
	   System.out.println("Volume of cube="+obj2.getvolume());
   }
}
