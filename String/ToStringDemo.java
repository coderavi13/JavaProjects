class ToStringDemo
{
int roll;
String name;
public ToStringDemo(int roll,String name)
{
this.roll=roll;
this.name=name;	
}

public String toString()
{
return roll +"  "+ name;
}

public static void main(String arg[])
{
ToStringDemo s1=new ToStringDemo(1,"Ravi");
ToStringDemo s2=new ToStringDemo(2,"Java");

System.out.println(s1);
System.out.println(s2);


}
}