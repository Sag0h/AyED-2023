package practica1b;
public class Ej1 {

	/* 1. Escriba tres métodos de clase (static) que reciban por parámetro dos números
enteros (tipo int) a y b e impriman todos los números enteros comprendidos entre a; b
(inclusive), uno por cada línea en la salida estándar. Para ello, dentro de una nueva clase
escriba un método por cada uno de los siguientes incisos:
a. Que realice lo pedido con un for.
b. Que realice lo pedido con un while.
c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do
while).
Por último, escriba en el método de clase main el llamado a cada uno de los métodos creados,
con valores de ejemplo.
En su computadora, ejecute el programa y verifique que se cumple con lo pedido.  */
	
	
	public static void printNumbersBetweenFor(int a, int b) {
		if (a > b){
			int aux = a;
			a = b;
			b = aux;
		}
		for(int i=a; i<=b; i++){
			System.out.println(i);
		}
	}
	
	public static void printNumbersBetweenWhile(int a, int b) {
		if (a > b){
			int aux = a;
			a = b;
			b = aux;
		}
		while(a <= b) {
			System.out.println(a++);
		}
	}
	
	public static void printNumbersBetween(int a, int b) {
		if(a != b) {
			if(a < b) {
				System.out.println(a);				
				Ej1.printNumbersBetween(++a, b);
			}
			else {
				Ej1.printNumbersBetween(a-1, b);
				System.out.println(a);	
			}
		}else
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		Ej1.printNumbersBetweenFor(1,6);
		Ej1.printNumbersBetweenWhile(9, 1);
		Ej1.printNumbersBetween(15, 5);
	}

}
