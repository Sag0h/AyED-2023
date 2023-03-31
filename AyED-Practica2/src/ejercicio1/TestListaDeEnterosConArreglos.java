package ejercicio1;

import listas.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {

	
	public static void main(String[] args) {
		
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		for(String a:args) {
			l.agregarFinal(Integer.parseInt(a));
		}
		for(int i=1; i<=l.tamanio(); i++) {
			System.out.println(l.elemento(i));
		}
	
	}
	
}
