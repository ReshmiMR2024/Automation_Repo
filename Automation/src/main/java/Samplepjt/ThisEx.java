package Samplepjt;

public class ThisEx {
	int num;
	String name;
	public ThisEx(int num,String name)
	{
	
	this.num=num;
	this.name=name;
	System.out.println("The number is:"+num);
	System.out.println("The number is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisEx obj=new ThisEx(100,"Reshmi");
	}

}
