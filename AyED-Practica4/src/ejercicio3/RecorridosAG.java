package ejercicio3;

import tp02.ejercicio2.ListaGenerica;
import pilaycola.*;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		
		numerosImparesMayoresQuePreorden(l, a, n);
		
		return l;
	}
	
	private void numerosImparesMayoresQuePreorden (ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		if(!a.esVacio()) {
			int dato = a.getDato();
			if((dato % 2 == 0) && (dato > n)) {
				l.agregarFinal(dato);
			}
			if(a.tieneHijos()) {
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQuePreorden (l, a.getHijos().elemento(i), n);
				}
			}
		}
	}
	
	public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden(l,a,n);
		return l;
	}
	
	private void numerosImparesMayoresQueInOrden(ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		if(!a.esVacio()) {
			int dato = a.getDato();
			if(a.tieneHijos()) {
				numerosImparesMayoresQueInOrden(l, a.getHijos().elemento(1), n);
				if((dato % 2 == 0) && (dato > n)) {
					l.agregarFinal(dato);
				}
				for(int i=2; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQueInOrden(l, a.getHijos().elemento(i), n);
				}
			}else {
				if((dato % 2 == 0) && (dato > n)) {
					l.agregarFinal(dato);
				}
			}
		}
	}
	
	public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden(l,a,n);
		return l;
	}
	
	private void numerosImparesMayoresQuePostOrden(ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		if(!a.esVacio()) {
			int dato = a.getDato();
			if(a.tieneHijos()) {
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQuePostOrden(l, a.getHijos().elemento(i), n);
				}
			}
			if((dato % 2 == 0) && (dato > n)) {
				l.agregarFinal(dato);
			}
		}
	}
	
	
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		
		if(!a.esVacio()) {
			ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
			cola.encolar(a);
			cola.encolar(null);
			
			while(!cola.esVacia()) {
				ArbolGeneral<Integer> aux = cola.desencolar();
				if(aux != null) {
					if((aux.getDato() > n)&&(aux.getDato() % 2 == 0)) {
						l.agregarFinal(aux.getDato());
					}
					if(aux.tieneHijos()) {
						for(int i=1; i<=aux.getHijos().tamanio(); i++) {
							cola.encolar(aux.getHijos().elemento(i));
						}
					}
				}else if(!cola.esVacia()) {
					
					cola.encolar(null);
				}
			}
			
		}
		
		
		return l;
	}
	
}
