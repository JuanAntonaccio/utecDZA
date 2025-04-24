package modulo1.metodos;

public class Principal2 {
    public static void main(String[] args) {
        String a="Marcela";
        String b="Perez";
        String concatenado = concatenar(a,b);
        System.out.println(concatenado);
        String res1=concatenar("Raul","Ortega");
        String res2=concatenar("","Algo");
        String res3=concatenar("3","Garcia");
    }
    private static String concatenar(String nombre, String apellido) {
        return "Hola "+nombre+" "+apellido;
    }
}
