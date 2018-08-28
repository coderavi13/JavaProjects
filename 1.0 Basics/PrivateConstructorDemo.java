class PrivateConstructorDemo 
{
private PrivateConstructorDemo()
{
System.out.println("This is private constructor");
}
static {PrivateConstructorDemo d =new PrivateConstructorDemo();}
public static void main(String arg[])
{

//PrivateConstructorDemo d =new PrivateConstructorDemo();
}
}