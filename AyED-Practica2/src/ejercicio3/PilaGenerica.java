package ejercicio3;

import listas.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	private ListaEnlazadaGenerica<T> lista;
	
	public PilaGenerica(){
		this.lista = new ListaEnlazadaGenerica<T>();
	}
	
	public void apilar(T dato) {
		lista.agregarInicio(dato);
	}
	
	public T desapilar() {
		T elem = lista.elemento(1);
		lista.eliminarEn(1);
		return elem;
	}
	
	public T tope() {
		return lista.elemento(1);
	}
	
	public boolean esVacia() {
		return lista.esVacia();
	}
}
