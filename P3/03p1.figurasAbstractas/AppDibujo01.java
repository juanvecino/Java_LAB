import java.awt.Color;

public class AppDibujo01{

	public static void main(String args[]){

		Figura[] figuras = new Figura[10];
		figuras[0]= new Circulo(1,5,10,Color.YELLOW,true);
		figuras[1]= new Cuadrado(1,5,100,Color.RED,true);
		figuras[2]= new Circulo(100,200,150,Color.BLACK,false);
		figuras[3]= new Cuadrado(100,400,200,Color.ORANGE,false);

		for(Figura figura:figuras){
			if(figura != null)
				System.out.println(figura.getInfo());
		}
	}
}