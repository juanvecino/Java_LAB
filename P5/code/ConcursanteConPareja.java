import java.time.LocalDate;
import java.time.Duration;

public class ConcursanteConPareja extends Concursante {
  
  private ConcursanteConPareja pareja;
  private int tiempoRelacion;
  private boolean infidelidadPrevia;
  private String date;
  private int estabilidad;

  public enum TipoRelacion{
    NATURAL,OTRO,CONCURSO;
  }

  
  public ConcursanteConPareja(Concursante.Sexo sexo, String nombre, int edad, String date, boolean infidelidadPrevia){
    super(sexo, nombre, edad);
    this.date = date;
    this.infidelidadPrevia = infidelidadPrevia; 
    this.tiempoRelacion(date);
  }
  
  public ConcursanteConPareja(Sexo sexo, String nombre, int edad, boolean infidelidadPrevia, ConcursanteConPareja pareja,TipoRelacion relacion){
    this(sexo, nombre, edad, pareja.getTiempoRelacion(), infidelidadPrevia);
    this.setPareja(pareja);
    this.setestabilidadPareja(tiempoRelacion,pareja.getEdad(),edad,relacion,infidelidadPrevia);
    pareja.estabilidad = estabilidad;
  }  
  
  public void tiempoRelacion(String date){
    tiempoRelacion = (int)Duration.between( LocalDate.parse(date).atStartOfDay(),LocalDate.now().atStartOfDay()).toDays();
  }

  public String getTiempoRelacion(){
    return date;
  }

  public int getEstabilidad(){
    return estabilidad;
  }
  
  public void setestabilidadPareja(int tiempoRelacion, int edad1, int edad2, TipoRelacion relacion, boolean infidelidadPrevia){
    switch(relacion){
    case NATURAL:
      {
        estabilidad = (tiempoRelacion*(edad1+edad2)/2)*10;
        break;
      }
    case OTRO:
      {
        estabilidad = (tiempoRelacion*(edad1+edad2)/2)*5;
        break;
      }
    case CONCURSO:
      {
        estabilidad = (tiempoRelacion*(edad1+edad2)/2)*3;
        break;
      }
    }

    if (infidelidadPrevia==false)
      estabilidad = estabilidad*5;
  }

  public ConcursanteConPareja getPareja(){
    return this.pareja;
  }
  
  public void setPareja(ConcursanteConPareja pareja){
    this.pareja = pareja;
    if (pareja.getPareja() == null)
      pareja.setPareja(this);
  }

  public String getVilla()
  {
    if (getSexo() == Sexo.FEMENINO)
      return "villa playa";
    else
      return "villa montaña";
  }
  
  public String toString(){
    return super.toString() + " , PAREJA: " + pareja.getNombre()+" tiempoRelacion: " +tiempoRelacion+ " Estabilidad: "+estabilidad;
  }
  
  public float calcularIndemnizacionDespido(float salario, int diasContrato){
    return salario * 3 + diasContrato;  
  }


}
