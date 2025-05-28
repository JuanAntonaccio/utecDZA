package modulo4.interfaces;



public interface GestionPersona {
    //CRUD - Create Read Update Delete
    static final double DOLAR = 41;
    public void altaPersona(Persona persona);
    public void bajaPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void mostrarPersona(Persona persona);
    public void motrarTodos();
}
