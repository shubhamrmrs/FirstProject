package calc;

import java.util.Scanner;

public class Calculator {
	private static String flag;
	int a;
	int b;
	int c;
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.println("Hi, Please enter your name");
	String z= x.next();
		System.out.println("Hi,Welcome "+z+" please selcet any one..\n1.Simple calc\n2.Scientific calc");
	int	c= x.nextInt();
	
	
	if(c==1){
		String flag="N";
		do{ 
		System.out.println("welcome to simple calc: \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		int e=x.nextInt();
		System.out.println("enter first no.");
		double f=x.nextDouble();
		System.out.println("enter 2nd no.");
		double g=x.nextDouble();
	switch (e){
	
	case 1:System.out.println("addition is "+(f+g));
	break;
	case 2: System.out.println("substraction is "+(f-g));
	break;
	case 3: System.out.println("multiplication is "+(f*g));
	break;
	case 4: System.out.println("division is "+(f/g));
	break;
	default: System.out.println("wrong input");
	break;
	}
	System.out.println("do you want to continue(Y/N)");
	 flag=x.next();
	}
	while(flag.equalsIgnoreCase("Y"));
		System.out.println("Thanks, Have a nice Day!!!");}
	
	else if (c==2){
		String flag="N";
		do {
		System.out.println("welcome to scientific calc: \n1.Modulus \n2.Power \n3.Square root");
		int e=x.nextInt();
		
		switch (e){
		case 1: {System.out.println("enter first no.");
		double f=x.nextDouble();
		System.out.println("enter 2nd no.");
		double g=x.nextDouble();
		System.out.println("modulus is "+ (f%g));}
		break;
		case 2:System.out.println("enter base no.");
		double g=x.nextDouble();
		System.out.println("enter power");
		double h=x.nextDouble();
		System.out.println("power is "+(Math.pow(g, h)));
		break;
		case 3:System.out.println("enter a no.");
		double i=x.nextDouble();
		System.out.println("square root is "+(Math.sqrt(i)));
		break;
		default: System.out.println("wrong input");
		break;
		}System.out.println("do you want to continue(Y/N)");	
		 flag=x.next();
		}
		while (flag.equalsIgnoreCase("Y"));
		System.out.println("Thanks, Have a nice Day!!!");}
	
	else {
		System.out.println("Wrong input, Thankyou "+z+" for using calc!");
	}
	}
	}

