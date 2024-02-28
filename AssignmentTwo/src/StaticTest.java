import com.sun.org.glassfish.external.statistics.impl.StatisticImpl;


public class StaticTest
{
 static  int x = 15;
 
 int y=16;
 
 void display()
 {
	 System.out.println(x);
	System.out.println(y);
 }
 static void show()
 {
	 System.out.println(x);
	 //System.out.println(y);
 }
 
 public static void main(String args[])
 {
	StaticTest st = new StaticTest();
	st.display();
	show();
 }
}
