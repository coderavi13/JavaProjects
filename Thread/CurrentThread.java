class CurrentThread extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName());
System.out.println("Inside for" + i);
}
}


public static void main(String arg[])
{
CurrentThread t1=new CurrentThread();
CurrentThread t2=new CurrentThread();
t1.start();
t2.start();

	
}

}