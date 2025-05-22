package modulo3.laboratorio3;

public class Busqueda {
    public static int busquedaBinaria(int[] arreglo, int valor) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el valor está presente en la mitad
            if (arreglo[medio] == valor)
                return medio;

            // Si el valor es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < valor)
                izquierda = medio + 1;

                // Si el valor es menor, ignorar la mitad derecha
            else
                derecha = medio - 1;
        }

        // Si el valor no está presente en el arreglo
        return -1;
    }
}
