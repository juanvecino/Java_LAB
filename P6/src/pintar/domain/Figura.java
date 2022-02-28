package pintar.domain;
import java.awt.*;

public abstract class Figura{
	int x,y;


	Figura(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String getInfo()
	{
		return "X: " + this.x + "\tY: " + this.y;
	}

	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	abstract void pintar(Graphics g);

}