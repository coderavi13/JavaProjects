import java.util.StringTokenizer;
class ReverseEachWord
{
public static void main(String arg[])
{

String s="This is java";
StringBuffer sb=new StringBuffer();
String str1[]=s.split(" ");

for(String w:str1)
{
	StringBuffer s2=new StringBuffer(w);
	//System.out.print(s2.reverse()+"  ");
	s2.reverse();
	sb=sb.append(s2+" ");
	
}
System.out.print(sb);
}

}