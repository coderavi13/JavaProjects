class ThisKeywordDemo
{

int roll;
String name;

public ThisKeywordDemo(int roll,String name)
{
this.roll=roll;
this.name=name;

}
public void display()
{
	System.out.println(roll +"    "+ name);
}
}

class ThisKeyword{
public static void main(String args[])
{
ThisKeywordDemo t=new ThisKeywordDemo(1,"Ravi...");
t.display();
}	
}
