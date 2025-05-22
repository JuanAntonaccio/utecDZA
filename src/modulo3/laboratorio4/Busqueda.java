package modulo3.laboratorio4;

public class Busqueda {
    public static int buscarSecuencial(int[] array, int valorBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }
}

