package modulo1.varios;

public class Principal2 {
    public static void main(String[] args) {
        int a=1, e=4, r=1;
        while(a<100){
            if (e==r){
                r=e+1;
                System.out.println("s");
                break;
            }
            e--;
        }
        System.out.println(a);
        System.out.println(e);
        System.out.println(r);
    }
}
