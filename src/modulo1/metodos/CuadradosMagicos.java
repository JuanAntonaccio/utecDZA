package modulo1.metodos;

public class CuadradosMagicos {

    public static void main(String[] args) {
        System.out.println("Números del 2 al 1000 con suma de dígitos - 2:");

        for (int i = 2; i <= 100000; i++) {
            int numero = i * i;
            int sumaDigitos = sumarDigitos(numero);
            int resultado = sumaDigitos - 2;
            if (resultado == i) {
                // Mostrar todos, o aplicar una condición, por ejemplo: resultado == 9
                System.out.println("Número: " + numero +
                        " | Suma dígitos: " + sumaDigitos +
                        " | Resultado final: " + resultado);
            }
        }
    }

    // Función para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }


}
