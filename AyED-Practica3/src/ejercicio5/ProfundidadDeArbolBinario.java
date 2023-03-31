package ejercicio5;

import pilaycola.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> a;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.a = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		int sum = 0;
		int pAct = 0;
		if(!a.esVacio()) {
			ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
			cola.encolar(a);
			cola.encolar(null);
			while(!cola.esVacia()) {
				ArbolBinario<Integer> act = cola.desencolar();
				if(act != null) {
					if(p == pAct) {
						sum += act.getDato();
					}
					if(act.tieneHijoIzquierdo()) {
						cola.encolar(act.getHijoIzquierdo());
					}
					if(act.tieneHijoDerecho()) {
						cola.encolar(act.getHijoDerecho());
					}
				}else {
					if(!cola.esVacia()) cola.encolar(null);
					pAct++;
				}
			}
			
		}
		
		return sum;
	}
	
}
