package Samplepjt;

public class ChildPolym extends ParentPolym{
	int a,b,c;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildPolym obj=new ChildPolym();
		obj.add(12,25);
		obj.add(99,5);
		

	}

}
