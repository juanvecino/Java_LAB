package pintar.ui;
import javax.swing.JFrame;

import pintar.domain.Figura;
import pintar.domain.Lienzo;

/** 
	Facilita la representación gráfica de objetos creados por el alumno
	mediante una ventana gráfica y un lienzo 
*/
public class Dibujo extends JFrame
{
	private Lienzo lienzo;

	public Dibujo()
	{
		super("Dibujo");
		lienzo = new Lienzo();
		lienzo.setSize(800,600);
		this.add(lienzo);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/** 
		Pinta el cuadrado recibido por el App y actualiza el lienzo (canvas) 
		@param figura cuadrado a pintar
	*/
	public void pintar(Figura figura)
	{
		lienzo.addFigura(figura);
		lienzo.repaint();
	}

}