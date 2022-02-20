import java.util.Random;

public class Concurso{ 
  private Concursante[] concursantes = new Concursante[30];
  private int numConcursantes = 0;
  private Random r = new Random();
    
  public void addPareja(ConcursanteConPareja c1, ConcursanteConPareja c2){
    this.addConcursante(c1);
    this.addConcursante(c2);
    c1.setPareja(c2);
  }
  
  public void addConcursante(Concursante c)
  {
    concursantes[numConcursantes] = c;
    numConcursantes +=1;
  }
  
  public void addRelacion(ConcursanteSoltero cSoltero, Concursante c){
    cSoltero.addRelacion(c);
  }
  
  public int buscarConcursante(Concursante c){
    int i = 0;
    while(i < concursantes.length)
    {
      //if(concursantes[i].getNombre().equals(c.getNombre())) ESTO ESTO SE HACIA CUANDO TODAVÍA NO HABÍAMOS EXPLICADO EL EQUALS
      if(concursantes[i].equals(c))
        return i;
      
      i += 1;
    }    
    return -1;
  }
  public boolean eliminarConcursante(Concursante c){
    int pos = this.buscarConcursante(c);
    if(pos == -1)
      return false;
    else{
      concursantes[pos] = null;
      for(int i = pos; i < concursantes.length-1; i++){
        concursantes[i] = concursantes[i+1]; 
      }      
      
      
      return true;
    }
  }

  public void hoguera(){
    ConcursanteSoltero[] concursantesSolterosHombres = new ConcursanteSoltero[10];
    ConcursanteSoltero[] concursantesSolterosMujeres = new ConcursanteSoltero[10];

    int numSolterosHombres = 0;
    int numSolterosMujeres = 0;
    int longitud = 0;
    for(Concursante concursante_: concursantes){
      if(concursante_ instanceof ConcursanteSoltero concursante){
        if (concursante.getHombre())
        {
          concursantesSolterosHombres[numSolterosHombres]= concursante;
          numSolterosHombres++;
        }
        else
        {
          concursantesSolterosMujeres[numSolterosMujeres]= concursante;
          numSolterosMujeres++;
        }
      }
    }

    for(ConcursanteSoltero persona : concursantesSolterosHombres){
      if(persona != null)
        ++longitud;
    }

    int hombreFuera = r.nextInt(longitud);
    int mujerFuera = r.nextInt(longitud);
    Concursante eliminado1 = concursantesSolterosHombres[hombreFuera];
    Concursante eliminado2 = concursantesSolterosMujeres[mujerFuera];

    System.out.println("Solteros eliminados: " +eliminado1.getNombre() +" y "+eliminado2.getNombre());


    eliminarConcursante(eliminado1);
    eliminarConcursante(eliminado2);
  }

  public void tentacion(int tentacion, boolean sexo){
    ConcursanteConPareja[] concursantesParejaHombre = new ConcursanteConPareja[20];
    ConcursanteConPareja[] concursantesParejaMujer = new ConcursanteConPareja[20];
    int numparejaH = 0;
    int numparejaM = 0;
    int longH=0;
    int longM=0;
    int personaeliminar = 0;



    for(Concursante concursante_:concursantes){
      if(concursante_ instanceof ConcursanteConPareja concursante)
        if(concursante.getHombre())
          {
            concursantesParejaHombre[numparejaH]= concursante;
            numparejaH++;
          }
        else
          {
            concursantesParejaMujer[numparejaM]= concursante;
            numparejaM++;
          }
    }

    for(ConcursanteConPareja persona : concursantesParejaHombre){
      if(persona != null)
        ++longH;
    }

    for(ConcursanteConPareja persona : concursantesParejaMujer){
      if(persona != null)
        ++longM;
    }
    if(longM > 0)
      {
        if(sexo)
        {
          personaeliminar = r.nextInt(longM);
          if(tentacion > concursantesParejaMujer[personaeliminar].getEstabilidad())
            {
              System.out.println("Han caido en la tentacion "+concursantesParejaMujer[personaeliminar].getNombre()+" y "+concursantesParejaMujer[personaeliminar].getPareja().getNombre());
              eliminarConcursante(concursantesParejaMujer[personaeliminar].getPareja());
              eliminarConcursante(concursantesParejaMujer[personaeliminar]);
            }
          
        }
        else
        {
          personaeliminar = r.nextInt(longH);
          if(tentacion > concursantesParejaHombre[personaeliminar].getEstabilidad())
          {
            System.out.println("Han caido en la tentacion "+concursantesParejaHombre[personaeliminar].getNombre()+" y "+concursantesParejaHombre[personaeliminar].getPareja().getNombre());
            eliminarConcursante(concursantesParejaHombre[personaeliminar].getPareja());
            eliminarConcursante(concursantesParejaHombre[personaeliminar]);
          }
          
        }
      }

  }
  
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("LISTADO DE CONCURSANTES\n");
    //String salida = "";
    for(Concursante c : concursantes)
    {
      if (c != null)
        sb.append(c + "\n");
        //salida = salida + c + "\n";
    
    }
    return sb.toString();
  }

  public Concursante[] getConcursantes(){
    return concursantes;
  }
  

}
