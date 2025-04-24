package modulo1.varios;

public class Programa4 {
    public static void main(String[] args) {
        boolean ejecutar = true;
        double operacion = 10;
        int acumulador = 0;
        while(ejecutar){
            if(acumulador == 18){
                ejecutar = false;
                acumulador = 78;
            }
            operacion *= acumulador;
            acumulador++;

        }
        System.out.println(acumulador);
        System.out.println(operacion);
    }
}
