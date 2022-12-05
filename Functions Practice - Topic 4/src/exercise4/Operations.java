package exercise4;

public class Operations {
	int a, b;
	
	int sum() {
		int result = a + b;
		return result;
	}
	int sub() {
		int result = a - b;
		return result;
	}
	int mult() {
		int result = a * b;
		return result;
	}
	int div() {
		int result = a / b;
		return result;
	}
}
/*Crea una clase denominada Operaciones, la cual va a contener una función no estática
 *por cada una de las operaciones básicas:
 *suma, resta, multiplicación y división.
 *Es decir, 4 funciones. Las variables con las que se van a realizar estas operaciones
 *son globales no estáticas. Es decir, estas funciones no recibirán ningún parámetro de entrada.
 *Ten en cuenta las características de estas funciones y la existencia de las variables
 *globales para realizar las pruebas desde el método main().*/