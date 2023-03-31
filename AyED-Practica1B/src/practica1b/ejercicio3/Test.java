package practica1b.ejercicio3;


public class Test {

	public static void main(String[] args) {
		
		Persona[] array = new Persona[5];
		
		for(int i=0; i<5; i++) {
			if(i<3) {
				array[i] = new Estudiante("nombre"+i, "apellido"+i, "email"+i, "dir"+i, "com"+i);
			}else {
				array[i] = new Profesor("nombre"+i, "apellido"+i, "email"+i, "facultad"+i, "catedra"+i);
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(array[i].tusDatos());
		}
		
	}
	
}
