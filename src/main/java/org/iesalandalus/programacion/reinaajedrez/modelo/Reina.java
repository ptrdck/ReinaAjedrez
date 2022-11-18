package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	
	

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
}
	

