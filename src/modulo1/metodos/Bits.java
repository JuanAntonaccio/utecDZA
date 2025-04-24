package modulo1.metodos;

public class Bits {
    public static void main(String[] args) {
        int bits=9;
        int valores=2; // los bits pueden tener 2 valores posibles
                       // 0 y 1
        int resultado=potencia(valores,bits);
        System.out.println(resultado);
    }

    private static int potencia(int valores, int bits) {
        int result=(int) Math.pow(valores,bits);
        return result;
    }
}
