package OtrosTipoDeDatos6;

public class PracticaConStrings {
    String unString = new String("Soy un String.");

    String otroString = new String(unString);

    String miTecerString = "Soy un nuevo String, y se crea directamente con una cadena.";

    public static void main(String[] args) {
    String miString = "abcde";

    char caracter;
    caracter = miString.charAt(1);
        System.out.println("EL caracter en la posicion 2 es: " + caracter);

        String resultadoConcat = miString.concat("fghi");
        System.out.println("El resultado de la concatenacion es: " + resultadoConcat);

        String concatenacionSecilla = caracter + resultadoConcat;
        System.out.println("El resultado de esta forma de concatenacion es: " + concatenacionSecilla);

        //Comparando cadenas
        System.out.println("Son iguales las concatenaciones? " + concatenacionSecilla.equals(resultadoConcat));

        //Comparando cadenas ignorando si estan en mayusculas o minusculas
        System.out.println("Son iguales las concatenaciones? " + concatenacionSecilla.equalsIgnoreCase(resultadoConcat));
    }
}
