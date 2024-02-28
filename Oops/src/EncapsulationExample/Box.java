package EncapsulationExample;

public class Box
{
   private int length,width,height;

   public void setLength(int length) 
    {
	  this.length = length;
    }

   public void setWidth(int width) 
   {
	this.width = width;
   }

   public void setHeight(int height) 
   {
	this.height = height;
   }
   public int displayVolume()
   {
	   return (length*width*height);
   }
   
}
