
/* Write a program to calculate the area of rectangle */

public class Rectangle 
{
	int length,width;
	
	void getdata(int a,int b)
	{
		length = a;
		width = b;
						
	}
	
	int rectArea()
	{
      int area = length*width;
		
		return area;
		
	}
}