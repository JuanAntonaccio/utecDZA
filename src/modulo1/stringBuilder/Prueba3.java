package modulo1.stringBuilder;

public class Prueba3 {

	public static void main(String[] args) {
		// Pruebas con la clase StringBuilder
		
		StringBuilder a = new StringBuilder(5);
        a.append("Hola como estan pasando");
        
		System.out.println(a);
		
		a.append(" Bien por suerte ");
		
		System.out.println(a);
		
		a.append(1250);
		
		System.out.println(a);
		
		System.out.println(a.capacity());
		
		System.out.println(a.indexOf("2"));
		a.insert(41,".");
		
		System.out.println(a);
		
		a.setCharAt(0,'T');
		
		System.out.println(a);
		

	}

}
