package ejercicio5;

public class AreaEmpresa {
	
	private String id;
	private int delay;
	
	public AreaEmpresa(String id, int delay) {
		this.id = id;
		this.delay = delay;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	
}
