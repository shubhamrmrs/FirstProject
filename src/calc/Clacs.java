package calc;

import java.util.Scanner;

public class Clacs {

	static void sqaureRoot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		double a = sc.nextDouble();
		System.out.println("Sqrt of " + a + " is " + Math.sqrt(a));
	}

	static void Power() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base number :- ");
		double a = sc.nextDouble();
		System.out.println("Enter Power number :- ");
		double b = sc.nextDouble();
		System.out.println("Power of " + a + " to the " + b + " is " + Math.pow(a, b));

	}

	static void standard() {
		String flag = "N";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Welcome to Normal Calculator, Please Select opertation :- ");
			System.out.println("1. Add\n2. Substraction\n3. Multiplication\n4. Division");
			int ops = sc.nextInt();
			System.out.println("Enter first number :- ");
			double a = sc.nextDouble();
			System.out.println("Enter second number :- ");
			double b = sc.nextDouble();
			switch (ops) {
			case 1:
				double sum = a + b;
				System.out.println("Sum of " + a + " and " + b + " is " + sum);
				break;
			case 2:
				System.out.println("Substraction of " + a + " and " + b + " is " + (a - b));
				break;
			case 3:
				System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
				break;
			case 4:
				System.out.println("Division of " + a + " and " + b + " is " + (a / b));
				break;
			default:
				System.out.println("None of them,Wrong input");
				break;
			}
			System.out.println("Do you want to continue with this Calculator (Y/N) ?");
			flag = sc.next();
		} while (flag.equalsIgnoreCase("Y"));
		System.out.println("Thanks, Have a nice Day!!!");

	}

	static void scientific() {
		String flag = "N";
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		do {
			System.out.println("Welcome to Scientific Calculator, Please Select opertation :- ");
			System.out.println("1. Sqaure Root\n2. Power");
			int ops = sc.nextInt();

			switch (ops) {
			case 1:
				Clacs.sqaureRoot();

				break;
			case 2:
				Clacs.Power();

				break;
			default:
				System.out.println("None of them,Wrong input");
				break;
			}
			System.out.println("Do you want to continue with this Calculator (Y/N) ?");
			flag = sc.next();
		} while (flag.equalsIgnoreCase("Y"));
		System.out.println("Thanks, Have a nice Day!!!");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hello User, Enter your name :");
		String name = sc.nextLine();
		System.out.println("Welcome : " + name + "!");

		System.out.println("Please select type of Calculator :- ");
		System.out.println("1. Normal");
		System.out.println("2. Scientific");
		int typeOfCalc = sc.nextInt();
		if (typeOfCalc == 1) {
			Clacs.standard();
		} else if (typeOfCalc == 2) {
			Clacs.scientific();
		} else {
			System.out.println("None of them,Wrong input");
		}

	}

}
