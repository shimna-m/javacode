package firstpackage;

import package2.AccessSpecifierPublicClass;
//import package2.AccessSpecifierDefaultClass;  //compile time error for default class from different package

public class AccessSpecifierClasses2 {

	public static void main(String[] args) {
		AccessSpecifierPublicClass pc=new AccessSpecifierPublicClass();
		pc.display();
		
		//Default class method from other package not accessible.Compile time error
		//AccessSpecifierDefaultClass dc=new AccessSpecifierDefaultClass();
		//dc.display();  //compile error

	}

}
