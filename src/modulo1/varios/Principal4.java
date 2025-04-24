package modulo1.varios;

public class Principal4 {
    public static void main(String[] args) {
        int suma=0;
        int contador=0;
        for (int i=1;i<100;i++){
            if (i % 2 ==0){
                suma+=i;
                contador++;
            }
        }
        System.out.println("suma es "+suma);
        System.out.println("contador es "+contador);
    }
}
