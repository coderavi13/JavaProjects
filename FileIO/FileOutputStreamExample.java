import java.io.FileOutputStream;
class FileOutputStreamExample
{

public static void main(String arg[])
{

try{
FileOutputStream fo=new FileOutputStream("E:\\Programming Practice\\Java\\FileIO\\InputFiles\\first.txt");
			fo.write(65); 
String s="Ravindra...";
byte[] b=s.getBytes();
fo.write(b); 			
             fo.close();    
             System.out.println("success..."); 
}
catch(Exception e)
{
System.out.println(e);
}
}

}