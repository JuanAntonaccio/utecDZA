package modulo2.claseProducto;


import java.time.LocalDate;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private LocalDate fechaVto;
	
	 
	// Constructores

	public Producto(int codigo, String nombre, double precio, LocalDate fechaVto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaVto = fechaVto;
	}

	public Producto() {
	}


// Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaVto() {
		return fechaVto;
	}

	public void setFechaVto(LocalDate fechaVto) {
		this.fechaVto = fechaVto;
	}


	// metodo para imprimir los datos de la clase toString


	@Override
	public String toString() {
		return "Producto{" +
				"codigo=" + codigo +
				", nombre='" + nombre + '\'' +
				", precio=" + precio +
				", fechaVto=" + fechaVto +
				'}';
	}

	// metodo particular
	public double convertirDolar() {
		double dolar=38.50;
		return this.precio/dolar;
	}


	
	//overloading de métodos
	public double convertirDolar(double dolar) {
		return this.precio/dolar;
	}
	
	
	
	
	
	
	
	
	
	

}
