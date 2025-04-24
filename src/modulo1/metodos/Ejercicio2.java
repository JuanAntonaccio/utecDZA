package modulo1.metodos;

public class Ejercicio2 {
    public static void main(String[] args) {
        char letra='m';
        String mensaje="Hola que tal";
        boolean esta= estaPresente(letra,mensaje);
        if(esta){
            System.out.println("La letra esta presente en el mensaje");
        }
    }

    private static boolean estaPresente(char letra, String mensaje) {
        boolean esta=false;
        for (int i=0;i<mensaje.length();i++){
            if(mensaje.charAt(i)==letra){
                return true;
            }
        }
        return esta;
    }
}
