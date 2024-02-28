package InheritanceExamples;

public class B2 extends A2{
	
	int d;
	 B2(int l,int m,int n,int o)
	 {
		 super(l,m,n);
		 d=o;
	 }
    void show()
    {
    	System.out.println("A="+a);
    	System.out.println("B="+b);
    	System.out.println("C="+c);
    	System.out.println("D="+d);
    }
    
    public static void main (String args [])
    {
    	B2 bobj =new B2(11, 21, 92, 786);
    	bobj.show();
    }
}
