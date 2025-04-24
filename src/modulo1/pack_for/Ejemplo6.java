package modulo1.pack_for;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Ejemplo6 {

    public static void main(String[] args) {
        // Tiempo de busqueda de un numero con el for
        LocalTime time1 = LocalTime.now();


        int numero=47325;
        boolean encontre=false;
        for (int i=1;i<100000;i++) {
            if (i==numero) {
                encontre=true;

            }
        }
        LocalTime time2 = LocalTime.now();

        long diff = ChronoUnit.NANOS.between(time1, time2);
        System.out.println("Encontro al numero buscado ?"+encontre);

        System.out.println("La demora fue de:"+diff+ " Nanosegundos");


        // Ahora lo hacemos con el While y cuando lo encuentre salgo de la busqueda

        time1=LocalTime.now();

        encontre=false;
        int i=1;
        while(!encontre && i<100000) {
            if (i==numero) {
                encontre=true;

            }
            i++;
        }
        time2 = LocalTime.now();
        diff = ChronoUnit.NANOS.between(time1, time2);
        System.out.println("En el While --- Encontro al numero buscado ?"+encontre);

        System.out.println("La demora While fue de:"+diff+ " Nanosegundos");
    }


}

