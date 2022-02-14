import java.awt.Color;

public class AppDibujo01{

	public static void main(String args[]){
		Dibujo dibujo1= new Dibujo();

		Figura[] figuras = new Figura[10];
		figuras[0] = new Circulo(150,100,200,Color.BLUE,true);
		figuras[1] = new Cuadrado(450,100,200,Color.RED,true);
		figuras[2] = new Circulo(450,350,200,Color.GREEN,true);
		figuras[3] = new Cuadrado(150,350,200,Color.ORANGE,false);
		figuras[4] = new Polygon(100,100,100,Color.BLACK,true);

		for(Figura figura:figuras){
			if(figura != null)
				dibujo1.pintar(figura);
		}
	}
}