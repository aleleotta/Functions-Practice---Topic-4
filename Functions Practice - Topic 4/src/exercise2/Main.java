package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		double radius; //Variable that is needed to fill in the gap in whatever operation is needed.
		int option; //Choice for the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = Sphere surface\n2 = Sphere volume"); //Options that the user can choose.
		System.out.print("Select an option: "); //User choice
		option = sc.nextInt();
		switch (option) { //Switch block begins.
		case 1: //User chooses to calculate the surface.
			System.out.print("Introduce a radius: ");
			radius = sc.nextDouble();
			System.out.println("Result: " + Sphere.surface(radius)); //Surface function is executed and returned result is printed.
			break;
		case 2: //User chooses to calculate the volume.
			System.out.print("Introduce a radius: ");
			radius = sc.nextDouble();
			System.out.println("Result: " + Sphere.volume(radius)); //Volume function is executed and returned result is printed.
			break;
		default:
			System.out.println("ERROR!"); //Error message
		}
		sc.close();
	}
}
