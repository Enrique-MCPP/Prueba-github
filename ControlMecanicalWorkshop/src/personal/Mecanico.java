package personal;

public class Mecanico extends Persona {
	private String field;
	public Mecanico(String nombre, String puesto, int edad, String field) {
		super(nombre, puesto, edad);//sirve para llamar al constructor de la clase padre
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	

}
