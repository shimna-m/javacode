package firstpackage;

import java.util.Scanner;

public class IfElseCondition {
	static void age()
	{
		System.out.println("Enter the age: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}

	public static void main(String[] args) {
		age();		

	}

}
