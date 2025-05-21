package modulo3.vc9;


import java.util.*;

public class EjemploLista1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista2 = new LinkedList<>(); // no lleva tipos primitivos


        LinkedList<String> lista = new LinkedList<>();
        lista.add("Rojo");
        lista.add("Amarillo");
        lista.add("Blanco");
        lista.add("Verde");

        // saber el tamaño
        System.out.println(lista.size());
        System.out.println("La lista esta vacia ?"+lista.isEmpty());

        System.out.println(lista);
        System.out.println(lista.get(0));
        //System.out.println(lista.get(4)); //Produce un error (exception) fuera de rango
        System.out.println();

        System.out.println("Recorriendo con un for tradicional");
        for (int i = 0; i < lista.size() ; i++) {
            System.out.println("inidce: "+i+" -- "+lista.get(i));
        }
        System.out.println();
        System.out.println("Recorriendo la lista al reves");
        // Recorrer la lista al reves
        for (int i= lista.size() - 1; i >= 0; i--) {
            System.out.println("inidce: "+i+" -- "+lista.get(i));
        }
        System.out.println("-".repeat(80));




        System.out.println();
        System.out.println("Recorriendo con for-each");
        for(String s: lista){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Recorriendo con Iterator");
        Iterator<String> str = lista.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }

        // Buscar un elemento en una lista
        System.out.println("Buscar un elemento en una lista");
        int indice= 0;
        boolean esta=false;
        // tratar de no usar break
        // no es buena practica usarla
        while(indice < lista.size() && !esta){
            if (lista.get(indice).equals("Blanco")) {
                System.out.println("Encontre el elemento buscado");
                esta=true;
            }
            indice++;
        }

        Integer [] vector = {1,2,3,4,5};
        List<Integer> listaNumeros = Arrays.asList(vector); // lista inmutable
        // listaNumeros.remove(0);
        System.out.println(listaNumeros);



       ArrayList<String> otra = new ArrayList<String>(Arrays.asList("pato caballo perro vaca tero".split(" ")));

        System.out.println(otra);
        otra.add("gato");



//        Integer [] numeros = {1,2,3,4,5};
//
//        List<Integer> listaNumeros = Arrays.asList(numeros);
//        System.out.println(listaNumeros);
//        listaNumeros.set(1,10);
//       // listaNumeros.remove(1);   Esto genera excepcion
//        System.out.println(listaNumeros);
//
//        // Como hacemos para generar una lista dinamica
//
//        List<Integer> solucionLista = new ArrayList<>(listaNumeros);
//        solucionLista.add(50);
//        System.out.println(solucionLista);
//// otra forma de hacerlo que sea dinamica
//        System.out.println();
//        System.out.println("Otra forma de hacerlo dinamico");
//        List<Integer> solucionLista2 = new ArrayList<>();
//        for (Integer elemento: listaNumeros){
//            solucionLista2.add(elemento);
//        }
//        solucionLista2.add(50);
//        solucionLista2.remove(0);
//        System.out.println(solucionLista2);
//
//
//
//        List<String> listaOtra = Arrays.asList("uno", "dos", "tres", "cuatro");
//        int index = 0;
//
//        for (String elemento : listaOtra) {
//            System.out.println("Índice: " + index + ", Valor: " + elemento);
//            index++;
//        }
    }
}
