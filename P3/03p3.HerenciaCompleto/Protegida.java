abstract class Protegida extends Parque{


	//Atributos
	int subbencion;
	String ong;

	Protegida(int km, int numAnimales, String nombre,int subbencion, String ong)
	{
		super(km,numAnimales,nombre);
		this.ong = ong;
		this.subbencion = subbencion;
	}

	String getInfo()
	{
		return super.getInfo() + " ONG: " + ong + " Subbencion: " + subbencion;
	}

}