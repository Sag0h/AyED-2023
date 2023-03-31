package practica1b.ejercicio5;


public class Ej5 {
	
	public static float[] getMaxMinProm(int[] array) {
		float[] res = new float[3];
		int max = array[0];
		int min = array[0];
		int sum = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}
		float prom = sum/array.length;
		
		res[0] = max;
		res[1] = min;
		res[2] = prom;
		
		return res;
	}
	
	
	public static void getMaxMinProm(int[] array, MaxMinProm res) {
		int max = array[0];
		int min = array[0];
		int sum = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}
		res.setPromedio(sum/array.length);
		res.setMax(max);
		res.setMin(min);
	}
	
	// EL C dice
	/* c.Devuelva lo pedido sin usar parámetros ni la sentencia "return". /*
	 * ni idea como se hace seguro con var global o algo de eso.
	 */
	
}

