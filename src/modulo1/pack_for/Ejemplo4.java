package modulo1.pack_for;

public class Ejemplo4 {
    public static void main(String[] args) {

        // Ejemplo 4
    // Nos metemos en la semana 3 - un adelanto
    // Uso de Arrays con for

    // definicion de un array y asignamos valores
    int[] edades = {52, 24, 33, 28, 19, 21, 34, 47, 36, 42};// largo array 10
    //               0   1  2  3  4  5  6  7  8  9
    double suma = 0;
    double promedio;
		for(
    int k = 0;
    k<edades.length;k=k+1)

    {
        suma = suma + edades[k];
        // suma+=edades;
    }
        System.out.println("La suma de todas las edades es :"+suma);
    promedio=suma/edades.length;
        System.out.println("El promedio de las edades es :"+promedio);
 }
}
