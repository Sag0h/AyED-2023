package ejercicio1;

import listas.*;

public class Ejercicio1_5 {

	public static void printList(ListaDeEnteros l, int aux) {
		if(aux < l.tamanio()) {
			printList(l, ++aux);
			System.out.println(l.elemento(aux));
		}
	}
	
	public static void main(String[] args) {
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		for(String a:args) {
			l.agregarFinal(Integer.parseInt(a));
		}
		
		printList(l, 0);
	}

}
