abstract class TestClass
{
abstract  void display();
}

class TestAnonymousClass
{
public static void main(String arg[])
{
TestClass tc =new TestClass(){void display(){System.out.println(" Anonymous class Demo "); }
};

tc.display();
}

}