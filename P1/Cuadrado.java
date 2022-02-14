public class Cuadrado {
	
	//Atributos
	int x,y,lado;

	Cuadrado(int x, int y, int lado){
		this.setX(x);
		this.setY(y);
		this.setLado(lado);
	}
	String getInfo(){
		return "X:"+ x+"\n"+"Y:"+y+"\n"+"Lado:"+lado;
	}

	void setX(int x){
		this.x = x;
	}
	void setY(int y){
		this.y = y;
	}
	void setLado(int lado){
		this.lado = lado;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	int getLado(){
		return lado;
	}

	void moverCuadrado(int x , int y){
		this.x += x;
		this.y += y;
	}

}