class first
{
	
	first add()
	{
		return this;
	}
	
	void display()
	{
	System.out.println("First");	
	}
	
}

class Second extends first{
	
  Second add()
  {
	 return this; 
  }
  
  	void display()
	{
	System.out.println("Second");	
	}

public static void main(String args[]) 
{
//first s= new Second();
new first().add().display();
new Second().add().display();

}	
}