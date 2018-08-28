class JoinTest extends Thread
{

public void run()
{

for(int i=1;i<5;i++)
{

try{ sleep(500);}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);

}

}

public static void main(String arg[])
{
	JoinTest t1=new JoinTest();
	JoinTest t2=new JoinTest();
	JoinTest t3=new JoinTest();
	t1.start();
	try{ t1.join();   }                             //other threads will wait for thread t1 to complete execution
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	t2.start();
	try{ t2.join(1000);   }                      //other threads will wait for thread t2 to run for 1000 milliseconds
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	t3.start();
	
	
	
}

}