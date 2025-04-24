package modulo1.varios;

public class Iteracion {
    // Ejemplo de sentencia continue
    public static void main(String[] args) {
        for (int i=1;i<20;i++) {
             if(i%2 !=0){
                 continue;
             }
            System.out.print(i+" - ");
        }
    }
}
