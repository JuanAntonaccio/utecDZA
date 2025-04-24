package modulo1.metodos;

public class Random {
    public static void main(String[] args) {
        int resultado= funRandom();
        System.out.println(resultado);
    }

    private static int funRandom() {
        int res=(int) (Math.random()*10)+1;
        return res;
    }
}
