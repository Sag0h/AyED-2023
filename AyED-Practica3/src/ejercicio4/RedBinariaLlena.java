package ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
	
	public RedBinariaLlena(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	public int retardoReenvio() {
		return this.calcularRetardoMaximo(arbol);
	
	}
	
	private int calcularRetardoMaximo(ArbolBinario<Integer> a) {
		int ret = 0;
		if(!a.esVacio()) {
			ret += a.getDato();
			if(!a.esHoja()) {
				if(a.tieneHijoIzquierdo() && a.tieneHijoDerecho()) {
					ret += Math.max(this.calcularRetardoMaximo(a.getHijoIzquierdo()),this.calcularRetardoMaximo(a.getHijoDerecho()));
				}else {
					if(a.tieneHijoDerecho()) {
						ret += this.calcularRetardoMaximo(a.getHijoDerecho());
					}else {
						ret += this.calcularRetardoMaximo(a.getHijoIzquierdo());
					}
				}
			}	
	
		}
		return ret;
	}

}
