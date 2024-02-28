package EncapsulationExample;

public class EncapTest 
{
   private String name,idnum;
   private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIdnum() {
	return idnum;
}
public void setIdnum(String idnum) {
	this.idnum = idnum;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public static void main (String args[])
{
	EncapTest encap = new EncapTest();
	encap.setName("arsh");
	encap.setAge(20);
	encap.setIdnum("ar2000");
	System.out.println("Name:-"+encap.getName());
	System.out.println("Age:-"+encap.getAge());
	System.out.println("Id:-"+encap.getIdnum());
}
   
}