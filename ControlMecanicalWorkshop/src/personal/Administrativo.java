package personal;

public class Administrativo extends Persona {
	private String languages;

	public Administrativo(String nombre, String puesto, int edad, String languages) {
		super(nombre, puesto, edad);
		this.languages = languages;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	

}
