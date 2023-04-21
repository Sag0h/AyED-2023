package ejercicio7;

import tp04.ejercicio1.*;

public class RedDeAguaPotable {
	private ArbolGeneral<String> red;
	
	public RedDeAguaPotable(ArbolGeneral<String> red) {
		this.red = red;
	}
	
	public double minimoCaudal(double caudal) {
		if(!red.esVacio()) {
			double min = caudal;
			double act;
			if(red.tieneHijos()) {
				caudal /= red.getHijos().tamanio();
				for(int i=1; i<= red.getHijos().tamanio(); i++) {
					act = minimoCaudalRec(caudal, red.getHijos().elemento(i));
					if(act <= min) {
						min=act;
					}
				}
			}
			return min;
		}
		return caudal;
	}

	private double minimoCaudalRec(double caudal, ArbolGeneral<String> a) {
		if(!a.esVacio()) {
			double min = caudal;
			double act;
			if(a.tieneHijos()) {
				caudal /= a.getHijos().tamanio();
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					act = minimoCaudalRec(caudal, a.getHijos().elemento(i));
					if(act <= min) {
						min = act;
					}
				}
				return min;
			}
		}
		return caudal;
	}
	

}
