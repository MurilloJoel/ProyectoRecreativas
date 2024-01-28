
package JueguitoBonito;

/**
 *
 * @author Joel Murillo
 * @author Patricia Jiménez
 * @author Leonor Machicado
 */

import java.util.Scanner;
public class HistoriaRecreativas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Tarjeta tarjeta1= new Tarjeta(100);
        Tarjeta tarjeta2= new Tarjeta(60);
        
        Juego juego1= new Juego("Mortal Kombat",15);
        Juego juego2= new Juego("Tomb Raider",20);
        Juego juego3= new Juego("Dance Dance Revolution",25);
        Juego juego4= new Juego("Forza 4",30);
        
        Premios chuches= new Premios("Regaliz",10,5);
        Premios peluche= new Premios("Kirby",30,1);
        Premios figura= new Premios("Figura de Shrek",90,1);
        Premios electronica= new Premios("Altavoz RGB de Aliexpress",150,1);        
        
    }
    
}
