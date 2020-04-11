package util;

import java.util.Scanner;

public class Menu {
	private int opc;
	private Scanner keyboard = new Scanner(System.in);

	public int menu () {
			System.out.println("*******Personal Taller*****");
			System.out.println("1_ Listado de personal Mecannico.");
			System.out.println("2_ Listado de Personal Administrativo.");
			System.out.println("3_ Buscar Personal Mécanico por Puesto.");
			System.out.println("4_ Buscar Personal Administrativo por idiomas.");
			System.out.println("5_ Añadir Personal Administrativo.");
			System.out.println("6_ Añadir Personal Mécanico.");
			System.out.println("7_ Salir");
			System.out.println("Ingrese una opción: "); 
			opc = keyboard.nextInt();
			keyboard.nextLine();
		return opc;
	}

}
