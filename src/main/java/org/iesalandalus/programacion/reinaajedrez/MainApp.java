package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	// declaración de atributo de clase
	private static Reina reina;
	
	public static void main(String[] args) {
		
		Consola.mostrarMenu();
		System.out.println("");
		ejecutarOpcion(Consola.elegirOpcionMenu());
		System.out.println("");
		
	}
	
	// método ejecutarOpcion para definir lo que hará en función del entero que se ingrese por teclado
	private static void ejecutarOpcion(int opcion)
	{
		//Opciones del menú principal
		switch (opcion)
		{
		// Caso elegir Reina por defecto
		//Crea una Reina Blanca con su posición correspondiente
		//Pasos a seguir según se crea la Reina, su movimiento y capturas de errores
		case 1:
		{
			try 
			{
				
				crearReinaDefecto();
				mostrarReina();
				Consola.mostrarMenuDirecciones();;
				mover();
				mostrarReina();
				System.out.println("");
				
			}
			catch(Exception e){
				
				mover();
				System.out.println(e.getMessage());
				System.out.println("");
				
			}
			finally 
			{
				
				Consola.mostrarMenu();
				mostrarReina();
				ejecutarOpcion(Consola.elegirOpcionMenu());
				System.out.println("");
				
			}
		break;	
		}
		
		// Caso 2 para crear una Reina escogiendo un parámetro del Enum Color. 
		// Crea Reina según parámetro para asignar posición correspondiente a su color
		// Análogo al caso 1, se siguen los mismos pasos a excepción del primer método. 
		// Captura de errores
		case 2:
		{
			try 
			{
				
				crearReinaColor();
				mostrarReina();
				Consola.mostrarMenuDirecciones();
				mover();
				mostrarReina();
				System.out.println("");
				
			}
			catch(Exception e)
			{
				mover();
				System.out.println(e.getMessage());
				System.out.println("");
			}
			finally
			{
				Consola.mostrarMenu();;
				mostrarReina();
				ejecutarOpcion(Consola.elegirOpcionMenu());
				System.out.println("");
			}
			break;
		}
		
		// Caso 3 para mover Reina. Esta opción se activará sólo si se comprueba que Reina ya existe
		// En este caso y luego de mostrar Reina, ingresa directamente al menú de direcciones.
		// captura de excepciones. 
		case 3:
		{
			try 
			{
				mostrarReina();
				Consola.mostrarMenuDirecciones();
				mover();
				mostrarReina();
				System.out.println("");
			}
			catch(Exception e)
			{
				mover();
				System.out.println(e.getMessage());
				System.out.println("");
			}
			finally 
			{
				Consola.mostrarMenu();
				mostrarReina();
				ejecutarOpcion(Consola.elegirOpcionMenu());
				System.out.println("");
				
			}
			
			break;
		}
		
		// Creación de Salida de la aplicación. 
		case 4:
		{
			Consola.despedirse();
			break;
		}
		}
	}
	
	// Método que crea una Reina según el constructor por defecto en Reina
	//Color blanco y consecuentemente con su posición correspondiente
	private static void crearReinaDefecto()
	{
		reina = new Reina();
		System.out.println("");
	}
	
	// Método para crear una Reina eligiendo el color, osea, ingresando por parámetro el color. 
	private static void crearReinaColor()
	{
		reina = new Reina(Consola.elegirOpcion());
		System.out.println("");
	}
	
	// Método para mover la Reina
	// Muestra por pantalla la dirección que queremos seguir y los pasos que queremos avanzar 
	// Captura de excepciones
	private static void mover()
	{
		try 
		{
			reina.mover(Consola.elegirDireccion(),Consola.elegirPasos());
			mostrarReina();
			System.out.println("");
			
		} 
		catch (OperationNotSupportedException | NullPointerException e)
		{
			System.out.print(e.getMessage());
			System.out.println("");
		}
		finally 
		{
			
			Consola.mostrarMenuDirecciones();
			try 
			{
				reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
				System.out.println("");
			} 
			catch	(OperationNotSupportedException | NullPointerException e) 
			{
				System.out.print(e.getMessage());
				System.out.println("");
			}
			mostrarReina();
		}
		
			
			
	}
	
	// Método para mostrar la posición de la reina. En caso de no ser nula, imprimirá un mensaje.
	private static void mostrarReina()
	{
		if (reina != null) {
			
			System.out.println(reina.toString() );
			
		}else
		{
			System.out.println("La REINA no está en juego o aún no ha sido creada");
		}
	}
	
}
