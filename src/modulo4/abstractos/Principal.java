package modulo4.abstractos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Probando el método abstracto
		
		String color="rojo";
		double lado,base,altura;
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca lado del cuadrado :");
		lado=input.nextDouble();
		System.out.print("Introduzca base del triángulo :");
		base=input.nextDouble();
		System.out.print("Introduzca altura del triángulo :");
		altura=input.nextDouble();
		Cuadrado c1 = new Cuadrado(color,lado);
		Triangulo t1 = new Triangulo("verde",base,altura);
		System.out.printf("Area cuadrado %s es: %.2f %n", c1.getColor(), c1.calcularArea());
		System.out.println();
		System.out.printf("Area triángulo %s es: %.2f %n", t1.getColor(), t1.calcularArea());
		// Si quiero hacer referenciado a la clase abstrac  Figura
		Figura f1 = new Triangulo("azul",10,5);
		Figura f2 = new Cuadrado("amarillo",20);
		List<Figura> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		for (Figura f : lista) {
			System.out.println(f.calcularArea());
		}
        lista.remove(f1);
		for (Figura f : lista) {
			System.out.println(f.calcularArea());
		}

	}

}
