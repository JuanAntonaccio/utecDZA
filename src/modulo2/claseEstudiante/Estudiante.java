package modulo2.claseEstudiante;

import java.util.Calendar;
import java.util.Date;

public class Estudiante {

    public String codigo; // no es una buena practica
    private String nombre;
    public int cedula;
    public int nacimientoYear;

    // En este ejemplo nuestra clase tiene 2 constructores
    // Creando el constructor sin parametros
    public Estudiante() {
        this.codigo = "";
        this.nombre = "no tiene";
        this.cedula = 0;
        this.nacimientoYear = 0;
    }

    // Otro constructor con parametros
    public Estudiante(String codigo, String nombre, int cedula, int nacimientoYear) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.nacimientoYear = nacimientoYear;
    }

    public Estudiante(String codigo, String nombre, int cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // sobrecarga de metodos

    public int calcularEdad(int anio) {

        return anio - this.nacimientoYear;
    }

    // Java soporta Overloading de metodos
    // Son metodos de igual nombre pero con distintos parametros

    public int calcularEdad() {
        Calendar cal = Calendar.getInstance();
        // Se utiliza Calendar para trabajar con fechas
        // Obtengo el a�o actual a traves de Calendar
        int year = cal.get(Calendar.YEAR);
        return year - this.nacimientoYear;
    }

    // Otro metodo usando el Overloading
    public int calcularEdad(Date date) {
        Calendar cal = Calendar.getInstance();
        // Setea en Calendar que la fecha es la pasada por parametro
        cal.setTime(date);
        // En Year queda almacenado el a�o de la fecha pasada por paramentro
        int year = cal.get(Calendar.YEAR);

        return year - this.nacimientoYear;
    }
    // getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNacimientoYear() {
        return nacimientoYear;
    }

    public void setNacimientoYear(int nacimientoYear) {
        this.nacimientoYear = nacimientoYear;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", nacimientoYear=" + nacimientoYear +
                '}';
    }
}
