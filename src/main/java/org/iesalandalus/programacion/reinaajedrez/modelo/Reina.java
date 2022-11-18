package org.iesalandalus.programacion.reinaajedrez.modelo;

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
}
	

