import java.awt.*;
import javax.swing.JFrame;

public class Lienzo extends Canvas
{
	Figura figuras [] = new Figura[20];

	public void addFigura(Figura c)
	{
		for(int i=0;i<figuras.length;i++)
		{
			if(figuras[i]==null){
				figuras[i]=c;
				i = figuras.length;
			}
		}

	}

	public void paint(Graphics g)
	{	
		for(Figura figura:figuras)
		{
			if(figura!=null)
			{	
				figura.pintar(g);
			}
			
		}
	}

}