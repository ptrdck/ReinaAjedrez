package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private Consola()
	{
		
	}
	
	public static void mostrarMenu() 
	{
		
		System.out.println("Menú REINA DE AJEDREZ");
		System.out.println("::::::::::::::::::::::");
		System.out.println("1.- Crear REINA por defecto");
		System.out.println("2.- Crear REINA eligiendo el color");
		System.out.println("3.- Mover REINA");
		System.out.println("4.- Salir");
		
	}
	
	public static int elegirOpcionMenu() 
	{
		int opcion;
		boolean mal = false;
		
		do 
		{
			System.out.println("Elija una opción del menú");
			opcion = Entrada.entero();
			
			if (opcion>4 || opcion<1)
			{
				System.out.println("La opción ingresada no es válida");
				mal = true;
			}
		}while (mal == true);
		
		return opcion;
	}
	
	public static Color elegirOpcion() 
	{
		
		int eligecolor;
		boolean malcolor = false;
		
		do
		{

			System.out.println("Elija un color para la REINA");
			System.out.println(":::::::::::::::::::::::::::::::");
			System.out.println("1.- Blanco");
			System.out.println("2.- Negro");
			
			eligecolor = Entrada.entero();
			
			if (eligecolor>2 || eligecolor<1)
			{
				System.out.println("Opción no válida, intente nuevamente");
				malcolor = true;
			}
			
		}while (malcolor == true);
		
		if (eligecolor == 1)
		{
			return Color.BLANCO;
		}
		else 
		{
			return Color.NEGRO;
		}
		
	}
	
	public static void mostrarMenuDirecciones() 
	{
		System.out.println("Elija una dirección para mover la REINA");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("1.- Norte ");
		System.out.println("2.- Noreste ");
		System.out.println("3.- Este ");
		System.out.println("4.- Sureste ");
		System.out.println("5.- Sur ");
		System.out.println("6.- Suroeste ");
		System.out.println("7.- Oeste ");
		System.out.println("8.- Noroeste ");
	}

}
