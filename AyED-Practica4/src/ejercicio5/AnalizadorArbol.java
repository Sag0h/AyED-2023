package ejercicio5;

import tp04.ejercicio1.*;
import pilaycola.ColaGenerica;

public class AnalizadorArbol {

	
	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol) {
		
		if(!arbol.esVacio()) {
			
			int maxProm = 0;
			ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
			cola.encolar(arbol);
			cola.encolar(null);
			int sum = 0;
			int cantNodos = 0;
			while(!cola.esVacia()) {
				ArbolGeneral<AreaEmpresa> aux = cola.desencolar();
				if(aux != null) {
					sum += aux.getDato().getDelay();
					cantNodos++;
					if(aux.tieneHijos()) {
						for(int i=1; i<=aux.getHijos().tamanio(); i++) {
							cola.encolar(aux.getHijos().elemento(i));
						}
					}
				}else if(!cola.esVacia()) {
					cola.encolar(null);
					if( (sum/cantNodos) >= maxProm) {
						maxProm = (sum/cantNodos);
					}
					sum = 0;
					cantNodos = 0;
				}
			}
			
			return maxProm;
		}
		return 0;
	}
	
}
