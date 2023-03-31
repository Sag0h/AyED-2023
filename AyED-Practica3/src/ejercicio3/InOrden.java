package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class InOrden extends Strategy {

	public void mode(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> arbol){
		
		if(!arbol.esVacio()) {
			if(arbol.tieneHijoIzquierdo()) {
				mode(l, arbol.getHijoIzquierdo());
			}
			if(arbol.getDato() % 2 == 0) {
				l.agregarFinal(arbol.getDato());
			}
			if(arbol.tieneHijoDerecho()) {
				mode(l, arbol.getHijoDerecho());
			}
		}
	
	}
}
