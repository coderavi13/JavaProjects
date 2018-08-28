class StringCompare
{

public static void main(String arg[])
{
String s1="RAVI";
String s2="RAVI";
String s3=new String("RAVI");
String s4="Ravi";

System.out.println(s1.equals(s2));

System.out.println(s1.equalsIgnoreCase(s2));


System.out.println(s1==s2);

System.out.println(s1==s3);  //false(because s3 refers to instance created in nonpool)

System.out.println(s1.compareTo(s2));

System.out.println(s1.compareTo(s4));


}

}