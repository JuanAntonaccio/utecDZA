package modulo1.metodos;

public class Clase2404_metodos {
    public static void main(String[] args) {
        String myName="Andres";
        String otroNombre="Marcelo";
        saludo(myName);
        saludo("Juan");
        sumar1();
        int resultado = sumar2(2,15);
        System.out.println("El resultado de la suma es: "+resultado);
        String resultadoEstudiante = clasificarEstudiante(75);
        System.out.println("Su resultado es: "+resultadoEstudiante);

    }

    public static String clasificarEstudiante(int calificacion) {
        // Completa el código aquí
        // esto es una función devuelve un String
        String mensaje="";
        if (calificacion >= 90) {
            mensaje="Execelente";
        } else if (calificacion >= 80) {
            mensaje="Bueno";

        } else if (calificacion >= 70) {
            mensaje="Aceptable";
        } else {
            mensaje="Insuficiente";
        }
        return mensaje;
    }

    private static int sumar2(int a, int b) {
        int resultado= a+b;
        return resultado;
    }

    private static void sumar1() {
        double num1=4.5, num2=2.0, resultado;
        resultado=num1+num2;
        System.out.println(num1+" + "+num2+" = "+resultado);
    }

    private static void saludo(String nombre) {
        System.out.println("Hola como estas "+nombre);
    }
}
