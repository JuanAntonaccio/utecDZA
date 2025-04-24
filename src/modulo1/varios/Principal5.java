package modulo1.varios;

public class Principal5 {
    public static void main(String[] args) {
        int var1=0, var2=1;
        int aux=0;
        boolean esta=true;
        while( var2>var1++ && esta){
            esta= var1==1? false: true;
            var2++;
            var1++;
            aux = var1;
            var1 = var2;
            var2 = aux;
            System.out.println(var1);
        }
    }
}
