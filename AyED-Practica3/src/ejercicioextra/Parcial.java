package ejercicioextra;

import tp03.ejercicio1.ArbolBinario;

public class Parcial {

	private ArbolBinario<Integer> a;
	
	public Parcial(ArbolBinario<Integer> a) {
		this.a = a;
	}
	
	public boolean esMonodistante(int k) {
		int val = esMonodistante(a);
		if(a.esVacio()) {
			return false;
		}
			
		return val != -1 && val == k;
	}
	
	private int esMonodistante(ArbolBinario<Integer> ab) {
		int valI = -1;
		int valD = -1;
		if(ab.esHoja()) {
			return ab.getDato();
		}else {
			if(ab.tieneHijoIzquierdo()) {
				valI = esMonodistante(ab.getHijoIzquierdo());
				if(valI == -1) {
					return -1;
				}
				valI += ab.getDato();
			}
			if(ab.tieneHijoDerecho()) {
				valD = esMonodistante(ab.getHijoDerecho());
				if(valD == -1) {
					return -1;
				}
				valD += ab.getDato();
			}
			if(valI == -1) {
				return valD;	
			}
			if(valD == -1) {
				return valI;
			}
			if(valI == valD) {
				return valI;
			}				
		}
			
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(2);
		
		hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(5));
		
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(4);
		a2.agregarHijoIzquierdo(new ArbolBinario<Integer>(1));
		a2.agregarHijoDerecho(new ArbolBinario<Integer>(1));
		
		hi.agregarHijoDerecho(a2);
		
		
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>(1);
		a4.agregarHijoIzquierdo(new ArbolBinario<Integer>(3));
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(2);
		a5.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		hd.agregarHijoIzquierdo(a4);
		hd.agregarHijoDerecho(a5);
		
		arbol.agregarHijoIzquierdo(hi);
		arbol.agregarHijoDerecho(hd);
		Parcial p = new Parcial(arbol);
		
		System.out.println(p.esMonodistante(8));
	}
}
