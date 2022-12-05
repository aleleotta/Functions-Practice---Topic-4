package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String operator; //Variable made specifically for switch cases.
		Scanner sc = new Scanner(System.in);
		Operations calculator = new Operations(); //New Operations object called calculator is created.
		System.out.print("Introduce first number: ");
		calculator.a = sc.nextInt();
		System.out.print("Introduce second number: ");
		calculator.b = sc.nextInt();
		System.out.print("Select operator: "); //User can choose which function to use.
		operator = sc.next();
		switch(operator) { //Switch block begins.
		case "+":
			System.out.println(calculator.a + " + " + calculator.b + " = " + calculator.sum()); //Sum operation gets executed and then printed.
			break;
		case "-":
			System.out.println(calculator.a + " - " + calculator.b + " = " + calculator.sub()); //Subtraction operation gets executed and then printed.
			break;
		case "*":
			System.out.println(calculator.a + " * " + calculator.b + " = " + calculator.mult()); //Multiplication operation gets executed and then printed.
			break;
		case "/":
			System.out.println(calculator.a + " / " + calculator.b + " = " + calculator.div()); //Division operation gets executed and then printed.
			break;
		default:
			System.out.println("ERROR!"); //Error message
		}
		System.out.println("Have a nice day!");
		sc.close();
	}
}
