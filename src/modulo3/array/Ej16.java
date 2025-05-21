package modulo3.array;

public class Ej16 {
    public static void main(String[] args) {
        // Cargamos en las tablas de 0 a 9
        int tablas[][]= new int [10][10];
        for (int i=0;i<tablas.length;i++){
            for (int k=0;k<tablas[0].length;k++){
                tablas[i][k]=i*k;
            }
        }
        // Cuanto es 8 x 7
        System.out.println(" 8 x 7 = "+tablas[8][7]);
    }
}
