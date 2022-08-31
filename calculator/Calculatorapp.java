package calculator;

import java.util.Scanner;

public class Calculatorapp {

	static int choice,a,b,sum,dif,mul,div,mod;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Calculator...");
		System.out.println("Enter a operend:");
		a=s.nextInt();
		System.out.println("Enter b operend:");
		b=s.nextInt();
		System.out.println("Enter 1 for addition..");
		System.out.println("Enter 2 for subtraction..");
		System.out.println("Enter 3 for multiplication..");
		System.out.println("Enter 4 for quotient..");
		System.out.println("Enter 5 for remainder..");
		System.out.println("Enter 6 to exit..");
		while(true)
		{
		System.out.println("Enter the choice..");
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			sum=a+b;
			System.out.println("Sum is : "+sum);
			break;
		case 2:
			dif=a-b;
			System.out.println("Difference is: "+dif);
			break;
		case 3:
			mul=a*b;
			System.out.println("Product is: "+mul);
			break;
		case 4:
			div=a/b;
			System.out.println("Quotient is: "+div);
			break;
		case 5:
			mod=a%b;
			System.out.println("Remainder is: "+mod);
			break;
		case 6:
			System.exit(0);
			break;
		default :System.out.println("Wrong choice..");
		}
		}
		
	}

}
