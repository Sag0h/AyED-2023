package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	private ArbolBinario<Integer> a;
	private Strategy strat;
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		this.a = a;
		strat = new InOrden();
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		return strat.numerosPares(a);
	}

	public void useInOrdenMode() {
		this.strat = new InOrden();
	}
	
	public void usePostOrdenMode() {
		this.strat = new PostOrden();
	}
	
}
