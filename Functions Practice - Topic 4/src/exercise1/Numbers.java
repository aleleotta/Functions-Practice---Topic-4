package exercise1;

public class Numbers {
	boolean prime(int n) {
		boolean prime = false;
		if (n % 2 == 1) {
			prime = true;
		}
		return prime;
	}
	
	boolean capicua(int n) {
		int aux = 0, inverse, digits;
		boolean capicua = false;
		while (aux != 0){
            n = aux;
			digits = aux % 10;
			inverse = inverse * 10 + digits;
            aux = aux / 10;
            if (n == inverse) {
            	capicua = true;
            }
        }
		return capicua;
	}
}
/*Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:
boolean esPrimo(int numero): Esta función devuelve true si el número introducido por parámetro es primo y false en caso contrario.
boolean esCapicua(int numero): Esta función devuelve true si el número introducido es capicúa y false en caso contrario.
*/