
import java.util.StringTokenizer;

class StringTokenizerDemo
{
public static void main(String arg[])
{

String s1="My name is ravi and i am java programmer";
StringTokenizer str=new StringTokenizer(s1," ",true);
while(str.hasMoreTokens())
{
System.out.println(str.nextToken());
}

}
}