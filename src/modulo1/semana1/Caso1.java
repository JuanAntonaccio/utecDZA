package modulo1.semana1;

public class Caso1 {
    // atajo intellij psvm
    public static void main(String[] args) {
        // Variables Ejemplos
        // enteros byte, short, int, long
        // decimales double, float
        // booleano   boolean (true, false)
        // char  1 caracter  usa con comillas simples '  '
        // String (clase) array de char

        int a;
        int b = 3;
        //b= 10 + 20;
        // esta asigancion no la voy a usar
        int c, d = 3;
        a=15;

        double dec1;
        dec1 = 10.25;
        float dec2;
        dec2 = 15.2432f;
        short g = 3;
        char solo = 'a';// char se le pone comillas simples
        char otroChar = 65;
        // Concatenar es para cadenas de texto
        System.out.println("El valor de otroChar es: "+otroChar);
        String nombre = "Ana", apellido = "Rios";
        System.out.println("El valor de d es " + d);
        // Este es un comentario en 1 sola línea
		/*
		  Este es un comentario de
		  varias líneas
		  para dejar como guía.

		 */

        // Siguiente punto a ver

        int k = 0;
        k = k + 1; // incrementamos en 1 el valor de k
        // + - * /  %
        // atajo del teclado intellij sout //
        System.out.println();
        System.out.println(k);
        k = 0;
        k++;// incrementamos en 1 el valor de k
        System.out.println(k);

        k = 0;
        k = k + 2;// incrementamos el 2 el valor de k
        System.out.println(k);


        k = k * b;// multilico el valor de k por b (2 x 3)= 6
        System.out.println(k);

        k *= b; // multiplico el valor de k por b (6 x 3) = 18  k = k * b;

        // + - / *  %
        // 7 % 5 ->  2

        System.out.println(k);

        // incremento posterior y anterior

        System.out.println("----------------------------------------------");
        System.out.println(" Incremento posterior y anterior");
        System.out.println();


        a = 1;
        System.out.println("a =" + a);// 1
        System.out.println("a++ =" + a++);// muestra despues incrementa 1
        System.out.println("a =" + a);// 2
        System.out.println("++a =" + ++a);// incrementa despues muestra  3
        System.out.println("a =" + a);  // 3


        // Operadores Matematicos y Logicos

        b = 110 / 5;  // dividir
        System.out.println("b = 110/5 =" + b);
        b = 155 % 3; // El operador % es el resto de la division
        System.out.println("El resto de dividir 155 entre 3 es :" + b);
        // Casteo de double a int, por defecto esta funcion devuelve un double
        c = (int) Math.pow(2, 3);

        System.out.println("2 elevado a la 3 es =" + c);
        // division entre enteros devuelveun numero entero
        c = 3 / 2;
        System.out.println("Enteros: 3/2 =" + c);

        boolean oper = a > b;
        System.out.println("el boolean oper es :" + oper);
        oper = b > 35;
        System.out.println("el boolean oper es :" + oper);
        boolean otro = oper && a > b;// and &&
        System.out.println("el boolean otro es :" + otro);
        otro = a > b || oper;// el operador or ||
        System.out.println("el boolean otro es :" + otro);
        // Negacion
        System.out.println("el boolean negacion otro es :" + (!otro));
        System.out.println("contenido b = 2 ? " + (b == 2));
        System.out.println("contenido b = 5 ? " + (b == 5));
        System.out.println("contenido b >= 2 ? " + (b >= 2));
        System.out.println("contenido b < 2 ? " + (b < 2));
        System.out.println("contenido b <= 2 ? " + (b <= 2));
        System.out.println("contenido b distinto de 2 ? " + (b != 2));
        System.out.println("contenido b distinto de 5 ? " + (b != 5));


    }
}