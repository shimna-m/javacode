package firstpackage;

public class AccessSpecifiersInterface2 
{
	public void add()
	{
		int a=5,b=4,c;
		c=a+b;
		System.out.println("add: "+c);
	}

	public static void main(String[] args) {
		AccessSpecifiersInterface2 as2=new AccessSpecifiersInterface2();
		as2.add(); //public method accessible from different package
		//as2.sub(); //default method not accessible from different package
		//System.out.println(MyInterface.title); //static final variable of interface
		//as2.mult();   //private method throwing compile error		

	}

}
