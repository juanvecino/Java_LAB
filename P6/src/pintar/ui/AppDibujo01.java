package pintar.ui;
import java.awt.Color;

import pintar.domain.*;

public class AppDibujo01{

	public static void main(String args[]){
		Dibujo dibujo1= new Dibujo();
		
		dibujo1.pintar(new Circulo(150,100,200,Color.BLUE,true));
		dibujo1.pintar(new Cuadrado(450,100,200,Color.RED,true));
		dibujo1.pintar(new Circulo(450,350,200,Color.GREEN,true));
		dibujo1.pintar(new Cuadrado(150,350,200,Color.ORANGE,false));
		dibujo1.pintar(new Triangulo(100,100,100,Color.BLACK,true));
	}
}