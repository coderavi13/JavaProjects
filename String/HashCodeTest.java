class HashCodeTest
{

public static void main(String str[])
{
String s1="Ravi";
System.out.println(s1.hashCode());
s1=s1 +"Ravi";
System.out.println(s1.hashCode());

StringBuffer sb=new StringBuffer("Java");
System.out.println(sb.hashCode());
sb.append("Program");
System.out.println(sb.hashCode());

}

}