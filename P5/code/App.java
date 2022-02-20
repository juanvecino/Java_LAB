import java.util.Random;

class App
{
  

  public static void main(String args[])
  {
    Random r = new Random();
    Concurso concurso = new Concurso();
    //Concursantes con Pareja
    ConcursanteConPareja ccp1 = new ConcursanteConPareja(Concursante.Sexo.MASCULINO, "Juan", 24,"2015-06-28", false);
    ConcursanteConPareja ccp2 = new ConcursanteConPareja(Concursante.Sexo.FEMENINO, "Lucía", 25, false, ccp1, ConcursanteConPareja.TipoRelacion.NATURAL);
    ConcursanteConPareja ccp3 = new ConcursanteConPareja(Concursante.Sexo.MASCULINO, "Pedro", 25, "2022-01-05", false);
    ConcursanteConPareja ccp4 = new ConcursanteConPareja(Concursante.Sexo.FEMENINO, "Paula", 25, false, ccp3, ConcursanteConPareja.TipoRelacion.NATURAL);
    ConcursanteConPareja ccp5 = new ConcursanteConPareja(Concursante.Sexo.MASCULINO, "Alberto", 25, "2021-06-10", true);
    ConcursanteConPareja ccp6 = new ConcursanteConPareja(Concursante.Sexo.FEMENINO, "Elisa", 25, true, ccp5, ConcursanteConPareja.TipoRelacion.CONCURSO);
    ConcursanteConPareja ccp7 = new ConcursanteConPareja(Concursante.Sexo.MASCULINO, "Alejandro", 25, "2020-01-20", false);
    ConcursanteConPareja ccp8 = new ConcursanteConPareja(Concursante.Sexo.FEMENINO, "Cristina", 25, false, ccp7, ConcursanteConPareja.TipoRelacion.OTRO);
    ConcursanteConPareja ccp9 = new ConcursanteConPareja(Concursante.Sexo.MASCULINO, "Jaime", 25, "2020-05-13", false);
    ConcursanteConPareja ccp10 = new ConcursanteConPareja(Concursante.Sexo.FEMENINO, "Sofía", 25, false, ccp9, ConcursanteConPareja.TipoRelacion.OTRO);
    
    //Concursantes Solteros
    ConcursanteSoltero cs1 = new ConcursanteSoltero(Concursante.Sexo.MASCULINO, "Vinsenso", 26);
    ConcursanteSoltero cs2 = new ConcursanteSoltero(Concursante.Sexo.FEMENINO, "Stephany", 20);
    ConcursanteSoltero cs3 = new ConcursanteSoltero(Concursante.Sexo.MASCULINO, "Simone", 25);
    ConcursanteSoltero cs4 = new ConcursanteSoltero(Concursante.Sexo.FEMENINO, "Stassy", 19);
    ConcursanteSoltero cs5 = new ConcursanteSoltero(Concursante.Sexo.MASCULINO, "Miguel", 24);
    ConcursanteSoltero cs6 = new ConcursanteSoltero(Concursante.Sexo.FEMENINO, "María", 22);
    ConcursanteSoltero cs7 = new ConcursanteSoltero(Concursante.Sexo.MASCULINO, "Vicente", 29);
    ConcursanteSoltero cs8 = new ConcursanteSoltero(Concursante.Sexo.FEMENINO, "Palita", 25);
    ConcursanteSoltero cs9 = new ConcursanteSoltero(Concursante.Sexo.MASCULINO, "Fernando", 21);
    ConcursanteSoltero cs10 = new ConcursanteSoltero(Concursante.Sexo.FEMENINO, "Bea", 23);
   
    concurso.addConcursante(ccp1);
    concurso.addConcursante(ccp2);
    concurso.addConcursante(ccp3);
    concurso.addConcursante(ccp4);
    concurso.addConcursante(ccp5);
    concurso.addConcursante(ccp6);
    concurso.addConcursante(ccp7);
    concurso.addConcursante(ccp8);
    concurso.addConcursante(ccp9);
    concurso.addConcursante(ccp10);
    concurso.addConcursante(cs1);
    concurso.addConcursante(cs2);
    concurso.addConcursante(cs3);
    concurso.addConcursante(cs4);
    concurso.addConcursante(cs5);
    concurso.addConcursante(cs6);
    concurso.addConcursante(cs7);
    concurso.addConcursante(cs8);
    concurso.addConcursante(cs9);
    concurso.addConcursante(cs10);

    System.out.println(concurso.toString());
    
    /*System.out.println("Mostrando sólo parejas para mostrar un ejemplo de DOWNCASTING");
    for (Concursante concursante : concursantes)
      if (concursante != null && concursante instanceof ConcursanteConPareja){
        ConcursanteConPareja ccp = (ConcursanteConPareja) concursante;
        System.out.println(ccp.getNombre() +"-"+ ccp.getPareja().getNombre());
      }
    */
  

    for(int dia=1; dia<30; dia++){
      System.out.println("DIA "+dia+":");
      if(dia%7 == 0){
        concurso.hoguera();
      }
      for(Concursante concursante_ : concurso.getConcursantes()){
        if(concursante_ instanceof ConcursanteSoltero concursante){
          concurso.tentacion((int)r.nextGaussian()*15000+30000, concursante.getHombre());
        }
      }

    }
    System.out.println(concurso.toString());
  }

  


}
