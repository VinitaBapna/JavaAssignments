package arithmetic;

import java.util.Scanner;

public class CalcAdd {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("Addition : ");
		System.out.println(num1+num2);
	}

}
