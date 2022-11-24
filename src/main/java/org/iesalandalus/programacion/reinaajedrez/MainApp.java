package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) {
		
		Consola.mostrarMenu();
		ejecutarOpcion(Consola.elegirOpcionMenu());
		
	}
	
	
	private static void ejecutarOpcion(int opcion)
	{
		switch (opcion)
		{
		case 1:
		{
			try {
				
				crearReinaDefecto();
				
				mostrarReina();
				mover();
				mostrarReina();
				
			}catch(Exception e){
				
				System.out.println(e + "ERROR: Movimiento no válido (se sale del tablero).");
				
				
			}finally {
				Consola.despedirse();
			}
		break;	
		}
		case 2:
		{
			try {
				reina = new Reina(Consola.elegirOpcion());
				
				mostrarReina();
				mover();
				mostrarReina();
			}catch(Exception e)
			{
				System.out.println(e + "ERROR: Movimiento no válido (se sale del tablero).");
			}finally
			{
				Consola.despedirse();
			}
			break;
		}
		case 3:
		{
			mostrarReina();
			Consola.mostrarMenu();
			ejecutarOpcion(Consola.elegirOpcionMenu());
			
			break;
		}
		case 4:
		{
			Consola.despedirse();
			break;
		}
		}
	}
	
	private static void crearReinaDefecto()
	{
		reina = new Reina();
	}
	
	private static void crearReinaColor()
	{
		reina = new Reina();
	}
	
	private static void mover()
	{
		Consola.mostrarMenuDirecciones();
		try {
			reina.mover(Consola.elegirDireccion(),Consola.elegirPasos());
		}catch (OperationNotSupportedException e) {
			
			System.out.println("ERROR: Movimiento no válido (se sale del tablero).");
		}
		
			
			
	}
	
	private static void mostrarReina()
	{
		if (reina != null) {
			
			System.out.println("reina=" + reina + "]");
			
		}else
		{
			System.out.println("La REINA no está en juego o aún no ha sido creada");
		}
	}
	
}
