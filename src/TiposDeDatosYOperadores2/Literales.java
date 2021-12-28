package TiposDeDatosYOperadores2;

public class Literales {
    public static void main(String[] args) {
        // Declaracion de variables

        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;

        System.out.println("Valor entero decimal: " + enteroDecimal);
        System.out.println("Valor entero octal: " + enteroOctal);
        System.out.println("Valor entero hexadecimal: " + enteroHexadecimal);

        long numeroLong = 100L;
        System.out.println("Valor long: " + numeroLong);

        double numeroDouble = 2.5;
        System.out.println("Valor double: " + numeroDouble);

        float numeroFLoat = 2.5f;
        System.out.println("Valor float: " + numeroFLoat);

        int numeroConGuiones = 25_258_236;
        System.out.println("Valor con guiones: " + numeroConGuiones);

        char miChar = 'b';
        System.out.println("El caracter char es: " + miChar);

        char miChar2 = '\u0062';
        System.out.println("El caracter miChar2 es: " + miChar2);

        char comillaSimple = '\'';

        String stringLiteral = "Esto es un literal";

        boolean booleanoVerdadero = true;

        String stringNulo = null;
    }
}
