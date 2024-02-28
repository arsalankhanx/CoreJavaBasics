package EncapsulationExample;

public class Circle 
{
	public static final double PI = 3.14;
	private double r;
	
    private void checkRadius(double radius)
    {
    	if (radius<0.0)
    		throw new IllegalArgumentException("radius may not be negative");
    }
	
	
	public double getR() 
	{
		return r;
	}
	public void setR(double r) 
	{
		checkRadius(r);
			this.r = r;
	}
	public double area()
	{
		return PI*r*r;
	}
	public double circumference()
	{
		return 2*PI*r;
	}
	
public static void main(String args[])
{
	Circle cir = new Circle();
	cir.setR(10);
	double area=cir.area();
	double circum=cir.circumference();
	System.out.println("Area of cirle = "+area);
	System.out.println("Circumference of circle = "+circum);
}

}
