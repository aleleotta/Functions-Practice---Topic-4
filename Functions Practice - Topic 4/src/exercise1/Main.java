package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int option, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number: ");
		n = sc.nextInt();
		System.out.println("Options: 1) Check if the following number is prime.\n2) Check if the following number has the same number on both first and last digit.");
		System.out.print("Choose an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
}
