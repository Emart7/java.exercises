package OtrosTipoDeDatos;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        Caja<String> caja1 = new Caja<>("hola");

        Integer numero = 5;
        Caja<Integer> caja2 = new Caja<>(numero);

        String miObjeto = "Perro";

        System.out.println("La variable caja1 contiene un objeto cuyo elemento es de la misma clase de mi objeto? " + caja1.pertenecerElContenidoALaMismaClase(miObjeto));
        System.out.println("La variable caja2 contiene un objeto cuyo elemento es de la misma clase de mi objeto? " + caja2.pertenecerElContenidoALaMismaClase(miObjeto));
    }
}
