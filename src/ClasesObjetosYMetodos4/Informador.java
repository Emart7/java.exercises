package ClasesObjetosYMetodos4;

public class Informador {
    //EJERCICIO 6 - SOBRE CARGA DE METODOS

    //CONSTANTES
    public static final String COLOR_POR_DEFECTO = "\u001B[0m";
    public static final String COLOR_NEGRO = "\u001B[30m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_VERDE = "\u001B[32m";
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_AZUL = "\u001B[34m";


    //SOBRE CARGA DE METODOS
    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero " + entero);
    }

    void mostarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal " + decimal);
    }
    void mostarPorPantalla(String palabra){
        System.out.println("Mostrando la palabra " + palabra);
    }
    void mostarPorPantalla(String palabra, String color){
        System.out.println(color + "Mostrando la palabra con color " + COLOR_POR_DEFECTO);
    }


}
