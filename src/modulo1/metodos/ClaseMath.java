package modulo1.metodos;

public class ClaseMath {
    public static void main(String[] args) {
        // Ejemplos de la clase Math de Java, viene incorporadas en la librerias
        // Standard de Java, al igual que la clase String

        // Redondeo hacia arriba
        double x= Math.ceil(5.4);
        System.out.println(x);

        // Redondeo hacia abajo
        x = Math.floor(5.8);
        System.out.println(x);

        // Tenemos que hacer valor absoluto hay que castear el resultado ya que la funcion
        // devuelve un double
        int y=(int)Math.abs(6.8);
        System.out.println(y);
        // Potencia de 2 elevado a la 3
        x = Math.pow(2,3);
        System.out.println(x);

        for (int i=0;i<10;i++)  // random -- aleatorio entre 0 y 1
            System.out.println(Math.random());
    }
}
