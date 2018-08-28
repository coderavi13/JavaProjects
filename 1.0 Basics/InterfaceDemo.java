interface Shape
{
	int a=10;
void solve();	
void draw();
}

abstract class AbstractDemo implements Shape
{
	public void solve()
	{
		
	}
 int b=10;
}


class Circle extends AbstractDemo{
public void draw()
{
	b=b+10;
System.out.println("Circle drawing "+a+" "+b);
}
}


class Rectangle implements Shape{

public void solve()
	{
		
	}
public void draw()
{
System.out.println("Rectangle "+a);
}
}

class InterfaceDemo{
public static void main(String arg[])
{

Shape s1=new Circle();
s1.draw();

Shape s2=new Rectangle();
s2.draw();
}
}