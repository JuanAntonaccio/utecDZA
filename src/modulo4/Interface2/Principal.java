package modulo4.Interface2;

public class Principal {

	public static void main(String[] args) {
		// Testeamos las clases creadas de diferentes juegos
		
		Juego j1 = new JuegoCartas();
		j1.iniciar();
		j1.jugar();
		j1.terminar();
		
		Juego j2 = new JuegoAdivinar();
		
		j2.iniciar();
		j2.jugar();
		j2.terminar();
		
		System.out.println("fin del programa, gracias por utilizar nuestro juego");
        
	}

}
