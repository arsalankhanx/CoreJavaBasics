/* program to demonstrate the this() method in Constructor context 
(cube class containing 3 Constructor s)*/

public class Cube2
{
 int length,breadth,height;
  int getvolume()
  {
	  return (length*breadth*height);
  }
  
  Cube2()
  {
	  this(10,20);
  }
  
  Cube2(int l,int b)
  {
	  this(l,b,15);
  }
  
  Cube2(int l,int b,int h)
  {
	  length=l;
	  breadth=b;
	  height=h;
  }
  public static void main(String args[])
   {
	  Cube2 cubeobj1=new Cube2();
	  Cube2 cubeobj2=new  Cube2(14,17,12);
	  System.out.println("volume of cube2="+cubeobj1.getvolume());
	  System.out.println("volume of cube2="+cubeobj2.getvolume());
	  
   }
}
