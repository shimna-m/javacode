package firstpackage;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		System.out.println("Enter a 2 digit number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>10)
		{
			System.out.println("Number is greater than 10");
		}
		else
		{
			System.out.println("Number is less than 10");
		}
		sc.close();
	}

}
