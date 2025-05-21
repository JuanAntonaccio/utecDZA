package modulo1.stringBuilder;

public class PruebaSplit {
    public static void main(String[] args) {
        String texto = "Hola,Juan,perro,gato caballo";
        String[] arraySplit = texto.split(",");
        for (int i = 0; i < arraySplit.length; i++) {
            System.out.println(arraySplit[i]);

        }
    }
}
