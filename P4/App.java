public class App{
	public static void main(String args[]){
		int value = 0;
		do{
			value = App.main("Agenda");
			OpcionAgenda pregunta = OpcionAgenda.values()[value];
			App.evaluar(pregunta);
		}while(OpcionAgenda.values()[value] != OpcionAgenda.SALIR);
	}
	
	static int main(String Agenda){
		System.out.println(Agenda+":\n\n0. Crear persona\n1.Buscar Persona\n2.Modificar Persona\n3.Eliminar Persona\n4.Listar Personas\n5.Limpiar\n6.SALIR");
		int value = Integer.parseInt(Leer.porTeclado());
		if (value <0 || value> OpcionAgenda.values().length){
			System.out.println("Se ha pulsado una tecla incorrecta\nSaliendo...");
			return 6;
		}
		return value;
	}

	static void evaluar(OpcionAgenda x){

			switch(x)
			{
				case CREAR_PERSONA:
					{
					System.out.println("\nDime el nombre\tDNI\tEdad\tSexo");
					String nombre = Leer.porTeclado();
					String dni = Leer.porTeclado();
					int edad = Integer.parseInt(Leer.porTeclado());
					String sexo = Leer.porTeclado();
					Agenda.creacionPersona(new Persona(nombre,dni,edad,sexo));
					break;
					}

				case BUSCAR_PERSONA:
					{
						System.out.println("Que persona quieres buscar?(Poner solo DNI)");
						int i = Agenda.personaABuscar(new Persona(Leer.porTeclado()));
						if (i != -1){
							System.out.println("Persona encontrada");
						}
						else{
							System.out.println("Error");
						}
					break;
					}

				case MODIFIACR_PERSONA:
					{
						System.out.println("Que persona quieres modificar");
						String nombre_antiguo = Leer.porTeclado();
						String dni_antiguo = Leer.porTeclado();
						int edad_aniguo = Integer.parseInt(Leer.porTeclado());
						String sexo_antiguo = Leer.porTeclado();
						System.out.println("Nuevo nombre de la persona");
						String nombre_nuevo = Leer.porTeclado();
						Agenda.modificarPersona(new Persona(nombre_antiguo,dni_antiguo,edad_aniguo,sexo_antiguo),nombre_nuevo);
					break;
					}

				case ELIMINAR_PERSONA:
					{

						System.out.println("Que persona quieres eliminar");
						Agenda.eliminarPersona(new Persona(Leer.porTeclado(),Leer.porTeclado(),Integer.parseInt(Leer.porTeclado()),Leer.porTeclado()));
						break;
					}
				case LISTAR_PERSONA:
					{
					Agenda.listar_persona();	
					break;
					}
				case LIMPIAR_LISTA:
					{	
						Agenda.limpiar();
						break;
					}

			}
		}
}

