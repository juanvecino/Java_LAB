package pintar.domain;
import java.awt.Color;
import java.awt.*;

public class Cuadrado extends Figura{

	//Atributos
	int lado;
	Color color;
	boolean relleno;

	public Cuadrado(int x, int y, int lado,Color color, boolean relleno){
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
		g.setColor(color);
		if(relleno){
			g.fillRect(x,y,lado,lado);
		}
		else
		{
			g.drawRect(x,y,lado,lado);
		}
	}


} 