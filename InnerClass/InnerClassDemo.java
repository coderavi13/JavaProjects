class InnerClassDemo
{
	private int a=100;
	class InnerClass
	{
		
	public void display()
	{
System.out.println("Outer class data :"+ a);
	}	
	}
	
	public static void main(String ar[])
	{
		InnerClassDemo id=new InnerClassDemo();
		InnerClassDemo.InnerClass obj=id.new InnerClass();
		obj.display();
		
	}
		
	
}