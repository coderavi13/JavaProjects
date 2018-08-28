class Student1
{
int rollNo;
String Name;
public Student1(int i,String n)
{
rollNo=i;
Name=n;
}

public Student1(Student1 s)
{
rollNo=s.rollNo;
Name=s.Name;
}

public void display()
{
System.out.println("Roll No " + rollNo +" Name " + Name);
}

}

class ConstructorDemo
{

public static void main(String []args)
{
Student1 s1 = new Student1(1,"Ravi");
Student1 s2 = new Student1(s1);
s2.display();


}
}