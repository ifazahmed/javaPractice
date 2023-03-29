import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number ");
		float a = sc.nextFloat();
		
		System.out.println("PLease insert another number ");
		float b = sc.nextFloat();
		
		float addition = a + b;
		float subtraction = a - b;
		float multiplication = a * b;
		float division = a/b;
		
		System.out.println("The addition between the first number inserted and the second one is "+addition);
		System.out.println("The susbtraction between the first number inserted and the second one is "+subtraction);
		System.out.println("The multiplication between the first number inserted and the second one is "+multiplication);
		System.out.println("The division between the first number inserted and the second one is "+division);
		
	}
}