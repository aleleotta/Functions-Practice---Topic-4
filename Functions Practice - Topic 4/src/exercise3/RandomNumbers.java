package exercise3;

import java.util.Scanner;

public class RandomNumbers {
	static int randomNumbers(int a){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= a ; i++) {
			n = (int)(Math.random() * 2);
			System.out.print(n + " ");
		}
		sc.close();
		return n;
	}
	static int randomNumbers(int b, int c){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= b ; i++) {
			n = (int)(Math.random() * c + 1);
			System.out.print(n + " ");
		}
		sc.close();
		return n;
	}
	static int randomNumbers(int d, int e, int f){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= d ; i++) {
			n = (int)(Math.random() * (f - e + 1) + e);
			System.out.print(n + " ");
		}
		sc.close();
		return n;
	}
}
