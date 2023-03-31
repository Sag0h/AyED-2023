package practica1b;

import java.util.Scanner;

/* Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k} */

public class Ej2 {

	public static int[] getMultiplos(int n) {
		int[] array = new int[n];
			
		for(int i=0; i<n; i++) {
			array[i] = n*(i+1);
		}
		
		return array;
		
	}
	
	private static void printArray(int[] array, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		while(n != 0){
			Ej2.printArray(Ej2.getMultiplos(n), n);
			System.out.print("Ingrese un numero: ");
			n = scanner.nextInt();
			scanner.nextLine();
		}
	}
	
}
