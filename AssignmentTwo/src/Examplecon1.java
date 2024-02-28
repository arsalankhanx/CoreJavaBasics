
public class Examplecon1 
{
	private int var;
   Examplecon1(int num)
   {
	   num = var;
   }
   int getvalue()
   {
	   return var;
   }
   public static void main (String args[])
   {
	   Examplecon1 call=new Examplecon1(15);
	   System.out.println("value of var is="+call.getvalue());
   }
   
}
