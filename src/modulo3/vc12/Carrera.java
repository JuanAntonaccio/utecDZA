package modulo3.vc12;

import java.util.Random;

public class Carrera {
    private final int[][] tablero = new int[6][40]; // 6 corredores, 40 casilleros
    private final Random random = new Random();

    public Carrera() {
        // Inicializar la posición de los corredores
        for (int i = 0; i < 6; i++) {
            tablero[i][0] = 1; // Todos los corredores comienzan en la posición 0
        }
    }

    public void correr() {
        boolean hayGanador = false;
        while (!hayGanador) {
            int corredor = random.nextInt(6); // Seleccionar un corredor aleatorio
            int avance = 1 + random.nextInt(2); // Avance de 1 o 2 casilleros
            for (int i = 39; i >= 0; i--) {
                if (tablero[corredor][i] == 1) { // Encontrar la posición actual del corredor
                    tablero[corredor][i] = 0; // Marcar la posición actual como vacía
                    int nuevaPosicion = Math.min(i + avance, 39); // Calcular la nueva posición
                    tablero[corredor][nuevaPosicion] = 1; // Mover al corredor a la nueva posición
                    if (nuevaPosicion == 39) { // Chequear si hay ganador
                        hayGanador = true;
                        System.out.println("El corredor " + (corredor + 1) + " ha ganado!");
                    }
                    break;
                }
            }
            mostrarTablero();
            try {
                Thread.sleep(500); // Esperar medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (hayGanador) break;
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 6; i++) {
            String dato=(i+1)+"";
            for (int j = 0; j < 40; j++) {
                System.out.print(tablero[i][j] == 1 ? dato : "-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.correr();
    }
}
