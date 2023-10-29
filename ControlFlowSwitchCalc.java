package arithmetic;

import java.util.Scanner;

public class ControlFlowSwitchCalc {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		System.out.println("Enter any one operator(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
			case '+': 
				System.out.println(num1+num2);
				break;
			case '-': 
				System.out.println(num1-num2);
				break;
			case '*': 
				System.out.println(num1*num2);
				break;
			case '/': 
				System.out.println(num1/num2);
				break;
			case '%': 
				System.out.println(num1%num2);
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}
}

