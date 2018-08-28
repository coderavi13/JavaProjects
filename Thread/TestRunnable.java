class TestRunnable implements Runnable
{
public void run()
{

System.out.println("Runnable thread running....");
}

public static void main(String arg[])
{
TestRunnable t=new TestRunnable();
Thread t1=new Thread(t);
t1.start();
}	
	
}	

	
	
	
