class Employee{  
    int id;  
    String name;  
    float salary;  
    public Employee(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
}  
public class TestEmployee {  
public static void main(String[] args) {  
    Employee e1=new Employee(101,"ajeet",45000); 
    Employee e2=new Employee(102,"irfan",25000);  
    Employee e3=new Employee(103,"nakul",55000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  