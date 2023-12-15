package JueguitoBonito;

/**
        @author Joel Murillo 
        @author Patricia Jiménez (◉Θ◉)
        @author Leonor Machicado
        
*/

public class Juego 
{
    //VARIABLES
    private String nombre; //nombre del juego
    private int coste; //el coste del juego

    //CONSTRUCTOR

    public Juego(String nombre, int coste) 
    {
        this.nombre = nombre;
        this.coste = coste;
    }

    //MÉTODO JUGAR
    public int jugar (Tarjeta t)
    {
        //hace comprobaciones y saca mensajes
        if()
        {

        }
        int tickets = 1+(int)(Math.random()*20); //genera tickets del 1 al 20


        return tickets;
    }

    //GETTER
    public String getNombre() {
        return nombre;
    }

    public int getCoste() {
        return coste;
    }

    //SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }







}