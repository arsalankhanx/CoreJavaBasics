/* Define a class Rectangle having data members length and breadth
Accept and display data for three objects of the class using array of object*/

public class Rectangle1 {
	int length,breadth;
	void accept(int a1,int a2)
	{
		length=a1;
		breadth=a2;
		
	}
	void display()
	{
		System.out.println("Length:-"+length+ " and breadth:-"+breadth);
		
	}

     public static void main(String args[])
   {
     Rectangle1 arr[]= new Rectangle1[3];
     for(int i=0;i<3;i++)
     {
    	 arr[i]= new Rectangle1();
    	 arr[i].accept(25,18);
    	 arr[i].display();
     }
  }
}     