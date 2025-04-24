package modulo1.metodos;

public class Ejercicio3 {
    public static void main(String[] args) {
        String palabra="mesa";
        String resultado=hacerVuelta(palabra);
        System.out.println(resultado);
    }
    private static String hacerVuelta(String palabra) {
        String result="";
        for (int p=palabra.length()-1;p >=0; p--){
            result=result+palabra.charAt(p);
        }
        return result;
    }
}
