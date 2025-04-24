package modulo1.pack_for;

public class Ejemplo1 {
    public static void main(String[] args) {
        // Video  - Ejemplo For
        // Sintaxis
        // for (iniciar variable a iterar; condicion de parada ; incrementar variable iterada)
        //

        for (int i=1;i<5;i++) {
            System.out.println("i =" + i + " Hola....");
            System.out.println("otra linea");
        }
        int suma=0;
        for (int i = 5; i>=0 ; i--) {
            System.out.print(i+" ");
            suma+=i;
        }
        System.out.println("La suma es: "+suma);
    }

}
