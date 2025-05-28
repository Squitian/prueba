package co.edu.uniremington;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.LocalTime;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        int a = 10;
        int  b = 5;
        int restar = a-b;
        System.out.println(restar);

<<<<<<< HEAD

        int num1 = 5;
        int num2 = 7;
        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

       int a = 2;
       int b = 4;
       int suma = a+b;
        System.out.println(suma);

       int c = 10;
       int d = 12;
       int mult = c*d;
        System.out.println(mult);


=======
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
>>>>>>> 04b5c3a5d88c7e42119d7ae31b3a655c6cfc7422
    }


}

}
