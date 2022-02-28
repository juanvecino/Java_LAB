package pintar.domain;
import java.awt.Color;
import java.awt.*;

public class Circulo extends Figura{

	//Atributos
	int radio;
	Color color;
	boolean relleno;


	public Circulo(int x, int y, int radio, Color color, boolean relleno)
	{
		super(x,y);
		this.radio=radio;
		this.color = color;
		this.relleno= relleno;
	}

	public String getInfo(){
		return super.getInfo() + "\tRadius: " + radio + "\tColor: " + color + "\tFill: " + relleno;
	}

	int getRadio(){
		return radio;
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
			g.fillOval(x,y,radio,radio);
		}
		else
		{
			g.drawOval(x,y,radio,radio);
		}
	}

}