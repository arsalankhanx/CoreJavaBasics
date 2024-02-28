package InheritanceExamples;

public class Square extends Rectangle{
	
	int areaOfSquare()
	{
		System.out.println("Calculating the area of square");
		return(length*length);
	}
	
	public static void main (String args[])
	{
		Square sq =new Square();
		int area1=sq.areaOfRectangle();
		System.out.println(area1);
		
		int area2=sq.areaOfSquare();
		System.out.println(area2);
	}

}
