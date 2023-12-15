package JueguitoBonito;

/**
    @author Joel Murillo
    @author Patricia Jiménez
    @author Leonor Machicado
    */
import java.util.Scanner;

public class Terminal {
    private Premio premio1;
    private Premio premio2;
    private Premio premio3;
    private int numTerminal;
    public final static int factorConversion = 2;
    
    Scanner tl = new Scanner(System.in);
    
    public Premio getPremio1() {
        return premio1;
    }

    public Premio getPremio2() {
        return premio2;
    }

    public Premio getPremio3() {
        return premio3;
    }

    public int getNumTerminal() {
        return numTerminal;
    }

    public void setPremio1(Premio premio1) {
        this.premio1 = premio1;
    }

    public void setPremio2(Premio premio2) {
        this.premio2 = premio2;
    }

    public void setPremio3(Premio premio3) {
        this.premio3 = premio3;
    }

    public void setNumTerminal(int numTerminal) {
        this.numTerminal = numTerminal;
    }
    
    public void cargarTarjeta (Tarjeta t, int cantidad){
        System.out.println("La tarjeta seleccionada es " + t.getNumTarj() + " y tiene " + t.getCreditos() + " créditos");
        System.out.println("¿Cuántp saldo quieres introducir?");
        cantidad = tl.nextInt();
        
    }
}
