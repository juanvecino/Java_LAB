import java.awt.Color;

public class AppDibujo02{

	public static void main(String args[]){
		Dibujo dibujo1= new Dibujo();

		Figura[] figuras = new Figura[10];
		for (int i = 0;i < 10; i++){

			figuras[i]= new Polygon(25*i,25*i,100,Color.BLACK,false);
		}
		for(Figura figura:figuras){
			if(figura != null)
				dibujo1.pintar(figura);
				Util.wait(10);
		}
	}
}