public class Cuadro
{
    // instance variables - replace the example below with your own
    private String autor;
    private double precio;

    /**
     * Constructor for objects of class Galeria
     */
    public Cuadro(String autor, double precio){
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
}