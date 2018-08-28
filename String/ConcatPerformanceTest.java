class ConcatPerformanceTest
{
public void concatWithString()
{
String s="Ravi";
for(long i=0;i<10000;i++)
{
s=s+"Ravi";
}
}

public void concatWithStringBuffer()
{
StringBuffer sb= new StringBuffer("Java");
for(long i=0;i<10000;i++)
{
sb.append("Program");
}
}


public static void main(String arg[])
{
	ConcatPerformanceTest cp=new ConcatPerformanceTest();
long tm=System.currentTimeMillis();
cp.concatWithString();
System.out.println(System.currentTimeMillis()-tm);

tm=System.currentTimeMillis();
cp.concatWithStringBuffer();
System.out.println(System.currentTimeMillis()-tm);

//System.out.println();

}

}