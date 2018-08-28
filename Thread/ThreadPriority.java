class ThreadPriority extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
	System.out.println(i +" "+ Thread.currentThread().getName());
	System.out.println(i +" "+ Thread.currentThread().getPriority());
}
}

public static void main(String arg[])
{
ThreadPriority t1 =new ThreadPriority();
ThreadPriority t2 = new ThreadPriority();
ThreadPriority t3 = new ThreadPriority();

t1.setPriority(Thread.NORM_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.MAX_PRIORITY);

t1.start();
t2.start();
t3.start();
}	
	
}

