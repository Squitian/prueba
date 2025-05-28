package co.edu.uniremington;
import org.w3c.dom.ls.LSOutput;
import javax.swing.*;
import java.time.LocalTime;

public class App
{
    public static void main( String[] args )
    {
        int a = 10;
        int  b = 5;
        int restar = a-b;
        System.out.println(restar);

        LocalTime hora = LocalTime.now();
        String saludo;

        if (hora.getHour() < 12) {
            saludo = "¡Buenos días!";
        } else if (hora.getHour() < 18) {
            saludo = "¡Buenas tardes!";
        } else {
            saludo = "¡Buenas noches!";
        }

        System.out.println(saludo + " ¡Bienvenido al mundo de la programación!");
    }



}

}
