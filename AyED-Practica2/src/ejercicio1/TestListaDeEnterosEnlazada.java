package ejercicio1;

import listas.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		for(String a:args) {
			l.agregarFinal(Integer.parseInt(a));
		}
		for(int i=1; i<=l.tamanio(); i++) {
			System.out.println(l.elemento(i));
		}
	}
	
}
