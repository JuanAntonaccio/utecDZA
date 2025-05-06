package modulo2.claseProducto;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Clases
		
		Producto p1 = new Producto(); // instancia de producto

		System.out.println(p1.toString());

		p1.setCodigo(1);
		p1.setNombre("Fideos");
		p1.setPrecio(52.50);
		p1.setFechaVto(LocalDate.of(2025, 5, 20));
		
		
		System.out.println(p1);




		
		System.out.println("El precio a dolar es "+p1.convertirDolar());
		
		System.out.println("El precio a dolar es "+p1.convertirDolar(40));
		
		Scanner ingreso = new Scanner(System.in);
		System.out.print("Favor ingreso cotizacion del dolar :");
		double dolar = ingreso.nextDouble();
		
		System.out.println("El precio a dolar es "+p1.convertirDolar(dolar));
		
		
		Producto p2 = new Producto(2,"Arroz",47.60,LocalDate.of(2025, 12, 2));
		
		System.out.println(p2);
		
		System.out.println(p2.getNombre());
		
		String prueba = p2.getNombre();
		
		Producto [] misProductos = {p1,p2};
		
		for(int i=0; i<misProductos.length;i++) {
			System.out.print(misProductos[i].getNombre()+" --- ");
			System.out.print(misProductos[i].getPrecio()+" --- ");
			System.out.println(misProductos[i].convertirDolar());
		}
		
		

	}

}
