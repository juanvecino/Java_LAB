public class ProtegidaAcuaticas extends Protegida{

	//Atributos
	int numlagos;

	ProtegidaAcuaticas(int km, int numAnimales, String nombre,int subbencion, String ong, int numlagos)
	{
		super(km,numAnimales,nombre,subbencion,ong);
		this.numlagos=numlagos;
	}

	String getInfo(){
		return "Tipo ProtegidaAcuaticas "+super.getInfo() + " Numlagos: " + numlagos;
	}
}