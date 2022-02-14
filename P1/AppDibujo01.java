import java.util.*;
public class AppDibujo01{

	public static void main(String args[]){
		Cuadrado cuadrado1 = new Cuadrado(200,200,300);
		Dibujo dibujo1 = new Dibujo();
		Util util1 = new Util();

		ArrayList<ArrayList<Integer>> ListaTotal = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> cuad1 = new ArrayList<Integer>();
		ArrayList<Integer> cuad2 = new ArrayList<Integer>();
		ArrayList<Integer> cuad3 = new ArrayList<Integer>();

		cuad1.add(200);
		cuad1.add(300);
		cuad1.add(100);
		ListaTotal.add(cuad1);
		cuad2.add(100);
		cuad2.add(200);
		cuad2.add(50);
		ListaTotal.add(cuad2);
		cuad3.add(400);
		cuad3.add(400);
		cuad3.add(120);
		ListaTotal.add(cuad3);
		

		for (int i = 0;i < 3;i++){
			
			cuadrado1.setX(ListaTotal.get(i).get(0));
			cuadrado1.setY(ListaTotal.get(i).get(1));
			cuadrado1.setLado(ListaTotal.get(i).get(2));
			dibujo1.pintar(cuadrado1);
			//Se ha cambiado el timepo para hacer animacion
			util1.wait(100);
		}
	}

}