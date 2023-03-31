package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public abstract class Strategy {

	public ListaEnlazadaGenerica<Integer> numerosPares(ArbolBinario<Integer> a) {
		ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		
		this.mode(l, a);
		
		return l;
	}
	
	public abstract void mode(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> a);
}
