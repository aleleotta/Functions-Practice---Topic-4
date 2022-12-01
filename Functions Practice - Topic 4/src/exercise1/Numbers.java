package exercise1;

public class Numbers {
	boolean prime(int n) {
		boolean prime = false;
		if (n % 2 == 1) {
			prime = true;
		}
		return prime;
	}
}
/*Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:
boolean esPrimo(int numero): Esta función devuelve true si el número introducido por parámetro es primo y false en caso contrario.
boolean esCapicua(int numero): Esta función devuelve true si el número introducido es capicúa y false en caso contrario.
*/