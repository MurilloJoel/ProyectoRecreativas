package JueguitoBonito;

/**
 *
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
    public boolean jugar (Tarjeta t)
    {       
        //Hace comprobaciones y saca mensajes
        // ---Llama a los métodos de la clase Tarjeta---
        int creditos = t.getCreditos();
        int ticket = t.getTicket();
        int numTarj = t.getNumtarj();

        if(creditos >= coste)
        {
            /*Si los creditos son mayores o igual 
            * al coste del juego entonces setteamos 
            * los creditos que tiene la tarjeta a lo que 
            * el coste del juego le quita (creditos - coste)
            */
            
            t.setCreditos(creditos - coste);
            /*inicializa el ticketActual a través del
            * método numTicket (Está abajo)
            */
            int ticketActual = numTicket();
            /*le sumamos los tickets random que acabamos de 
            * generar a los que ya tenía la tarjeta
            */
            t.setTicket(ticket + ticketActual);

     
        //recibe los nuevos valores de creditos y tickets
        creditos = t.getCreditos();
        ticket = t.getTicket();
  
        
        System.out.println("·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿﻿﻿ ·﻿ ﻿ ﻿·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿ ﻿· ·﻿ ﻿ ﻿· ﻿ ·﻿ ﻿ ﻿·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿ ﻿· ");
            System.out.println("TARJETA USADA \t ID: " + numTarj);
            System.out.println("\n ==> Has ganado " + ticketActual + " tickets");
            System.out.println("\n ==> Ahora cuentas con " + ticket + " tickets");
            System.out.println("\n ==> Cuentas con " + creditos +" créditos ahora");
            
            System.out.println("\n \t :)");
        System.out.println("·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿﻿﻿ ·﻿ ﻿ ﻿·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿ ﻿· ·﻿ ﻿ ﻿· ﻿ ·﻿ ﻿ ﻿·﻿ ﻿ ﻿· ﻿ ﻿·﻿ ﻿ ﻿· ");

            return true;
        }
       else
        {
            System.out.println("NO CUENTAS CON SUFICIENTE SALDO");
            System.out.println("\n \t :(");
         return false;   
        }
    
    }

    //GETTER
    public String getNombre() 
    {
        return nombre;
    }

    public int getCoste() 
    {
        return coste;
    }

    //SETTER
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setCoste(int coste) 
    {
        this.coste = coste;
    }

    public static int numTicket()
    {
     //Generamos tickets del 5 al 100
    int numTicket = 5 + (int)(Math.random() * 100); 
    return numTicket;
    }
    
}
