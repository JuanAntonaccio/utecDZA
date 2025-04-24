package modulo1.metodos;

public class Factorial {
    public static void main(String[] args) {
        int numero=7;
        System.out.println(factorial(numero));
    }
    private static int factorial(int n) {
        int suma=1;
        for(int i=n; i>=2; i--){
            suma*=i;
        }
        return suma;
    }
}
