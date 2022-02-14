public class ProtegidaOtros extends Protegida{

	//Atributos

	ProtegidaOtros(int km, int numAnimales, String nombre,int subbencion, String ong)
	{
		super(km,numAnimales,nombre,subbencion,ong);
	}

	String getInfo(){
		return "Tipo ProtegidaOtros"+super.getInfo() + " Tipo: Otros ";
	}
}