public class Caza extends Parque{


	//Atributos
	int coste;
	String arma;

	Caza(int km, int numAnimales, String nombre,int coste, String arma)
	{
		super(km,numAnimales,nombre);
		this.coste=coste;
		this.arma=arma;
	}

	String getInfo()
	{
		return "Tipo Caza "+super.getInfo() + " Cost: " + coste + " Arma: " + arma;
	}

}