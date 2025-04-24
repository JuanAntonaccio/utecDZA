package modulo1.metodos;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero=15;
        System.out.println(sumar(numero));
    }
    public static int sumar(int n){
        int acumulador=0;
        for (int i=1; i<=n; i++)
            acumulador+=i;
        return acumulador;
    }
}
