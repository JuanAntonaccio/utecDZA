package modulo4.interfaces;



import java.util.ArrayList;
import java.util.List;

public class Gestion implements GestionPersona{
    List<Persona> personas = new ArrayList<Persona>();
    @Override
    public void altaPersona(Persona persona) {
        personas.add(persona);
    }

    @Override
    public void bajaPersona(Persona persona) {
        personas.remove(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        int indice=-1;
        for (int i = 0; i <personas.size() ; i++) {
            if(personas.get(i).equals(persona)){
                indice=i;
                break;
            }
        }
        if(indice!=-1){
            personas.set(indice,persona);
        }

    }

    @Override
    public void mostrarPersona(Persona persona) {
        int indice=-1;
        for (int i = 0; i <personas.size() ; i++) {
            if(personas.get(i).equals(persona)){
                indice=i;
                break;
            }
        }
        if(indice!=-1){
            System.out.println(personas.get(indice));;
        }
    }

    @Override
    public void motrarTodos() {
        for(Persona p: personas){
            System.out.println(p);
        }

    }
}
