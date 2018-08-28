class LabledLoop
{
public static void main(String arg[])
{
first:
for(int i=0;i<=5;i++)
{
   second:
    for(int j=0;j<=5;j++)
	{
		System.out.println(j);
	if(j==3)
	{
		
	break first;
	}
	}
}
}
}