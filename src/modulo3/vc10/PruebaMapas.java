package modulo3.vc10;

import java.util.HashMap;

public class PruebaMapas {
    public static void main(String[] args) {
        HashMap<String,String> telefonos = new HashMap<>();
        telefonos.put("1","Ana");
        telefonos.put("2","Bob");
        telefonos.put("3","Carlos");
        for(String telefono : telefonos.keySet()){
            String valor = telefonos.get(telefono);
            System.out.println("Clave:"+telefono+" Valor:"+valor);
        }
        telefonos.put("3","Maria");
        for(String telefono : telefonos.keySet()){
            String valor = telefonos.get(telefono);
            System.out.println("Clave:"+telefono+" Valor:"+valor);
        }
    }
}
