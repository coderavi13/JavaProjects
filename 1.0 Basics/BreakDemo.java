class BreakDemo
{
public static void main(String args[])
{
	outer:
for(int i=0;i<10;i++)
{
	inner:
for(int j=0;j<10;j++)
{
if(j==5){
break outer;
}
else{
System.out.println(i+ "   "+j);
}
}
}

}
}