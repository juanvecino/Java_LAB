abstract class Parque{
	
	//Atributos
	int km,numAnimales;
	String nombre;

	Parque(int km, int numAnimales, String nombre)
	{
		this.km = km;
		this.numAnimales = numAnimales;
		this.nombre = nombre;
	}

	String getInfo(){
		return " Nombre: "+nombre+" Km: " + km + " Num Animales: " + numAnimales;
	}

	String getNombre(){
		return nombre;
	}
}