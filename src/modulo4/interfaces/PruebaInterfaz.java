package modulo4.interfaces;



public class PruebaInterfaz {
    public static void main(String[] args) {
        Gestion g = new Gestion();
        Persona p1 = new Persona("Carlos",27);
        g.altaPersona(p1);
        g.altaPersona(new Persona("Teresa",40));
        g.motrarTodos();

    }
}
