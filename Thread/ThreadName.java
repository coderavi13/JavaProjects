// getting and setting name of thread and getting iD of thread

class ThreadName extends Thread
{
public void run()
{
System.out.println("Running ......");
}

public static void main(String arg[])
{
	ThreadName t2=new ThreadName();
ThreadName t1=new ThreadName();


System.out.println("Name of 1st thread :"+t1.getName());
System.out.println("ID of 1st thread :"+t1.getId());
t1.setName("Ravi 1");
t2.start();
t1.start();
System.out.println("Name of 1st thread after rename :"+t1.getName());
System.out.println("Name of 2nd thread :"+t2.getName());
System.out.println("ID of 2nd thread :"+t2.getId());

}

}