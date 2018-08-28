
//import java.
class ExceptionDemo
{
	public static void main(String arg[])
	{
		try
		{
			int a;
			a=50/5;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		finally
		{
		System.out.println("Finally block executed");	
			
		}
		
	}
	
}