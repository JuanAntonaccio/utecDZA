package presencial2904;

public class EjercicioTarde2 {
    public static void main(String[] args) {
        // cantidad de nuemeros impares
        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                contador++;
                System.out.println(i);
            }
        }
        System.out.println("La cantidad de numeros impares es: "+contador);
    }
}
