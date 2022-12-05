package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int option, a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option: ");
		option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.print("Introduce the quantity of digits to print: ");
			a = sc.nextInt();
			System.out.println(RandomNumbers.randomNumbers(a));
			break;
		case 2:
			System.out.print("Introduce the quantity of digits to print: ");
			b = sc.nextInt();
			System.out.print("Introduce the maximum value: ");
			c = sc.nextInt();
			System.out.println(RandomNumbers.randomNumbers(b, c));
			break;
		case 3:
			System.out.print("Introduce the quantity of digits to print: ");
			d = sc.nextInt();
			System.out.print("Introduce the minimum value: ");
			e = sc.nextInt();
			System.out.print("Introduce the maximum value: ");
			f = sc.nextInt();
			System.out.println(RandomNumbers.randomNumbers(d , e, f));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
}
