package modulo1.stringBuilder;

public class ModificandoCaracteres {
    public static void main(String[] args) {
        // Cadena original
        String original = "Casa blanca";
        // Crear un StringBuilder a partir del String original para poder modificarlo
        StringBuilder stringBuilder = new StringBuilder(original);

        // Recorrer todos los caracteres del StringBuilder
        for (int i = 0; i < stringBuilder.length(); i++) {
            // Si el carácter actual es 'a', reemplazarlo por 'e'
            if (stringBuilder.charAt(i) == 'a') {
                stringBuilder.setCharAt(i, 'e');
            }
        }

        // Convertir el StringBuilder de vuelta a String
        String modificadoString = stringBuilder.toString();

        // Mostrar el String original y el modificado
        System.out.println("Original: " + original);
        System.out.println("Modificado: " + modificadoString);
    }
}
