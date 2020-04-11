package util;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import personal.Administrativo;


public class UtilesAdministrativos {
	private String name, post, languages;
	private int age;
	private Scanner keyboard = new Scanner(System.in);
	
	public void addAdministrative (Administrativo administrativeAdd, ArrayList<Administrativo> administrative) {
		char proceed = 's';
		while(proceed == 's' || proceed == 'S') {
			System.out.println("Escribe el nombre de la persona:");
			name = keyboard.nextLine();
			System.out.println("Escribe el puesto de la persona: ");
			post = keyboard.nextLine();
			System.out.println("Escribe la edad de la persona: ");
			try {
				age = keyboard.nextInt();
			}
			catch(Exception e) {
				System.out.println("No has escrito una edad.\Error"+e.getMessage());
			}
			keyboard.nextLine();
			System.out.println("Escribe el idioma de la persona: ");//�Como escribir m�s de un idioma?
			languages = keyboard.nextLine();
			administrativeAdd = new Administrativo(name, post, age, languages);
			administrative.add(administrativeAdd );
			System.out.println("\n");
			do {
				System.out.println("�Quieres continuar?s/n");
				proceed = keyboard.next().charAt(0);
			}
			while(proceed != 's' && proceed != 'S' && proceed != 'n'&& proceed != 'N');
			keyboard.nextLine();
		}
	}
	
	public void search (String languages, ArrayList<Administrativo> administrative) {
		boolean match = false;//Por si hay m�s de un t�o con el mismo idioma (algo l�gico)
		Iterator<Administrativo> it = administrative.iterator();
		boolean resultado;
		while(it.hasNext()) {
			Administrativo administrativeStaff = it.next();
			String SearchlanguagesUpperCaseSinTildes = Normalizer.normalize(languages.toUpperCase(), Normalizer.Form.NFD); //Paso el lenguage a buscar a may�sculas y quito acentos
			String FindlanguagesUpperCaseSinTildes = Normalizer.normalize(administrativeStaff.getLanguages().toUpperCase(), Normalizer.Form.NFD); //Paso el lenguage a encontrar a may�sculas y quito acentos
			resultado = FindlanguagesUpperCaseSinTildes.contains(SearchlanguagesUpperCaseSinTildes);
			if(resultado) {
				System.out.println("La persona que buscas est� en la lista");
				System.out.println("Nombre: "+administrativeStaff.getNombre());
				System.out.println("Puesto: "+administrativeStaff.getPuesto());
				System.out.println("Edad: "+administrativeStaff.getEdad());
				System.out.println("Idioma: "+administrativeStaff.getLanguages());
				System.out.println();
				match = true;
			}
		}
		if(match == false) {
			System.out.println("No hay personal con el idioma "+languages+" en la lista.");
			return;
		}
	}
		
	public void showList(ArrayList<Administrativo> administrative) {
		if(administrative.size() == 0) {
			System.out.println("La lista est� vac�a.\n");
		}else {
			System.out.println("Lista del personal administrativo: ");
			for(Administrativo a: administrative) {
				System.out.println("Nombre: "+a.getNombre());
				System.out.println("Puesto: "+a.getPuesto());
				System.out.println("Edad: "+a.getEdad());
				System.out.println("Idioma: "+a.getLanguages());
				System.out.println();
			}
		}
		
	}
	

	
	
}
		
		


