class Person
{
	int age;
	String name;
	
	public Person(int age, String name)
	{
		this.age=age;
		this.name = name;
	}
}

class Employee extends Person
{
	float salary;
	
	public Employee(int age,String name,float salary)
	{
		super(age,name);
		this.salary=salary;
	}
	
	public void display()
	{
	System.out.println("Age="+age +"Name="+name+"Salary="+salary);	
	}
}

class SuperDemo
{
	public static void main(String arg[])
	{
		Employee e=new Employee(26,"Ravi",20000);
		e.display();
	}
	
}