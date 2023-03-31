package ejercicio1;

import listas.ListaDeEnterosEnlazada;

public class Ejercicio1_6 {

	private void calcularSucesionRec(int n, ListaDeEnterosEnlazada l) {
		int aux;
		if(n != 1) {
			if(n%2 == 0) {
				aux = n/2;
			}else {
				aux = 3*n+1;
			}
			this.calcularSucesionRec(aux, l);
		}
		l.agregarInicio(n);
	}
	
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		
		calcularSucesionRec(n, l);
		
		return l;
	}
	
	public static void main(String[] args) {
		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = f. calcularSucesion(6);
		
		for(int i=1; i<=l.tamanio(); i++) {
			if(i<l.tamanio())
				System.out.print(l.elemento(i) + " - " );
			else System.out.print(l.elemento(i) + ".");
		}
		
	}
	
}
