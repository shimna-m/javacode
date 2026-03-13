package firstpackage;

import java.util.Scanner;

public class IfElseIf {
	static void grade()
	{
		System.out.println("Enter a number between 0 and 10");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Entered number is less than 0");
		}
		else if(num>10)
		{
			System.out.println("Entered number is greater than 10");
		}
		else
		{
			System.out.println("You have entered a number within specified range");
		}
		sc.close();
	}

	public static void main(String[] args) {
		grade();		

	}

}
