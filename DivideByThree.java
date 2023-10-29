package arithmetic;

import java.util.Scanner;

public class DivideByThree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num1 = sc.nextInt();
		if(num1 != 0 && num1%3 == 0)
			System.out.println("number is divisible by 3");
		else
			System.out.println("number is not divisible by 3");
	}
}
