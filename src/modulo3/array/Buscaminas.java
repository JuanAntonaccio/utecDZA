package modulo3.array;

public class Buscaminas {
    private final int[][] tablero;
    private final boolean[][] minas;
    private final int filas;
    private final int columnas;

    public Buscaminas(int filas, int columnas, int numeroDeMinas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new int[filas][columnas];
        minas = new boolean[filas][columnas];

        // Inicializar minas de forma aleatoria
        for (int i = 0; i < numeroDeMinas; i++) {
            int fila, columna;
            do {
                fila = (int) (Math.random() * filas);
                columna = (int) (Math.random() * columnas);
            } while (minas[fila][columna]);
            minas[fila][columna] = true;
            // Aumentar el conteo en las casillas adyacentes
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    int nr = fila + dr, nc = columna + dc;
                    if (nr >= 0 && nr < filas && nc >= 0 && nc < columnas) {
                        tablero[nr][nc]++;
                    }
                }
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (minas[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Buscaminas juego = new Buscaminas(10, 10, 20);
        juego.mostrarTablero();
    }
}
