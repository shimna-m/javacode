package firstpackage;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println("this is constructor1");
	}
	
	ConstructorOverloading(int a)
	{
		System.out.println("this is constructor2");
		System.out.println(a);
		
	}
	
	ConstructorOverloading(double x,double y)
	{
		System.out.println("this is constructor3");
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(25);
		new ConstructorOverloading(123.45,37.236);	
		
	}

}
