package modulo2.laboratorio2;

class Publicacion {
    // Atributos
    protected String titulo;
    protected String fechaPublicacion;
    protected int numeroPaginas;


    // Constructor
    public Publicacion(String titulo, String fechaPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos si son necesarios

    public void mostrarDetalles(){
        System.out.println("Detalle de la publicación");
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
