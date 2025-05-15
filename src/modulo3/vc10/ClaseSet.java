package modulo3.vc10;

import java.util.HashSet;
import java.util.Iterator;

public class ClaseSet {
    public static void main(String[] args) {
        HashSet<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Rojo");
        colores.add("Azul");
        System.out.println(colores);
        Iterator<String> str = colores.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }

    }
}
