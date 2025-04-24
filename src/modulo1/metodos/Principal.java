package modulo1.metodos;

public class Principal {
    public static void main(String[] args) {
        int a=5,b=6;
        int suma=sumar(a,b);
        System.out.println("la suma es: "+suma);
    }

    private static int sumar(int num1, int num2) {
        int sumatoria = num1+num2;
        return sumatoria;
    }
}
