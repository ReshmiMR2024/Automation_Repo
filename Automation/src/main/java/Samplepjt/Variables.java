package Samplepjt;

public class Variables {

		int n1=100;
		static float n2=4.5f;
		public static void display()
		{
		
		int n3=10;
		System.out.println("The static variable variable is "+n2);
		System.out.println("The local variable  is "+n3);
	

		}

		public void print()
		{
		System.out.println("The static variable   is :"+n2);
		System.out.println("The instance variable is :"+n1);
		
		}


		public static void main(String[] args)
		{
			//Variables.display();
			Variables obj=new Variables();
			obj.print();
			System.out.println("The instance variable is :"+obj.n1);
			
			

		}
		

	}


