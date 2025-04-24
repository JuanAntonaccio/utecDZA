package modulo1.semana2;

public class PruebaFor2 {
    public static void main(String[] args) {
        // variable acumulador
        int suma = 0;
        // variable contador
        int contador=0;
        for (int i = 1; i <=100 ; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
            //suma=suma+i;
        }
        System.out.println("La suma de los pares es: "+suma);
        System.out.println("La cantidad de numeros pares es: "+contador);
        System.out.println();
        suma=0;
        for (int i = 2; i <=100 ; i=i+2) {
            suma += i;
        }
        System.out.println("segunda forma - La suma de los pares es: "+suma);
    }
}
