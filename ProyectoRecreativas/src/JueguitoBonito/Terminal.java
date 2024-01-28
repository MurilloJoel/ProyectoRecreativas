package JueguitoBonito;

/**
    @author Joel Murillo
    @author Patricia Jiménez
    @author Leonor Machicado
    */

import java.util.Scanner;

public class Terminal{
    
    //atributos
    
    private Premio premio1;
    private Premio premio2;
    private Premio premio3;
    private int numTerminal;
    
    
    //atributos de clase
    public final static int FACTOR_CONVERSION = 2;
    
    Scanner tl = new Scanner(System.in);
    
    //getters
    
    public Premio getPremio1(){
        return premio1;
    }

    public Premio getPremio2(){
        return premio2;
    }

    public Premio getPremio3(){
        return premio3;
    }

    public int getNumTerminal(){
        return numTerminal;
    }
    
    //setters
    
    public void setPremio1(Premio premio1){
        this.premio1 = premio1;
    }

    public void setPremio2(Premio premio2){
        this.premio2 = premio2;
    }

    public void setPremio3(Premio premio3){
        this.premio3 = premio3;
    }

    public void setNumTerminal(int numTerminal){
        this.numTerminal = numTerminal;
    }
    
    //métodos
    
    /**
     * 
     * @param t Parametro que representa uns tarjeta
     * @param cantidad Saldo que se desea introducir
     */ 
    
    public void cargarTarjeta (Tarjeta t, int cantidad){
        System.out.println("La tarjeta seleccionada es " + t.getNumtarj() + " y tiene " + t.getCreditos() + " créditos");
        System.out.println("¿Cuánto saldo quieres introducir?");
        cantidad = tl.nextInt();
        int Creditost = t.getCreditos();
        t.setCreditos(Creditost + (cantidad * FACTOR_CONVERSION));
        System.out.println("La tarjeta tiene " + t.getCreditos() + " créditos y " + t.getTicket() + " tickets.");
    }
    
    /**
     * 
     * @param t1 Tarjeta de la que se van a transferir los creditos
     * @param t2 Tarjeta que va a recibir los creditos
     */
    
    public void transferirCreditos(Tarjeta t1, Tarjeta t2){
        int Creditos1 = t1.getCreditos();
        int Creditos2 = t2.getCreditos();
        t2.setCreditos(Creditos2 + Creditos1);
        t2.setCreditos(0);
    }
    
    /**
     * 
     * @param t1 Tarjeta de la que se van a transferir los creditos
     * @param t2 Tarjeta que va a recibir los creditos
     * @param creditos Numero de creditos a enviar
     */
    
    public void transferirCreditos(Tarjeta t1, Tarjeta t2, int creditos){
        int Creditos1 = t1.getCreditos();
        int Creditos2 = t2.getCreditos();
        if (Creditos1 >= creditos){
            t2.setCreditos(Creditos2 + creditos);
            t1.setCreditos(Creditos1 - creditos);
        }
        else
            System.out.println("Saldo insuficiente. Transferencia no realizada.");
    }
    
    /**
     * 
     * @param t1 Tarjeta de la que se van a transferir los tickets
     * @param t2 Tarjeta que va a recibir los tickets
     */
    
    public void transferirTickets(Tarjeta t1, Tarjeta t2){
        int Ticket1= t1.getCreditos();
        int Ticket2= t2.getCreditos();
        t2.setTicket(Ticket2 + Ticket1);
        t1.setTicket(0);
    }
    
    /**
     * 
     * @param t1 Tarjeta de la que se van a transferir los tickets
     * @param t2 Tarjeta que va a recibir los tickets
     * @param tickets Numero de tickets a enviar
     */
    
    public void transferirTickets(Tarjeta t1, Tarjeta t2, int tickets){
        int Ticket1 = t1.getTicket();
        int Ticket2 = t2.getTicket();
        if(Ticket1 >= tickets){
            t2.setTicket(Ticket2 + tickets);
            t1.setTicket(Ticket1 - tickets);        
        }
        else
            System.out.println("Saldo insuficiente. Transferencia no realizada.");
    }
    public boolean comprobarTickets(Tarjeta t, Premio p){
        return t.getTicket()>=p.getPrecio();
    }
    
    public boolean comprobarStock(Premio p){
        return p.getStock()>0;
    }
    
    public boolean comprobarPremio(Premio p){
        return (this.premio1.equals(p) || this.premio2.equals(p) || this.premio3.equals(p));
    }
    
    /**
     * 
     * @param t Parametro que representa uan tarjeta
     * @param p Parametro que representa un premio
     */
    
    public void canjearPremio(Tarjeta t, Premio p){
        if (comprobarTickets(t, p) && comprobarStock(p) && comprobarPremio(p)){
            t.setTicket(t.getTicket()-p.getPrecio());
            p.setStock(p.getStock()-1);
            System.out.println("¡Premio canjeado! DISFRUTE");
            System.out.println("Ahora le quedan " + t.getTicket() + " tickets en la tarjeta.");
        }
        else{
            System.out.println("ERROR -- No es posible canjear el premio.");
        }
    }
    
    //constructores
    /**
     * 
     * @param numt Numero de la tarjeta con la que jugar.
     */
    public Terminal(int numt){
        
       this.numTerminal = numt;
       this.premio1 = null;
       this.premio2 = null;
       this.premio3 = null;      
    }
    
    /**
     * 
     * @param numt Numero de la tarjeta con la que jugar.
     * @param p1 Primer premio posible
     * @param p2 Segundo premio posible 
     * @param p3  Tercer premio posible
     */
    
    public Terminal(int numt, Premio p1, Premio p2, Premio p3){
        
        this.numTerminal = numt;
        this.premio1 = p1;
        this.premio2 = p2;
        this.premio3 = p3; 
    }

    @Override
    public String toString() {
        return "Terminal{" + "premio1=" + premio1 + ", premio2=" + premio2 + ", premio3=" + premio3 + ", numTerminal=" + numTerminal + '}';
    }
    
}
