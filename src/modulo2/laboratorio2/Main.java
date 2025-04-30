package modulo2.laboratorio2;

public class Main {
    public static void main(String[] args) {
        Libro publicacion1 = new Libro("Programación","03-04-24",20,"Guillermo","UTEC");
        Articulo publicacion2 = new Articulo("Testing", "01-04-24",15,"Juan",true);

        publicacion1.mostrarDetalles();
        System.out.println(" ---------------  ");
        publicacion2.mostrarDetalles();
        System.out.println(" ---------------  ");
        publicacion1.mostrarInformacion();
        System.out.println(" ---------------  ");
        publicacion2.mostrarInformacion();
    }
}
