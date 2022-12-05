package exercise2;

public class Sphere {
	static double surface(double radius) {
		double surface = 4 * radius * 2;
		return surface;
	}
	
	static double volume(double radius) {
		double volume = (4/3) * radius * 2;
		return volume;
	}
}
/*Crea una clase de nombre Esfera. Esta clase debe contener dos funciones estáticas que harán lo siguiente:
La primera de las funciones calculará la superficie de la esfera, devolviendo el valor de la superficie, que tiene esta fórmula:
Superficie = 4*radio2
La segunda de las funciones calculará el volumen de la esfera, devolviendo el valor del volumen, que tiene la siguiente fórmula:
Volumen=(4/3)*radio3
Define radio como una variable global estática de la clase Esfera.
*/