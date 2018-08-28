
class Address{
	long zip=411024;
	String city="pune";
}

class Employee
{
	
 int empId=10;
 String name="Ravi";
 float salary=20000;
 Address addr;
 
 public Employee()
	{
		Address ad =new Address();
this.addr=ad;		
	}
}

class Programmer extends Employee
{
	public Programmer(){
		super();
	}

public static void main(String arg[])
{
	

Programmer p1=new Programmer();

System.out.println(" Salary of employee is "+ p1.salary);
System.out.println("ID "+ p1.empId);
System.out.println("Name "+ p1.name);
System.out.println("Zip "+ p1.addr.zip);
System.out.println("city "+ p1.addr.city);

}
}