package pintar.domain;
import java.awt.Color;
import java.awt.*;

public class Triangulo extends Figura{

	//Atributos
	int lado;
	Color color;
	boolean relleno;

	public Triangulo(int x, int y, int lado,Color color, boolean relleno){
		super(x,y);
		this.lado= lado;
		this.color = color;
		this.relleno = relleno;
	}

	public String getInfo(){
		return super.getInfo() + "\tLado:"+lado + "\tColor: " + color + "\tFill: " + relleno;
	}

	int getLado(){
		return lado;
	}

	Color getColor(){
		return color;
	}

	boolean getRelleno(){
		return relleno;
	}

	void pintar(Graphics g)
	{
		int[] xs = {x,x+lado,x};
		int[] ys = {y,y,y+lado};
		g.setColor(color);
		if(relleno){
			g.fillPolygon(xs,ys,xs.length);
		}
		else
		{
			g.drawPolygon(xs,ys,xs.length);
		}
	}

}