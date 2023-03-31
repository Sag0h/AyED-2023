package ejercicio2;

import listas.ListaEnlazadaGenerica;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		ListaEnlazadaGenerica<Persona> l = new ListaEnlazadaGenerica<Persona>();
		
		for(int i=1; i<=4; i++) {
			l.agregarEn(new Estudiante("nombre"+i, "apellido"+i, "email"+i, "dir"+i, "com"+i), i);
		}
		
		for(int i=1; i<=4; i++) {
			System.out.println(l.elemento(i).tusDatos());
		}	
		
	}

}
