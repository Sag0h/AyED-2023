package pilaycola;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica<T> {
	private ListaEnlazadaGenerica<T> lista;

	
	public ColaGenerica(){
		this.lista = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar(T dato) {
		lista.agregarFinal(dato);
	}
	
	public T desencolar() {
		T elem = lista.elemento(1);
		lista.eliminarEn(1);
		return elem;
	}
	
	public T tope() {
		return lista.elemento(lista.tamanio());
	}
	
	public boolean esVacia() {
		return lista.esVacia();
	}

}
