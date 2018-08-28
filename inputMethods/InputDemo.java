import java.util.Scanner;

class InputDemo
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name: ");
		String nm=sc.nextLine();
		System.out.println("Enter roll number: ");
		int rn=sc.nextInt();
		System.out.println("Enter fee : ");
		String fee=sc.next();
		System.out.println("Enter percentage : ");
		double per=sc.nextDouble();
		
		System.out.println(nm + " " +rn+ " " +fee+ " " +per);
			
	}
	
}