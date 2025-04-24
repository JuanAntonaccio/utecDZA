package modulo1.varios;

public class Programa2 {
    public static void main(String[] args) {
        int acumulado = 34;
        double dividendo = 350;
        for (int i=35;i<52;i=i+3){
            acumulado += 10 + i;
            dividendo /= 2;
        }
        if (acumulado == 378){
            System.out.println("Ejecute la primer condicion");
        } else if (acumulado == 349) {
            System.out.println("Ejecute la segunda condicion");
        } else {
            System.out.println("Ejecute el else");
        }
        System.out.println(acumulado);
        System.out.println(dividendo);
    }
}
