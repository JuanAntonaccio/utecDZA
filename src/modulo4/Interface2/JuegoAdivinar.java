package modulo4.Interface2;

import java.util.Scanner;

public class JuegoAdivinar implements Juego {
	    private int numero;
	    private Scanner teclado;
	    private int intentos;

	    public JuegoAdivinar() {
	        teclado = new Scanner(System.in);
	    }

	    public void iniciar() {
	        numero = 1 + (int) (Math.random() * 50);
	    }

	    public void jugar() {
	        int numing;
	        do {
	            System.out.print("Ingresa un n�mero entre 1 y 50:");
	             numing = teclado.nextInt();
	            if (numero < numing)
	                System.out.println("El n�mero es menor");
	            else if (numero > numing)
	                System.out.println("El n�mero es mayor");
	            intentos++;
	        } while (numero != numing);
	    }

	    public void terminar() {
	        System.out.println("Gano en " + intentos + " intentos");
	    }
	
}
