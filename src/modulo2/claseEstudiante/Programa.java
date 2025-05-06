package modulo2.claseEstudiante;
// En este programa vamos a utilizar las Clases
//

public class Programa {

	public static void main(String[] args) {
		
		
		Estudiante e1;
		e1 = new Estudiante();
		
		String nombreE1 = e1.getNombre();
		System.out.println("El nombre del estudiante e1 es "+nombreE1);
		e1.cedula=123458;// no es una buena practica
		System.out.println("La cedula es: "+e1.cedula);
		System.out.println();
		System.out.println("La cedula es:"+ e1.getCedula());
		e1.setCedula(1234567);
		e1.setCodigo("cod2050");
		e1.setNacimientoYear(1999);
		e1.setNombre("Karen");
		System.out.println("El nombre del estudiante e1 es "+e1.getNombre());
		System.out.println(e1);
		
		
		
		Estudiante e2;
		e2= new Estudiante("cod15","Ana",43254555,1995);
		String nombreE2 = e2.getNombre();
		int cedulaE2 = e2.cedula;
		int edad=e2.calcularEdad(2025);

		System.out.println(nombreE2+" tiene "+edad+" años");

//		Estudiante e3;
//		e3= new Estudiante("cod32","Gabriel",111111,2002);
//
//		Estudiante[] estudiantes = {e1,e2,e3};
//
//		for(int i=0;i<estudiantes.length;i++) {
//			System.out.println(estudiantes[i]);
//		}
		

	}

}
