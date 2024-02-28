/* Write a program to create a class Book having data members as title, author and price.
 Accept and display data for one object */


 public class Book
 {
	 String title,author;
	 Double price;
	
	 void getdata(String s,String s2,Double d)
	{
		title = s;
		author = s2;
		price = d;
	}

	 void putdata()
	{
		System.out.println("Title="+title);
		System.out.println("Author="+author);
		System.out.println("price="+price);
	}

         public static void main(String ags[])
       {
	  Book b = new Book();
	  b.getdata("java","Arsh",199.0);
	  b.putdata();
       }
 }
