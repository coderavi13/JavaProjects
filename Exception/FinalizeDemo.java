class FinalizeDemo
{

public void finalize()
{
System.out.println("Finalize method is called...");
}


public static void main(String arg[])
{
FinalizeDemo fd = new FinalizeDemo();
fd=null;
System.gc();

}
}