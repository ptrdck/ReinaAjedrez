package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	// Declaración de variables pertenecientes a los atributos que tendrá reina,
	//una reina tendrá un color y una posición que determine su comportamiento
	private Color color;
	private Posicion posicion;
	
	
	//Creación de constructor por defecto para reina en color blanco. 
	public Reina()
	{
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}
	
	//Creación de constructor con parámetro color que determinará la posición
	public Reina(Color color)
	{
		
		if (color == Color.BLANCO)
		{
			setColor(Color.BLANCO);
			setPosicion(new Posicion(1,'d'));
		}
		if (color == Color.NEGRO)
		{
			setColor(Color.NEGRO);
			setPosicion(new Posicion(8, 'b'));
		}
		
	}
	
	// método get para Color
	public Color getColor() 
	{
		return color;
	}
	
	// método set para color. Declaración de excepción de nulo
	private void setColor(Color color) 
	{
		if (color == null)
		{
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}
	
	// Método get para Posición
	public Posicion getPosicion() 
	{
		return posicion;
	}
	
	// método set Posición. 
	private void setPosicion(Posicion posicion) 
	{
	
		this.posicion = posicion;
	}
	
	// método mover con los posibles casos de movimiento. 
	public void mover(Direccion direccion, int pasos) throws IllegalArgumentException, OperationNotSupportedException
	{
		//excepción de nulo
		if (direccion == null)
		{
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		//excepción de ilegalidad de movimiento.
		if (pasos < 1 || pasos > 7)
		{
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		//inicialización y declaración de variables locales.
		int fila=0;
		char columna;
		
		// Sentencias para cada caso de movimiento
		switch (direccion) {
		case NORTE:
			fila = posicion.getFila() + pasos;
			if (fila > 8)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			columna = posicion.getColumna();
			posicion = new Posicion(fila, columna);
			
			break;
			
		case NORESTE:
			fila = posicion.getFila() + pasos;
			columna = (char) (posicion.getColumna() + pasos);
			
			if (columna > 'h' || fila>8)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case ESTE:
			fila = posicion.getFila();
			columna = (char) (posicion.getColumna() + pasos);
			if (columna > 'h')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case SURESTE:
			fila = posicion.getFila() - pasos;
			columna = (char) (posicion.getColumna() + pasos);
			if ( fila <1 || columna > 'h')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case SUR:
			fila = posicion.getFila() - pasos;
			if (fila < 1)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			columna = posicion.getColumna();
			posicion = new Posicion(fila, columna);
			
			break;
			
		case SUROESTE:
			fila = posicion.getFila() - pasos;
			columna = (char)(posicion.getColumna() - pasos);
			
			if (fila < 1 || columna <'a')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case OESTE:
			fila = posicion.getFila();
			columna = (char) (posicion.getColumna() - pasos);
			if (columna < 'a')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case NOROESTE:
			fila = posicion.getFila() + pasos;
			columna = (char)(posicion.getColumna() - pasos);
			if (fila > 8 || columna>'h')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			columna = (char) (posicion.getColumna() - pasos);
			if (columna < 'a')
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
				
		}
	}

	//Método toString para imprimir color y posición de reina
	@Override
	public String toString() {
		return "Reina [color=" + color + ", " + posicion + "]";
	}
	
}
	

