package modulo3.array;

public class Ej17 {
    public static void main(String[] args) {
        // array escalonados en Java
        int [][] matriz = new int[3][];
        matriz[0] = new int[]{1,2,3,4,5,6};
        matriz[1]= new int[]{1,2,3};
        matriz[2] = new int[]{1,3,7,9};
        System.out.println("array escalonados en Java");
        for(int i=0; i< matriz.length;i++){
            for(int j=0;j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
