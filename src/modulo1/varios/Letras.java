package modulo1.varios;

public class Letras {
    public static void main(String[] args) {
        String datos="aprendiendo el uso de java";
        String vocales="";
        boolean expr = true;
        for (int i=0;i<datos.length();i++){
            expr = datos.charAt(i)=='a' || datos.charAt(i)=='e' ||
                    datos.charAt(i)=='i' || datos.charAt(i)=='o' || datos.charAt(i)=='u';
            vocales = expr ? vocales=vocales+datos.charAt(i):vocales;
        }
        System.out.println(vocales);
    }
}
