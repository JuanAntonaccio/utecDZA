package modulo2.laboratorio2;

class Articulo extends Publicacion {

    // Atributos específicos de Artículo
    private String autor;
    private boolean revista;

    public Articulo(String titulo, String fechaPublicacion, int numeroPaginas, String autor, boolean revista) {
        super(titulo, fechaPublicacion, numeroPaginas);
        this.autor = autor;
        this.revista = revista;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalle de la publicación");
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Autor: " + autor);
        System.out.println("Revista: " + revista);
    }


    public void mostrarInformacion(){
        System.out.println("Información del artículo");
        System.out.println("Autor: " + autor);
        System.out.println("Revista: " + revista);
    }
}
