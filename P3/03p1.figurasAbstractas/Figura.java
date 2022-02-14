abstract class Figura{
	int x,y;


	Figura(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String getInfo()
	{
		return "X: " + this.x + "\tY: " + this.y;
	}
}