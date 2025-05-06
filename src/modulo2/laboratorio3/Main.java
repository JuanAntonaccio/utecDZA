package modulo2.laboratorio3;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Vehiculo utilizando constructor sin parámetros
        Vehiculo vehiculoGenerico = new Vehiculo();
        System.out.println("Información del Vehículo Genérico:");
        vehiculoGenerico.mostrarInformacion();
        System.out.println();

        // Crear instancia de Vehiculo utilizando constructor con parámetros
        Vehiculo vehiculoPersonalizado = new Vehiculo("Toyota", "Corolla", 2022);
        System.out.println("Información del Vehículo Personalizado:");
        vehiculoPersonalizado.mostrarInformacion();
        System.out.println();

        // Crear instancia de Moto utilizando constructor con parámetros
        Moto motoCustom = new Moto("Harley-Davidson", "Sportster", 2021, 1200);
        System.out.println("Información de la Moto Custom:");
        motoCustom.mostrarInformacion();
    }

}
