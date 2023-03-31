package ejercicio2;

public class Profesor extends Persona {
	private String catedra;
	private String facultad;
	
	public Profesor(String nombre, String apellido, String email, String facultad, String catedra) {
		super(nombre, apellido, email);
		// TODO Auto-generated constructor stub
		this.catedra = catedra;
		this.facultad = facultad;
	}


	private String getCatedra() {
		// TODO Auto-generated method stub
		return this.catedra;
	}

	private String getFacultad() {
		// TODO Auto-generated method stub
		return this.facultad;
	}

	protected String getDatosSubclase() {
		// TODO Auto-generated method stub
		return " facultad: " + this.getFacultad() + " catedra: " + this.getCatedra();
	}
}
