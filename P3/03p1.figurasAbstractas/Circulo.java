import java.awt.Color;

public class Circulo extends Figura{

	//Atributos
	int radio;
	Color color;
	boolean relleno;


	Circulo(int x, int y, int radio, Color color, boolean relleno)
	{
		super(x,y);
		this.radio=radio;
		this.color = color;
		this.relleno= relleno;
	}

	public String getInfo(){
		return super.getInfo() + "\tRadius: " + radio + "\tColor: " + color + "\tFill: " + relleno;
	}
}