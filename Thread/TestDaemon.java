class TestDaemon extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("Daemon thread");
}
else
{
System.out.println("Normal thread");
}

}
public static void main(String arg[])
{
TestDaemon t1=new TestDaemon();

TestDaemon t2=new TestDaemon();
t1.setDaemon(true);
t1.start();
t2.start();	
}

}