package modulo1.stringBuilder;

public class Prueba2 {

	public static void main(String[] args) {
		// Ejemplo de la clase StringBuilder que es mutable
		String s = "cadena";
        long t1, t2;
        int n = 100000;
       
        System.out.print("Concatenar " + n + " cadenas con String: ");
        t1 = System.currentTimeMillis();
        concatenar(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2-t1) + " milisegundos");
       
        System.out.print("Concatenar " + n + " cadenas con StringBuilder: ");
        t1 = System.currentTimeMillis();
        concatenar1(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2-t1) + " milisegundos");
       
        System.out.print("Concatenar " + n + " cadenas con StringBuilder Optimizado: ");                          
        t1 = System.currentTimeMillis();
        concatenar2(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2-t1) + " milisegundos");

	}
	
	//m�todo que concatena n cadenas usando la clase String
    public static String concatenar(String s, int n) {
        String resultado = s;
        for (int i = 1; i < n; i++) {
            resultado = resultado + s;
        }
        return resultado;
    }

    //m�todo que concatena n cadenas usando la clase StringBuilder                                                
    public static String concatenar1(String s, int n) {
        StringBuilder resultado = new StringBuilder(s);
        for (int i = 1; i < n; i++) {
            resultado.append(s);
        }
        return resultado.toString();
    }

    //m�todo optimizado que concatena n cadenas usando la clase StringBuilder
    //se crea un StringBuilder inicial con el tama�o total del String resultante                                  
    public static String concatenar2(String s, int n) {
        StringBuilder resultado = new StringBuilder(s.length() * n);
        for (int i = 0; i < n; i++) {
            resultado.append(s);
        }
        return resultado.toString();
    }

}
