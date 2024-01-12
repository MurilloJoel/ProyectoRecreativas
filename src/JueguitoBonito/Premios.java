package JueguitoBonito;

/**
    @author Joel Murillo
    @author Patricia Jiménez
    @author Leonor Machicado
    */

public class Premios{
    
    //atributos
    
    private String premio;
    private int precio;
    private int stock;

    //getters
    
    public String getPremio(){
        return premio;
    }

    public int getStock(){
        return stock;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    //setters
    
    public void setPremio(String premio){
        this.premio = premio;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    
    @Override
    public String toString(){
        return "Premio{" + "premio=" + premio + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    public Premios(String premio, int precio, int stock){
        this.premio = premio;
        this.precio = precio;
        this.stock = stock;
    }

}
