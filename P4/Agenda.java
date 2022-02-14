public class Agenda{
	static  Persona personas[] = new Persona[20];
	static int num_per = 0;
	static void creacionPersona(String nombre, String dni, int edad, String sexo){
							if(num_per < personas.length) {
								personas[num_per] = new Persona(nombre,dni,edad,sexo);
								num_per += 1 ;
							}
							else
							System.out.println("Esta llena");
			}

			static Integer personaABuscar(Persona personabucada){
				for(int i=0; i< personas.length; i++){
					if (personas[i] != null)
						if(personas[i].equals(personabucada))
							return i;
				}
				return -1;
			}

			static  void modificarPersona(Persona persona, String nuevoNombre){
				int i = personaABuscar(persona);
				if (i != -1){
					personas[i].setNombre(nuevoNombre);
				}
				else{
					System.out.println("Error esta persona no esta en la base");
				}
			}

			static  void eliminarPersona(Persona persona){
				int i = personaABuscar(persona);
				if (i != -1){
					for(int v = i; v<personas.length -1;v++){
						personas[v]= personas[v+1];
					}
					System.out.println("Persona eliminada");
				}
				else{
					System.out.println("Error esta persona no esta en la base");
				}
			}

			static void listar_persona(){
				for(Persona persona:personas){
							if(persona != null){
								System.out.println(persona.toString());
							}
						}
			}

			static void limpiar(){
				personas = new Persona[20];
			}
}