public class App{

	public static void main(String args[]){
		Agenda agenda = new Agenda();
		Persona p1 = new Persona("Juan Vecino");
		boolean sigue = true;
		System.out.println("JU");
		while(sigue)
		{
			System.out.println("Menu:\n\n1. Crear persona\n2.Buscar Persona\n3.Modificar Persona\n4.Eliminar Persona\n5.Listar Persona");
			Leer leer = new Leer();
			String valor = leer.porTeclado();
		}
		
	}	
}