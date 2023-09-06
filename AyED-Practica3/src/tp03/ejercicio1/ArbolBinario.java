package tp03.ejercicio1;

import pilaycola.ColaGenerica;
import pilaycola.PilaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int hojas = 0;
		
		if(!this.esVacio()) {
			if(this.esHoja()) {
				return 1;
			}else {
				if(this.tieneHijoIzquierdo()) {
					hojas += this.getHijoIzquierdo().contarHojas();
				}
				if(this.tieneHijoDerecho()) {
					hojas += this.getHijoDerecho().contarHojas();
				}
			}
		}
		
		return hojas;
	}
	

    public ArbolBinario<T> espejo() {
		
    	if(!this.esVacio()) {
    		if(!this.esHoja());
    			if(this.tieneHijoDerecho()) {
    				this.getHijoDerecho().espejo();	
    			}
    			if(this.tieneHijoIzquierdo()) {
    				this.getHijoIzquierdo().espejo();
    			}
			ArbolBinario<T> aux = this.getHijoDerecho();
			this.agregarHijoDerecho(this.getHijoIzquierdo());
			this.agregarHijoIzquierdo(aux);

    		}
		return this;
	}

    /*public void porNiveles() {
encolar(raíz);
mientras (cola no se vacíe) {
desencolar(v);
imprimir (dato de v);
si (tiene hijo_izquierdo)
encolar(hijo_izquierdo);
si (tiene hijo_derecho)
encolar(hijo_derecho);
}
}*/

	public void entreNiveles(int n, int m){
		if(!this.esVacio()) {
			ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>(); 
			cola.encolar(this);
			cola.encolar(null);
			int nivel = 0;
			while(!cola.esVacia()) {
				ArbolBinario<T> a = cola.desencolar();
				if(a != null) {
					if(nivel >= n && nivel <= m) {
						System.out.print(a.getDato());
					}
					if(a.tieneHijoIzquierdo()) {
						cola.encolar(a.getHijoIzquierdo());
					}
					if(a.tieneHijoDerecho()) {
						cola.encolar(a.getHijoDerecho());
					}
				}else {
					System.out.print("\n");
					nivel++;
					if(!cola.esVacia()) {
						cola.encolar(null);
					}
				}
			}
			
			
		}
		
	}

	

}
