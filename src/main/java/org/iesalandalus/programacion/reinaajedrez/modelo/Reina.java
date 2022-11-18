package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	
	public Reina()
	{
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}
	
	public Reina(Color color)
	{
		if (color == Color.BLANCO)
		{
			setPosicion(new Posicion(1,'d'));
		}
		if (color == Color.NEGRO)
		{
			setPosicion(new Posicion(8, 'b'));
		}
		
	}

	public Color getColor() 
	{
		return color;
	}
	
	private void setColor(Color color) 
	{
		if (color == null)
		{
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}
	
	public Posicion getPosicion() 
	{
		return posicion;
	}
	
	private void setPosicion(Posicion posicion) 
	{
	
		this.posicion = posicion;
	}
	
	public void mover(Direccion direccion, int pasos) throws IllegalArgumentException, OperationNotSupportedException
	{
		if (direccion == null)
		{
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1 || pasos > 7)
		{
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		int fila=0;
		char columna;
		
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
			if (fila > 8)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

			columna = (char) (posicion.getColumna() + pasos);
			if (columna > 'h')
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
			if (fila < 1)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			columna = (char) (posicion.getColumna() + pasos);
			if (columna > 'h')
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
			if (fila < 1)
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
			
		case OESTE:
			fila = posicion.getFila();
			columna = (char) (posicion.getColumna() - pasos);
			if (fila < 1)
			{
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			posicion = new Posicion(fila, columna);
			
			break;
			
		case NOROESTE:
			fila = posicion.getFila() + pasos;
			if (fila > 8)
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

	@Override
	public String toString() {
		return "Reina [color=" + color + ", posicion=" + posicion + "]";
	}
	
}
	

