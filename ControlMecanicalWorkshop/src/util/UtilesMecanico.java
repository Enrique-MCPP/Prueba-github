package util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import personal.*;

public class UtilesMecanico {
	private String name, post, field;
	private int age;
	private Scanner keyboard = new Scanner(System.in);

	public void addMechanic (Mecanico mechanicAdd, ArrayList<Mecanico> mechanic) {
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
				System.out.println("No has escrito una edad.\nError: "+e.getMessage());
			}
			keyboard.nextLine();
			System.out.println("Escribe la especialidad de la persona: ");
			field = keyboard.nextLine();
			mechanicAdd = new Mecanico(name, post, age, field);
			mechanic.add(mechanicAdd );
			System.out.println("\n");
			do {
				System.out.println("¿Quieres continuar?s/n");
				proceed = keyboard.next().charAt(0);
			}
			while(proceed != 's' && proceed != 'S' && proceed != 'n'&& proceed != 'N');
			keyboard.nextLine();
		}
	}
	
	public void search (String post, ArrayList<Mecanico> mechanic) {
		boolean match = false;//Por si hay más de un tio con el mismo puesto (algo lógico)
		Iterator<Mecanico> it = mechanic.iterator();
		while(it.hasNext()) {
			Mecanico mechanicStaff = it.next();
			if(mechanicStaff.getPuesto().equalsIgnoreCase(post)) {
				System.out.println("La persona que buscas está en la lista");
				System.out.println("Nombre: "+mechanicStaff.getNombre());
				System.out.println("Puesto: "+mechanicStaff.getPuesto());
				System.out.println("Edad: "+mechanicStaff.getEdad());
				System.out.println("Especialidad: "+mechanicStaff.getField());
				System.out.println();
				match = true;
			}
		}
		if(match == false) {
			System.out.println("No hay personal con el puesto "+post+" en la lista.");
		}
	}
		
	public void showList(ArrayList<Mecanico> mechanic) {
		if(mechanic.size() == 0) {
			System.out.println("La lista está vacía\n");
		}else {
			System.out.println("Lista del personal mecánico: ");
			for(Mecanico m: mechanic) {
				System.out.println("Nombre: "+m.getNombre());
				System.out.println("Puesto: "+m.getPuesto());
				System.out.println("Edad: "+m.getEdad());
				System.out.println("Especialidad: "+m.getField());
				System.out.println();
				
			}
		}
	}	
}
