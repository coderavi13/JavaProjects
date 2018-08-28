class Demo
{

public Demo()
{
System.out.println("This is Demo constructor ");
}
{
System.out.println("This initializer block");

}

}


class InitializerDemo extends Demo
{
{
System.out.println("This initializer block of main ");
}

public InitializerDemo()
{

System.out.println("This is  constructor of main class ");
}
public static void main(String argg[])
{
InitializerDemo id=new InitializerDemo();

}

}