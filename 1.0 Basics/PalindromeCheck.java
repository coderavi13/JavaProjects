class PalindromeCheck
{
	public static void main(String args[])
	{
		
int num=393;
int rem;
int num2=0;
int temp=num;
while(num!=0)
{
	rem=num%10;
	num2=num2*10+rem;
    num	=num/10;
}
if(temp==num2)
{
System.out.println(num2 +" Number is palindrome");	
}
else
{
	System.out.println(num2 +" Number is not palindrome");	
}
	}
	
	
}