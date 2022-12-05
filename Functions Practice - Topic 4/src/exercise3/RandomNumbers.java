package exercise3;

import java.util.Scanner;

public class RandomNumbers {
	static int randomNumbers(int a){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= a ; i++) { //For cycle creates counter to interact with the input value and prints until the condition no longer applies.
			n = (int)(Math.random() * 2); //Randomization function executed.
			System.out.print(n + " "); //Print
		}
		sc.close();
		return n; //Stops printing
	}
	static int randomNumbers(int b, int c){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= b ; i++) { //For cycle creates counter to interact with the input value and prints until the condition no longer applies.
			n = (int)(Math.random() * c + 1); //Randomization function executed.
			System.out.print(n + " "); //Print
		}
		sc.close();
		return n; //Stops printing
	}
	static int randomNumbers(int d, int e, int f){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= d ; i++) { //For cycle creates counter to interact with the input value and prints until the condition no longer applies.
			n = (int)(Math.random() * (f - e + 1) + e); //Randomization function executed.
			System.out.print(n + " "); //Print
		}
		sc.close();
		return n; //Stops printing
	}
}
/*Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES,
 *añádelas a una única clase denominada NumerosAleatorios.
 *Las funciones de esta clase deben ser estáticas. Desde el método main(),
 *que estará definido en otra clase distinta, se pedirán los valores correspondientes
 *para probar estas funciones.
 */