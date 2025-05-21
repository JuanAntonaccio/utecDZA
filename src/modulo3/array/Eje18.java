package modulo3.array;

public class Eje18 {
    public static void main(String[] args) {
        // Crear e inicializar el arreglo tridimensional para las salas de cine
        // cine[sala][fila][asiento]
        boolean[][][] cine = new boolean[2][3][4];

        // Supongamos que todos los asientos están inicialmente disponibles, los inicializamos a true
        for (int sala = 0; sala < cine.length; sala++) {
            for (int fila = 0; fila < cine[sala].length; fila++) {
                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {
                    cine[sala][fila][asiento] = true;
                }
            }
       }
       // Ocupamos algunos asientos para el ejemplo
        // Ocupar el asiento en la primera sala, primera fila, primer asiento
        cine[0][0][0] = false;
        cine[0][0][1] = false;
        cine[0][1][2] = false;

       // Ocupar el asiento en la segunda sala, tercera fila, cuarto asiento
        cine[1][2][3] = false;

       // Mostrar el estado de los asientos en las salas
        for (int sala = 0; sala < cine.length; sala++) {
            System.out.println("Sala " + (sala + 1) + ":");
            for (int fila = 0; fila < cine[sala].length; fila++) {
                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {
                    System.out.print(cine[sala][fila][asiento] ? "Disponible " : "Ocupado ");
                }
                System.out.println("\n");
            }
            System.out.println();
        }

    }
}
