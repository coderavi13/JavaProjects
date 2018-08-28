class  Palidrome
{
public static void main(String arg[])
{
int a=1220,temp=0,rem;
int n1=a;

while(a!=0)	
{
rem=a%10;
temp=temp*10+rem;
a=a/10;	
}
if(temp==n1)
	System.out.println("Number is palindrome");
else
	System.out.println("Note palindrome");
	
}

}