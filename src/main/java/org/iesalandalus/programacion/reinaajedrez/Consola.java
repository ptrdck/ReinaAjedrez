package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	
	// Constructor para métodos sin atributos.
	private Consola()
	{
		
	}
	
	// Creación de método mostrarMenu para imprimir en pantalla las opciones de la aplicación. 
	public static void mostrarMenu() 
	{
		
		System.out.println("Menú REINA DE AJEDREZ");
		System.out.println("::::::::::::::::::::::");
		System.out.println("1.- Crear REINA por defecto");
		System.out.println("2.- Crear REINA eligiendo el color");
		System.out.println("3.- Mover REINA");
		System.out.println("4.- Salir");
		
	}
	
	// método para elegir una opción del menú a través de un do-while para asegurar la correcta entrada por teclado
	public static int elegirOpcionMenu() 
	{
		//inicialización de variables locales de entero y un booleano para verificar confición
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
			} else
				
				mal = false;
			
		}while (mal == true);
		
		return opcion;
	}
	
	// método para elegir color de REINA
	public static Color elegirOpcion() 
	{
		//inicialización de variables de tipo entero, booleano y de Color
		int eligecolor;
		boolean malcolor = false;
		Color elegiropcion;
		
		//ciclo do-while para verificar la validez de la entrada por teclado. 
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
			} else
				
				malcolor=false;
			
		}while (malcolor == true);
		
		if (eligecolor == 1)
		{
			elegiropcion = Color.BLANCO;
		}
		else
		{
			elegiropcion = Color.NEGRO;
		}
		return elegiropcion;
	}
	
	//Método que imprime por pantalla las posibles direcciones en que se moverá la REINA
	public static void mostrarMenuDirecciones() 
	{
		System.out.println("Menú de direcciones de movimiento de la REINA");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("1.- Norte ");
		System.out.println("2.- Noreste ");
		System.out.println("3.- Este ");
		System.out.println("4.- Sureste ");
		System.out.println("5.- Sur ");
		System.out.println("6.- Suroeste ");
		System.out.println("7.- Oeste ");
		System.out.println("8.- Noroeste ");
	}
	
	// método que pedirá por teclado la dirección en que se moverá la Reina
	public static Direccion elegirDireccion()
	{
		//iniciacilización de variables locales. Un entero para ingresar la opción
		//y un booleano para la verificación de la entrada mediante un ciclo do-while
		int eligedireccion;
	
		System.out.println("Elija una dirección para mover la REINA");
		eligedireccion = Entrada.entero();
	
		
		// establece la dirección en que se moverá la reina según la correspondencia con el menú de direcciones. 
		if (eligedireccion == 1)
		{
			return Direccion.NORTE;
		}
		else if (eligedireccion == 2)
		
		{
			return Direccion.NORESTE;
		}
		else if (eligedireccion == 3)
		{
			return Direccion.ESTE;
		}
		else if (eligedireccion == 4)
		{
			return Direccion.SURESTE;
		}
		else if (eligedireccion == 5)
		{
			return Direccion.SUR;
		}
		else if (eligedireccion == 6)
		{
			return Direccion.SUROESTE;
		}
		else if (eligedireccion == 7)
		{
			return Direccion.OESTE;
		}
		else if (eligedireccion == 8)
		{
			return Direccion.NOROESTE;
		}
		else 
			return Direccion.valueOf(null);
	}
	
	// método para ingresar el número de pasos que se moverá la Reina.
	public static int elegirPasos()
	{
		int eligepasos;
		
		System.out.println("Elija un número de pasos que desea mover la REINA");
			
		eligepasos = Entrada.entero();
			
		return eligepasos;
	}
	
	
	// método para despedirse a través de un mensaje impreso por pantalla. 
	public static void despedirse()
	{
		System.out.println("¡¡¡Hasta pronto!!!");
	}

}
