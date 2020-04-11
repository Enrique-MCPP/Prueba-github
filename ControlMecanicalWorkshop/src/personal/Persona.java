package personal;

public class Persona {
	protected String nombre, puesto;
	protected int edad;
	public Persona(String nombre, String puesto, int edad) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
