package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class PostOrden extends Strategy {

	@Override
	public void mode(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			if(a.tieneHijoIzquierdo()) {
				mode(l, a.getHijoIzquierdo());
			}
			}
			if(a.tieneHijoDerecho()) {
				mode(l, a.getHijoDerecho());
			}
			if(a.getDato() % 2 == 0) {
				l.agregarFinal(a.getDato());
		}
	
	}
}
