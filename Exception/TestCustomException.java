class InvalideAgeException extends Exception
 {
public InvalideAgeException(String s)
{
super(s);
}
}
class TestCustomException
{

public void  validateAge(int a) throws InvalideAgeException
{
if(a<18)
throw new InvalideAgeException("Invalide age ");
else
System.out.println("Age is  valide");
}

public static void main(String arg[])
{
TestCustomException t= new TestCustomException();
try
{
t.validateAge(10);
}
catch(Exception e)
{
System.out.println("Exception is  :"+ e);
}

}

}