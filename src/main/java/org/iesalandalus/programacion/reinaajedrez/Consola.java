package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;

public class Consola {
	
	private Consola()
	{
		
	}
	
	public static void mostrarMenu() {
		
		System.out.println("Menú REINA DE AJEDREZ");
		System.out.println("::::::::::::::::::::::");
		System.out.println("1.- Crear REINA por defecto");
		System.out.println("2.- Crear REINA eligiendo el color");
		System.out.println("3.- Mover REINA");
		System.out.println("4.- Salir");
		
	}

}
