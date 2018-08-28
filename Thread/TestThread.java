class TestThread extends Thread
{
public void run()
{
System.out.println("Running thread.....");
}

public static void main(String arg[])
{
TestThread t1=new TestThread();
t1.start();

}

}