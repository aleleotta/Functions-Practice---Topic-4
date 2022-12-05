package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String operator;
		Scanner sc = new Scanner(System.in);
		Operations calculator = new Operations();
		System.out.print("Introduce first number: ");
		calculator.a = sc.nextInt();
		System.out.print("Introduce second number: ");
		calculator.b = sc.nextInt();
		System.out.print("Select operator: ");
		operator = sc.next();
		switch(operator) {
		case "+":
			System.out.println(calculator.a + " + " + calculator.b + " = " + calculator.sum());
			break;
		case "-":
			System.out.println(calculator.a + " - " + calculator.b + " = " + calculator.sub());
			break;
		case "*":
			System.out.println(calculator.a + " * " + calculator.b + " = " + calculator.mult());
			break;
		case "/":
			System.out.println(calculator.a + " / " + calculator.b + " = " + calculator.div());
			break;
		default:
			System.out.println("ERROR!");
		}
		System.out.println("Have a nice day!");
		sc.close();
	}
}
