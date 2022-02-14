public class AppDibujo01{

	public static void main(String args[]){

		
		Parque[] parques =  new Parque[5];
		Caza c1 = new Caza(100, 5, "Lago Amapola",200000,"9mm");
		Caza c2 = new Caza(400, 2, "El pardo",10000,"25cal");
		ProtegidaAcuaticas pa1 = new ProtegidaAcuaticas(500,50,"Loot Lake",2500,"Caritas",10);
		ProtegidaTerrestre pt1= new ProtegidaTerrestre(200,20,"Terraland", 19600,"Entreculturas","Seco");
		ProtegidaOtros po1 = new ProtegidaOtros(100,2,"Otro Terraland",5000,"ONG de OTROS");

		parques[0]=c1;
		parques[1]=c2;
		parques[2]=pa1;
		parques[3]=pt1;
		parques[4]=po1;

		for(Parque parque:parques)
		{
			//System.out.println(parque.getInfo());
			System.out.println(parque.getNombre());
		}
	}
}