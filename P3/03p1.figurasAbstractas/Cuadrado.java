import java.awt.Color;

public class Cuadrado extends Figura{

	//Atributos
	int lado;
	Color color;
	boolean relleno;

	Cuadrado(int x, int y, int lado,Color color, boolean relleno){
		super(x,y);
		this.lado= lado;
		this.color = color;
		this.relleno = relleno;
	}
	public String getInfo(){
		return super.getInfo() + "\tLado:"+lado + "\tColor: " + color + "\tFill: " + relleno;
	}

}