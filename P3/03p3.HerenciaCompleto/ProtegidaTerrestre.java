public class ProtegidaTerrestre extends Protegida{

	//Atributos
	String tipoterreno;

	ProtegidaTerrestre(int km, int numAnimales, String nombre,int subbencion, String ong, String tipoterreno)
	{
		super(km,numAnimales,nombre,subbencion,ong);
		this.tipoterreno=tipoterreno;
	}

	String getInfo(){
		return "Tipo ProtegidaTerrestre "+super.getInfo() + " Terreno: " + tipoterreno;
	}
}