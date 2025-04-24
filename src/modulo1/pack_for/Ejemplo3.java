package modulo1.pack_for;
// Realizado por Juan Antonaccio
// UTEC
// Durazno
// Marzo 2024

public class Ejemplo3 {
    public static void main(String[] args) {
        // Ejemplo 3 For
        // Contar cuantas veces esta determinada letra en una palabra
        //                        111111111122222
        //              0123456789012345678901234
        String palabra="Estoy buscando la letra a";// largo 25
        int contador=0;
        for (int j=0;j<palabra.length();j++) {
            if (palabra.charAt(j)=='e' || palabra.charAt(j)=='E') {
                contador++;
            }
        }
        System.out.println("La letra e y/o E esta "+contador+" veces en palabra");
    }
}
