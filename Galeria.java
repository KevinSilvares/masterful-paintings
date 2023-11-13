
/**
 * Write a description of class Galeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galeria
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int superficie;
    private Cuadro cuadro;

    /**
     * Constructor for objects of class Galeria
     */
    public Galeria(String nombre, int superficie, Cuadro cuadro){
        this.nombre = nombre;
        this.superficie = superficie;
        this.cuadro = cuadro;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getSuperficie(){
        return superficie;
    }
    
    public Cuadro getCuadro(){
        return cuadro;
    }
}
