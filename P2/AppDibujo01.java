public class AppDibujo01{

	public static void main(String args[]){
		Dibujo dibujo1 = new Dibujo();
		
		Cuadrado.setRelleno(false);
		dibujo1.pintar(new Cuadrado(000,200,50));
		dibujo1.pintar(new Cuadrado(100,200,50));
		dibujo1.pintar(new Cuadrado(200,200,50));
		dibujo1.pintar(new Cuadrado(300,200,50));
		dibujo1.pintar(new Cuadrado(400,200,50));
		dibujo1.pintar(new Cuadrado(500,200,50));
		dibujo1.pintar(new Cuadrado(600,200,50));
		dibujo1.pintar(new Cuadrado(700,200,50));
		/*
		Forma pasando una cadena
		Cuadrado cuadrados[]= new Cuadrado[5];
		cuadrados[0]= new Cuadrado(200,200,50);
		cuadrados[1]= new Cuadrado(260,200,50);
		cuadrados[2]= new Cuadrado(320,200,50);
		cuadrados[3]= new Cuadrado(380,200,50);
		cuadrados[4]= new Cuadrado(440,200,50);
		dibujo1.pintar(cuadrados);
		*/
	}

}