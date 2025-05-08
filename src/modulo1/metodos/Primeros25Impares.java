package modulo1.metodos;

public class Primeros25Impares {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        int numero =1;
        while (contador < 25) {
            suma+=numero;
            contador++;
            numero=numero+2;
        }
        System.out.println(suma);
        int numcuadrado = contador * contador;
        System.out.println(numcuadrado);

    }
}
