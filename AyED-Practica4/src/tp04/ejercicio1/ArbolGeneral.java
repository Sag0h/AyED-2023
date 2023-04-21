package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import pilaycola.*;


public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		if(!this.esVacio()) {
			if(this.tieneHijos()) {
				int count=1;
				int max = 0;
				int aux;
				for(int i = 1; i<=this.getHijos().tamanio(); i++) {
					aux = this.getHijos().elemento(i).altura();
					if(aux >= max) {
						max = aux;
					}
				}
				return count + max;
			}
		}		
		return 0;
	}

	public Integer nivel(T dato) {
		if(!this.esVacio()) {
			int nivel=0;
			ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
			cola.encolar(this);
			cola.encolar(null);
			while(!cola.esVacia()) {
				ArbolGeneral<T> aux = cola.desencolar();
				if(aux != null) {
					if(aux.getDato() == dato) {
						return nivel;
					}
					if(aux.tieneHijos()) {
						for(int i=1; i<=aux.getHijos().tamanio(); i++) {
							cola.encolar(aux.getHijos().elemento(i));
						}
					}
					
				}else if(!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
					
			}
		}
		return -1;
	}

	public Integer ancho() {
		if(!this.esVacio()) {
			int ancho = 1;
			int act = 0;
			ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
			cola.encolar(this);
			cola.encolar(null);
			while(!cola.esVacia()) { 
				ArbolGeneral<T> aux = cola.desencolar();
				if(aux != null) {
					if(aux.tieneHijos()) {
						for(int i=1; i<=aux.getHijos().tamanio(); i++) {
							cola.encolar(aux.getHijos().elemento(i));
							act++;
						}
					}
					
				}else if(!cola.esVacia()) {
					cola.encolar(null);
					if(act >= ancho) {
						ancho = act;
					}
					act = 0;
				}
			}
			return ancho;
		}
		return 0;
	}
	
	public boolean esAncestro(T a, T b) {
		
		if(!this.esVacio()) {
			if(this.tieneHijos()) {
				ArbolGeneral<T> arbolA = existe(this, a);
				if(arbolA != null) {
					return bEsDatoDescendienteDeA(arbolA, b);
				}
			}
		}
		return false;
	}

	private ArbolGeneral<T> existe(ArbolGeneral<T> arbol, T a){
		if(!arbol.esVacio()) {
			if(arbol.getDato() == a) {
				return arbol;
			}else {
				if(arbol.tieneHijos()) {
					for(int i=1; i<=arbol.getHijos().tamanio(); i++) {					
						ArbolGeneral<T> aux = existe(arbol.getHijos().elemento(i), a);			
						if(aux != null) {
							return aux;
						}
					}
				}
			}
		}
		return null;
	}
	
	private boolean bEsDatoDescendienteDeA(ArbolGeneral<T> arbol, T b) {
		if(!arbol.esVacio()) {
			if(arbol.tieneHijos()){
				for(int i=1; i<=arbol.getHijos().tamanio(); i++) {
					if((arbol.getHijos().elemento(i).getDato() == b)||((bEsDatoDescendienteDeA(arbol.getHijos().elemento(i), b)))) {
						return true;
					}		
				}
			}
		}
		return false;
	}
		
}
