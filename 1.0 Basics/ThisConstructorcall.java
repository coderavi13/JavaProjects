class Demo
{
	
	static int roll;
	static String name;
	
	static{
		
		roll=15;
		name="Ravi";
	}
public Demo()
{
this(roll,name)	;
}
	

public Demo(int a,String n)
{
this(a);
System.out.println(n);

}
public Demo(int a)
{

System.out.println(a);

}
}



class ThisConstructorcall
{

public static void main(String[] args)
{
//Demo d=new Demo(1,"Ravi");
Demo d=new Demo();
}

}