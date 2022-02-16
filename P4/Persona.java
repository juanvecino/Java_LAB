public class Persona{
	String nombre,dni,sexo;
	int edad;

	Persona(String nombre, String dni, int edad, String sexo)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
	}

	Persona(String dni){
		this.dni = dni;
	}

	public String getDNI(){
		return this.dni;
	}

	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	public String toString(){
		return "Nombre: " + nombre + "\tDNI: " + dni +"\tEdad: "+edad+"\tSexo: "+sexo;
	}
	public boolean equals(Object o){
		if(o instanceof Persona){
			Persona c = (Persona)o;
			if(dni.equals(c.getDNI()))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}