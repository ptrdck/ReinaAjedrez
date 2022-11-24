package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) {
		
		
	}
	
	/*
	private static void ejecutarOpcion(int opcion)
	{
		switch (opcion)
		{
		case 1:
		{
			crearReinaDefecto();
		}
		case 2:
		{
			reina = new Reina(Consola.elegirOpcion());
		}
		case 3:
		{
			
		}
		case 4:
		{
			
		}
		}
	}
	*/
	
	private static void crearReinaDefecto()
	{
		reina = new Reina();
	}
	
	private static void crearReinaColor()
	{
		reina = new Reina();
	}
	
	
}
