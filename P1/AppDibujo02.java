import java.util.*;
public class AppDibujo02{
	
	static Cuadrado cuadrado1 = new Cuadrado(200,200,300);
	static Dibujo dibujo1 = new Dibujo();
	static Util util1 = new Util();

	public static void main(String args[]){
		//Pintarlo por primera vez
		dibujo1.pintar(cuadrado1);
		util1.wait(1);
		//Lo movemos
		int x2,y2;
		x2 = 150;
		y2 = 100;
		System.out.println(cuadrado1.getX());
		AppDibujo02.mover(x2,y2);
		util1.wait(100);
		
		cuadrado1.setX(100);
		cuadrado1.setY(100);
		dibujo1.pintar(cuadrado1);
		
		//Modificamos su tamaño
		cuadrado1.setLado(50);
		dibujo1.pintar(cuadrado1);
		util1.wait(100);
	}
	public static void mover(int x2, int y2){
			while (x2 != cuadrado1.getX() || y2 != cuadrado1.getY()){
			if (x2<cuadrado1.getX()){
				cuadrado1.moverCuadrado(-1,-1);
			}
			else if (x2>cuadrado1.getX()) {
			 	cuadrado1.moverCuadrado(1,1);
			} 
			else if (y2<cuadrado1.getY()){
			 	cuadrado1.moverCuadrado(0,-1);
			}
			else {
			 	cuadrado1.moverCuadrado(0,1);
			}
			 dibujo1.pintar(cuadrado1);
			 System.out.println("X:"+cuadrado1.getX()+"\tY:"+cuadrado1.getY());
			 util1.wait(1);
			}
		}


}