
package JueguitoBonito;

/**
 *
 * @author Joel Murillo
 * @author Patricia Jimenez
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
        
        Premio chuches= new Premio("Regaliz",10,5);
        Premio peluche= new Premio("Kirby",30,1);
        Premio figura= new Premio("Figura de Shrek",90,1);
        Premio electronica= new Premio("Altavoz RGB de Aliexpress",150,1);

        Terminal t1 = new Terminal(1, chuches,peluche,figura);
        Terminal t2 = new Terminal(2,peluche,figura, electronica);        
        
        // Cargar tarjeta 1
        System.out.println("Has elegido la tarjeta numero "+ tarjeta1.getNumtarj() +", tienes "+ tarjeta1.getCreditos() +" creditos.");
        System.out.println("¿Cuanto saldo quieres introducir?");
        int cantidad=teclado.nextInt();
        teclado.nextLine();//limpiar buffer
        t1.cargarTarjeta(tarjeta1,cantidad);
        
        // Cargar tarjeta 2
        System.out.println("Has elegido la tarjeta numero "+ tarjeta2.getNumtarj() +", tienes "+ tarjeta2.getCreditos() +" creditos.");
        System.out.println("¿Cuanto saldo quieres introducir?");
        cantidad=teclado.nextInt();
        teclado.nextLine();//limpiar buffer
        t2.cargarTarjeta(tarjeta2, cantidad);
        
        // jugar con las 2 tarjetas
        juego1.jugar(tarjeta1);
        juego2.jugar(tarjeta1);
        juego3.jugar(tarjeta2);
        juego4.jugar(tarjeta2);
        
        // transferencia
        System.out.println("¿Desde que tarjeta quieres hacer la transferencia (creditos)?");
        String respuesta= teclado.nextLine();
        if(respuesta.contains("1")){

            System.out.println("Has elegido la tarjeta numero "+ tarjeta1.getNumtarj() +", tienes "+ tarjeta1.getCreditos()+ " creditos.");
            System.out.println("¿Cuanto saldo quieres transferir a la otra tarjeta?");
            int creditos=teclado.nextInt();
            teclado.nextLine();
            t1.transferirCreditos(tarjeta1, tarjeta2, creditos);
	    System.out.println("Ahora la tarjeta numero "+ tarjeta2.getNumtarj() +" tiene "+ tarjeta2.getCreditos() +" creditos.");

        }else if(respuesta.contains("2")){
	    
	    System.out.println("Has elegido la tarjeta numero "+ tarjeta2.getNumtarj() +", tienes "+ tarjeta2.getCreditos()+ " creditos.");
            System.out.println("¿Cuanto saldo quieres transferir a la otra tarjeta?");
            int creditos=teclado.nextInt();
            teclado.nextLine();
            t1.transferirCreditos(tarjeta2, tarjeta1, creditos);
	    System.out.println("Ahora la tarjeta numero "+ tarjeta1.getNumtarj() +" tiene "+ tarjeta1.getCreditos() +" creditos.");         

	}

        System.out.println("¿Desde que tarjeta quieres hacer la transferencia (tickets)?");
        respuesta= teclado.nextLine();
        if(respuesta.contains("1")){

            System.out.println("Has elegido la tarjeta numero "+ tarjeta1.getNumtarj() +", tienes "+ tarjeta1.getTicket()+ " tickets.");
            System.out.println("¿Cuantos tickets quieres transferir a la otra tarjeta?");
            int tickets=teclado.nextInt();
            teclado.nextLine();
            t1.transferirTickets(tarjeta1, tarjeta2, tickets);
	    System.out.println("Ahora la tarjeta numero "+ tarjeta2.getNumtarj() +" tiene "+ tarjeta2.getTicket() +" tickets.");

        }else if(respuesta.contains("2")){
	    
	    System.out.println("Has elegido la tarjeta numero "+ tarjeta2.getNumtarj() +", tienes "+ tarjeta2.getTicket()+ " tickets.");
            System.out.println("¿Cuanto tickets quieres transferir a la otra tarjeta?");
            int tickets=teclado.nextInt();
            teclado.nextLine();
            t1.transferirTickets(tarjeta2,tarjeta1,tickets);
	    System.out.println("Ahora la tarjeta numero "+ tarjeta1.getNumtarj() +" tiene "+ tarjeta1.getTicket() +" tickets.");
        
        }
        teclado.next();
        
        System.out.println("Que tarjeta quieres usar para canjear premios?");
        respuesta= teclado.nextLine();
        
        if (respuesta.contains("1")) {
            System.out.println("¿Que tipo de premio quieres canjear?\n"+ t1.toString()+ "\n");
            respuesta= teclado.nextLine();
            
            if (respuesta=="1") {
                 t1.canjearPremio(tarjeta1, chuches);
            }else if (respuesta=="2") {
                 t1.canjearPremio(tarjeta1, peluche);
            }else if (respuesta=="3") {
                 t1.canjearPremio(tarjeta1, figura);
            }else{
                System.out.println("Premio no valido");
            }
            
        }else if (respuesta.contains("2")) {
            System.out.println("¿Que tipo de premio quieres canjear?\n"+ t2.toString()+ "\n");
            respuesta= teclado.nextLine();
            
            if (respuesta=="1") {
                 t1.canjearPremio(tarjeta2, peluche);
            }else if (respuesta=="2") {
                 t1.canjearPremio(tarjeta2, figura);
            }else if (respuesta=="3") {
                 t1.canjearPremio(tarjeta2, electronica);
            }else{
                System.out.println("Premio no valido");
            }
            
        }
        
        
        
        
    }
    
}
