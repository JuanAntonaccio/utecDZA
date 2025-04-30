package modulo2.laboratorio2;

class Libro extends Publicacion {
    // Atributos específicos de Libro
    private String autor;
    private String editorial;


    public Libro(String titulo, String fechaPublicacion, int numeroPaginas, String autor, String editorial) {
        super(titulo, fechaPublicacion, numeroPaginas);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalle de la publicación");
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }


    public void mostrarInformacion(){
        System.out.println("Información del libro");
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
}
