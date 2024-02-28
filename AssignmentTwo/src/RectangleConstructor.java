/* Write a program to calculate the area of rectangle.
By using  constructor method to initialize an object at the time of its creation*/

public class RectangleConstructor
{
   int length,width;
   RectangleConstructor(int a,int b)
   {
	 length = a;
	 width = b;
   }
   
   int rectarea()
   {
	 return (length*width);
   }
   
}
