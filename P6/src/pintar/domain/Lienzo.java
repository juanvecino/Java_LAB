package pintar.domain;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Lienzo extends Canvas
{
	private Collection<Figura> figuras;

	public Lienzo()
	{
		figuras = new ArrayList<Figura>();
	}

	public void addFigura(Figura c)
	{
		figuras.add(c);
	}

	public void paint(Graphics g)
	{	
		for(Figura figura:figuras)
			figura.pintar(g);
		//Posible Opcion2 2
		/*
		Iterator<Figura> it = figuras.iterator();
			while(it.hasNext())
				it.next().pintar(g);
		*/
	}

}