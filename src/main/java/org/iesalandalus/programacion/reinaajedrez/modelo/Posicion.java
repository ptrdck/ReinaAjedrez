package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	
	
	//declaración de variables a usar para obtener la posición de REINA
	private int fila;
	private char columna;
	
	
	// Constructor de objeto tipo Posición.
	public Posicion(int fila, char columna)
	{
		setFila(fila);
		setColumna(columna);
		
	}
	
	// COnstructor copia
	public Posicion(Posicion posicion)
	{
		//instrucción para invalidar una posición en caso de que sea nula
		if (posicion == null) 
		{
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
			
		}
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
	}
	
	//Método set para insertar una fila y evaluar si es válida
	private void setFila(int fila) 
	{
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
		
	}
	
	//método get para obtener la fila
	public int getFila() 
	{
		return fila;
	}
	
	// método para insertar y validar una columna 
	private void setColumna(char columna) 
	{
		if (columna<'a' || columna>'h')
		{
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

	//Obtener columna
	public char getColumna() 
	{
		return columna;
	}

	// métodos hash y equals
	@Override
	public int hashCode() 
	{
		return Objects.hash(fila, columna);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return fila == other.fila && columna == other.columna;
	}

	// método toString para imprimir en pantalla la posición. 
	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
	
	

	
	
}
