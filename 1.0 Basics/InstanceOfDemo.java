class Demo
{
	
}



class InstanceOfDemo extends Demo
{
	public static void main(String arg[])
	{
		Demo a = new InstanceOfDemo();
		InstanceOfDemo d = (InstanceOfDemo)a;
		System.out.println(d instanceof Demo);
	}
	
}