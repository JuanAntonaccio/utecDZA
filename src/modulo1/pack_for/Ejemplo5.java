package modulo1.pack_for;

public class Ejemplo5 {
    public static void main(String[] args) {
        // Ejemplo 5, For anidados
        // Para usar for anidados precisamos usar 2 indices
        // Vamos a hacer un ejemplo de mostrar por consola las tablas de multiplicar del 1 al 10

        for(int i=1;i<11;i++) {
            System.out.println("Tabla del :"+i);
            for(int j=1;j<11;j++) {
                System.out.println(i+" x "+j +" ="+i*j);
            }
            System.out.println("--------------------- Fin tabla del "+i);
            System.out.println();
        }
    }

}
