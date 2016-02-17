package trabajo.so;

/**
 *
 * @author Nicolas
 */
public class Proceso {
    
    private Integer correlativo = 1;
    
    protected String nombre;
    protected Integer tiempoLlegada;
    protected Integer tiempoRafaga;
    protected Integer prioridad = null;
    
    public Integer tiempoEspera = null;
    public Integer tiempoRetorno = null;
    
    public Proceso(Integer timepoLlegada,Integer tiempoRafaga){
        this.nombre = "P"+Integer.toString(correlativo++);
        this.tiempoLlegada = timepoLlegada;
        this.tiempoRafaga = tiempoRafaga;
    }
    
    public Proceso(Integer timepoLlegada,Integer tiempoRafaga,Integer prioridad){
        this.nombre = "P"+Integer.toString(correlativo++);
        this.tiempoLlegada = timepoLlegada;
        this.tiempoRafaga = tiempoRafaga;
        this.prioridad = prioridad;
    }
    
    public int calcularEspera(){
        return this.tiempoRetorno+this.tiempoLlegada;
    }
    
    
    
}
