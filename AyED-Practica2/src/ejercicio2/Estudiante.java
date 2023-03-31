package ejercicio2;

public class Estudiante extends Persona {
	private String direccion;
	private String comision;
	
	
	
	public Estudiante(String nombre, String apellido, String email, String direccion, String comision) {
		super(nombre, apellido, email);
		this.direccion = direccion;
		this.comision = comision;
	}

	

	@Override
	protected String getDatosSubclase() {
		// TODO Auto-generated method stub
		return " direccion: "+ this.getDireccion() + " comision: "+ this.getComision();
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getComision() {
		return comision;
	}



	public void setComision(String comision) {
		this.comision = comision;
	}

}
