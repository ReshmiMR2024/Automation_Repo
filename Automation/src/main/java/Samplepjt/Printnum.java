package Samplepjt;

public class Printnum {
	String str;
	int num1;
	public Printnum(String name,int n1)
	{
		str=name;
		num1=n1;
	}
	
	
	public void print()
	{
		System.out.println("The String is: "+str);
		System.out.println("The integer value is: " +num1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Printnum obj1=new Printnum("Reshmi",10);
		obj1.print();
		
		
		
		
	}

}
