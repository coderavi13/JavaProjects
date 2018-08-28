interface Base
{
public int a=10;
 void display();
}

class DerivedClass implements Base 
{
public  void display()
{
System.out.println(a);
}
}


class InheritanceDemo
{
	public static void main(String arg[])
	{
     DerivedClass c=new DerivedClass();
     c.display();
	}

}