package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int option, n;
		Scanner sc = new Scanner(System.in);
		Numbers obj1 = new Numbers();
		System.out.print("Introduce a number: ");
		n = sc.nextInt();
		System.out.println("Options:\n1) Check if the following number is prime.\n2) Check if the following number has the same number on both first and last digit.");
		System.out.print("Choose an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Prime?\n" + obj1.prime(n));
			break;
		case 2:
			System.out.println("Even on both digits?\n" + obj1.capicua(n));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
}
