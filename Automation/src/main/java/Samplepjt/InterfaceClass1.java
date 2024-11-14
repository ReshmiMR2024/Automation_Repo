package Samplepjt;

public class InterfaceClass1 implements InterfaceEx1,Interfaceex2{
	public void  display()
	{
		System.out.println("Interface1");
	}
	
	public void  print()
	{
		System.out.println("Interface2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceClass1 obj=new InterfaceClass1();
		obj.display();
		obj.print();
	}

}
