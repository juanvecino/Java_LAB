package pintar.domain;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Lienzo extends Canvas
{
	
	ArrayList<Figura> figuras = new ArrayList<Figura>();

	public void addFigura(Figura c)
	{
		figuras.add(c);
	}

	public void paint(Graphics g)
	{	
		Iterator<Figura> it = figuras.iterator();
        while(it.hasNext()){
            it.next().pintar(g);
        }
	}

}