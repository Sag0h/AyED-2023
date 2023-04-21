package ejercicio4;

import tp04.ejercicio1.*;
import tp02.ejercicio2.*;

public class Test {
	
	public static void main(String[] args) {
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(1);
		ListaGenerica<ArbolGeneral<Integer>> l2 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
		l2.agregarFinal(a5);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
		a6.agregarHijo(new ArbolGeneral<Integer>(8));
		a5.agregarHijo(a6);
		a5.agregarHijo(new ArbolGeneral<Integer>(7));
		
		l2.agregarFinal(new ArbolGeneral<Integer>(9));
		a.agregarHijo(new ArbolGeneral<Integer>(2,l2));
		a.agregarHijo(new ArbolGeneral<Integer>(3));
		
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a10 = new ArbolGeneral<Integer>(10);
		a10.agregarHijo(new ArbolGeneral<Integer>(12));
		a10.agregarHijo(new ArbolGeneral<Integer>(13));
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(11);
		a11.agregarHijo(new ArbolGeneral<Integer>(14));
		a4.agregarHijo(a10);
		a4.agregarHijo(a11);
		
		a.agregarHijo(a4);

		System.out.println("Altura del arbol: " + a.altura());
	
		System.out.println("Nivel del dato '4': "+ a.nivel(4));
		System.out.println("Nivel del dato '14': "+ a.nivel(14));
		System.out.println("Nivel del dato '41': "+ a.nivel(41));
		System.out.println("Ancho del arbol: "+ a.ancho());
		
		if(a.esAncestro(4, 12)) {
			System.out.println("4 es ancestro de 12"); // true
		}
		
		if(a.esAncestro(8, 3)) { 
			System.out.println("8 es ancestro de 3"); // false
		}
		
		if(a.esAncestro(1, 12)) {
			System.out.println("1 es ancestro de 12"); // true
		}
		
		if(a.esAncestro(1, 1)) {
			System.out.println("1 es ancestro de 1"); // false
		}
		
		if(a.esAncestro(2, 9)) {
			System.out.println("2 es ancestro de 9"); // true
		}
	}
	
}
