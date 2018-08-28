class SleepTest extends Thread
{

public void run()
{
for(int i=1;i<=5;i++)
{
try
{
sleep(3000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}

}

public static void main(String arg[])
{
	SleepTest t1 =new SleepTest();
	SleepTest t2 =new SleepTest();
	
	t1.start();
	t2.start();
	t2.start();    //it will give IllegalThreadStateException     but program will compile  and run successfully
	
	
}

}