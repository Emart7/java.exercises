package Encapsulacion6;

public class Hermano {
    String nombre;
    static String apellido = "Martinez";

    static String obtenerApellido(){
        return apellido;
    }

    static void modificarApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }
}
