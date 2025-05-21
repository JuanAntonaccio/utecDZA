package modulo1.stringBuilder;

public class Prueba {

	public static void main(String[] args) {
		// Prueba de la clase Mutable StringBuilder
		// Recordamos que la clase String era inmutable
		
		String a = "Hola Mundo";
		for (int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
			
		}
		//          0123456789
		String s = "1234567890";      
        s = separarMiles(s);
        System.out.println(s);

	}

	private static String separarMiles(String s) {
		//creamos un StringBuilder a partir del String s                                                          
        StringBuilder aux = new StringBuilder(s);
  
        //le damos la vuelta
        aux.reverse();
        //                   0123456789
        //numero dado vuelta 0987654321 
  
        //variable que indica donde insertar el siguiente punto                                                   
        int posicion = 3;
  
        //mientras no lleguemos al final del n�mero
        while(posicion < aux.length()){
            //insertamos un punto en la posici�n
            aux.insert(posicion,'.');
            //siguiente posici�n donde insertar
            posicion+=4;
        }
  
        //le damos de nuevo la vuelta
        aux.reverse();
  
        //el StringBuilder se pasa a String y se devuelve                                                         
        return aux.toString();
		
	}
	
	

}
