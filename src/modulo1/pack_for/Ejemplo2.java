package modulo1.pack_for;

public class Ejemplo2 {
    public static void main(String[] args) {
        // Ejemplo 2 del For

        // Dada una palabra cualquiera guardada en un String,
        // Mostrar por consola cada letra de su contenido
        //              012345678
        String palabra="Estocolmo";// palabra.length()=9  --- largo es 9

        for(int i=0;i<palabra.length();i++) {
            System.out.println(palabra.charAt(i));
        }
        System.out.println("--------------  Al Reves --------");
        System.out.println("=".repeat(80));
        for(int i=palabra.length()-1;i>=0;i--) {
            System.out.println(palabra.charAt(i));
        }
    }


}
