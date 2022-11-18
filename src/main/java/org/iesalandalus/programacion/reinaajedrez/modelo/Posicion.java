package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	
	private int fila;
	private char columna;
	
	
	public Posicion(int fila, char columna)
	{
		setFila(fila);
		setColumna(columna);
		
	}
	
	public Posicion(Posicion posicion)
	{
		if (posicion == null) 
		{
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
			
		}
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
	}
	
	private void setFila(int fila) 
	{
		if (fila<1 && fila>8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
		
	}
	
	public int getFila() 
	{
		return fila;
	}
	
	private void setColumna(char columna) 
	{
		if (columna<'a' && columna>'h')
		{
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

	public char getColumna() 
	{
		return columna;
	}
	

	
	
}
