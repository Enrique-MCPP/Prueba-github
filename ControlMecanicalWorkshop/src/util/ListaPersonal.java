package util;

import java.util.ArrayList;
import java.util.Scanner;

import personal.*;


public class ListaPersonal {
	private ArrayList<Mecanico> mechanic;
	private ArrayList<Administrativo> administrative;
	private UtilesMecanico mechanicStaff;
	private UtilesAdministrativos administrativeStaff;
	
	private Mecanico mechanicAdd;
	private Administrativo administrativeAdd;
	
	private Menu menu;
	private Scanner keyboard = new Scanner(System.in);
	private String post;
	private String languages; 
	private boolean continuar = true;
	
	public ListaPersonal() {
		mechanic = new ArrayList<>();
		administrative = new ArrayList<>();
		mechanicStaff = new UtilesMecanico();
		administrativeStaff = new UtilesAdministrativos();
		//¿Por qué no hace falta nicializar los objetos que voy a enviar? (administrativeAdd y mechanicAdd)
		menu = new Menu();
	}
	
	public void menuCall() {
		while(continuar) {
			System.out.println("\n");
			int opc = menu.menu();
			System.out.println("\n");
			switch(opc){
				case 1:{
					mechanicStaff.showList(mechanic);
					break;
				}
				case 2:{
					administrativeStaff.showList(administrative);	
					break;
				}
				case 3:{
					if(mechanic.size() == 0) {
						System.out.println("La lista está vacía");
						break;
					}else {
						System.out.println("Escribe el puesto de la persona que quieres buscar: ");
						post = keyboard.nextLine();
						mechanicStaff.search(post,mechanic);
					}
					break;
				}
				case 4:{
					if(administrative.size() == 0) {
						System.out.println("La lista está vacía");
						break;
					}else {
						System.out.println("Escribe los idiomas de la persona que quieres buscar: ");
						languages = keyboard.nextLine();
						if(languages.length() >= 4 ) {
							administrativeStaff.search(languages,administrative);	
						}else {
							System.out.println("Escribe un idioma de mínimo 4 letras.");
							break;
						}
						
					}
					break;
				}
				case 5:{
					administrativeStaff.addAdministrative(administrativeAdd,administrative);
					break;
				}
				case 6:{
					mechanicStaff.addMechanic(mechanicAdd,mechanic);
					break;
				}
						
				case 7:{
					System.out.println("¡Hasta pronto!");
					return;
				}
				default:{
					System.out.println("Elige una opción de la 1 a la 7");
					break;
				}
			}
			
		}
	}
}
