//import java.lang.cloneable;
class Demo implements Cloneable
{
int a =10;
String name ="Ravi";

public Object clone() throws CloneNotSupportedException
{
return super.clone();
}

}

class CloneDemo
{
public static void main(String arg[])
{
try{
Demo d = new Demo();

System.out.println(d.a +" "+d.name);

Demo c=(Demo) d.clone();
System.out.println(c.a +" "+c.name);

}
catch(CloneNotSupportedException e)
{
}


}

}