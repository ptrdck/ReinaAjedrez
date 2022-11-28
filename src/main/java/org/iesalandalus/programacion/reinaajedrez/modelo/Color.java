package org.iesalandalus.programacion.reinaajedrez.modelo;


// Creación de clase tipo ENUM para escoger el color de REINA
public enum Color {
	
	//inicializamos las variables con la string correspondiente.
	
	BLANCO("Blanco"),
	NEGRO("Negro");
	
	//declaración de variable local
	private String cadenaAMostrar;
	
	//Método para mostrar el color de cadena
	private Color(String cadenaAMostrar)
	{
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	
	//método toString para retornar cadena
	@Override
	public String toString()
	{
		return cadenaAMostrar;
	}

}
