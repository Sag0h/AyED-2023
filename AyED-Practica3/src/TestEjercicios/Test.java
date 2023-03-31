package TestEjercicios;

import ejercicio3.ContadorArbol;
import ejercicio4.RedBinariaLlena;
import ejercicio5.ProfundidadDeArbolBinario;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Test {

	public static void main(String[] args) {
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>(3);
		a1.agregarHijoIzquierdo(a2);
		a1.agregarHijoDerecho(a3);
		a2.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		a2.agregarHijoDerecho(new ArbolBinario<Integer>(5));
		a3.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
		
		System.out.println(a1.contarHojas());
		a1.entreNiveles(0, 10);
		a1.espejo().entreNiveles(0, 10);
		
		ContadorArbol ca = new ContadorArbol(a1);
		for(int j=0; j<2; j++) {
			if(j%2 == 0) {
				ca.useInOrdenMode();
			}else {
				ca.usePostOrdenMode();
			}
			ListaEnlazadaGenerica<Integer> l = ca.numerosPares();
			
			for(int i=1; i<=l.tamanio(); i++) {
				if(i<l.tamanio()) System.out.print(l.elemento(i) + "-");
				else {
					System.out.print(l.elemento(i)+".\n");
				}
			}
		}
		
		System.out.println("El retardo de reenvio de la red binaria formada con el arbol a1 es: " + new RedBinariaLlena(a1).retardoReenvio());
		
		a3.agregarHijoIzquierdo(new ArbolBinario<Integer>(7)); // porque el espejo que hice antes me cambio los nodos de lugar.
		
		a1.entreNiveles(0, 10);
		System.out.println("El retardo de reenvio de la red binaria formada con el arbol lleno a1 es: " + new RedBinariaLlena(a1).retardoReenvio());
	
		ProfundidadDeArbolBinario pdab = new ProfundidadDeArbolBinario(a1);
		System.out.println(pdab.sumaElementosProfundidad(1)+ "== 5");
		System.out.println(pdab.sumaElementosProfundidad(2)+ "== 22");
	}

}
