package Samplepjt;

public class StaticOverloading {
	
	public static void add(int n1, int n2)
	{
	int sum;
	sum=n1+n2;
	System.out.println("The sum of integer number is "+sum);
	
	
	}
	public static void add(float n1, float n2)
	{
	float sum;
	sum=n1+n2;
	System.out.println("The sum of float number is "+sum);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOverloading.add(10, 50);
		StaticOverloading.add(100.f, 500.f);
		

	}

}
