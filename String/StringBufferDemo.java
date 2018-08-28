class StringBufferDemo
{
public static void main(String arg[])
{
StringBuffer sb=new StringBuffer("RAvi");
sb.append(" Nivangune");
sb.insert(1,"aaa");
sb.reverse();
System.out.println(sb);
System.out.println(sb.capacity());
}

}