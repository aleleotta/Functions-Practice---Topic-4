package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		double radius;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = Sphere surface\n2 = Sphere volume");
		System.out.print("Select an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Introduce a radius: ");
			radius = sc.nextDouble();
			System.out.println("Result: " + Sphere.surface(radius));
			break;
		case 2:
			System.out.print("Introduce a radius: ");
			radius = sc.nextDouble();
			System.out.println("Result: " + Sphere.volume(radius));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
}
