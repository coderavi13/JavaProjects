

/*
Notes:
1. We cannot run program using static block in JDK 1.7 and after   , but in earlier versions we can execute program without static block

*/


class Demo
{
	
	static int count;
static
{
count=5;	
System.out.println("This is static block two  " + count);
	
}	

public Demo(){
count++;
System.out.println("This is Constructor " + count);
}	
	
}



class StaticDemo
{
static
{
	System.out.println("This is static block one");
	//System.exit(0);
	Demo d =new Demo();
}


public static void main(String arg[])
{
	//Demo d =new Demo();
	System.out.println("This is main method");
}
		
}
