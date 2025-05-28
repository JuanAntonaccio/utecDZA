package modulo4.Interface2;

import java.util.Scanner;

public class JuegoCartas implements Juego {
	private int carta1;
	private int carta2;
    private String part1;
    private String part2;
    private Scanner teclado;

    public JuegoCartas() {
        teclado = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.print("Nombre del primer jugador:");
        part1 = teclado.nextLine();
        System.out.print("nombre del segundo jugador:");
        part2 = teclado.nextLine();
    }

    public void jugar() {
        carta1 = 1 + (int) (Math.random() * 12);
        carta2 = 1 + (int) (Math.random() * 12);
        System.out.println(part1 + " saco la carta " + carta1);
        System.out.println(part2 + " saco la carta " + carta2);
    }

    public void terminar() {
        if (carta1 > carta2)
            System.out.println("Gana " + part1 + " con la carta " + carta1);
        else if (carta2 > carta1)
            System.out.println("Gana " + part2 + " con la carta " + carta2);
        else
            System.out.println("Empataron sacaron la misma carta " + carta2);
    }

}
