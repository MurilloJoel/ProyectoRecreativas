package JueguitoBonito;


/**
    *
 

    @author Joel Murillo
        @author Patricia Jiménez
        @author Leonor Machicado
    */

public class Tarjeta 
{
    //VARIABLES DE INSTANCIA
    private int creditos; //creditos de la tarjeta
    private int ticket; //tickets que da la máquina
    private int numtarj; //el número de la tarjeta
    // ATRIBUTOS DE CLASE
    static private int contador = 1; //contador nº tarjeta autoincrementado 
    // (es un contador que cuando se hace una nueva tarjeta aumenta 1 en el contador)

    //CONSTRUCTOR
    public Tarjeta(int creditos) 
    {
        this.creditos = creditos;
        this.ticket = 0;
        this.numtarj = contador;
        contador++;
    }

    //METODOS GETTER

    public int getCreditos() 
    {
        return creditos;
    }

    public int getTicket() 
    {
        return ticket;
    }

    public int getNumtarj() 
    {
        return numtarj;
    }


    //METODOS SETTER

    public void setCreditos(int creditos) 
    {
        this.creditos = creditos;
    }

    public void setTicket(int ticket) 
    {
        this.ticket = ticket;
    }

}