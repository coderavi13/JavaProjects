 class Demo
{
	static final int c;
 final int b;
final int a=100;
public Demo()
{
	
}
static 
{
	c=300;
}
{
b=25;	
}

final void display()
{
//a= a+ 10;                     a is final variable so we cant reinitialize it
System.out.println( " "+ a +" " + b +" "+c);
}
void display(int a)
{
System.out.println("Final display in final class"+ a);	
}

}

class FinalDemo extends Demo{
/*  This is not allowed to override fianl method
void display()
{
System.out.println("Final display in final class"+ a);	
}

*/
public static void main(String args[])
{
FinalDemo fd = new FinalDemo();
fd.display();
fd.display(50);

}

}