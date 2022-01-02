package OtrosTipoDeDatos;

import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {

        ArrayList<String> miListaDeLaCompra = new ArrayList<>();
        miListaDeLaCompra.add("Papas");
        miListaDeLaCompra.add("Cebolla");
        miListaDeLaCompra.add("Tomate");
        miListaDeLaCompra.add("Cilantro");

        System.out.println("La lista contiene: " + miListaDeLaCompra);

        ArrayList<String> nuevaLista = new ArrayList<>(miListaDeLaCompra);
        nuevaLista.add("Granos");

        System.out.println("Mi lista inicial es: " + miListaDeLaCompra + " y mi lista actual es: " + nuevaLista);

        //En este caso si hay que tener cuidado porque cambia la lista.
        ArrayList<String> miListaDeEnero = miListaDeLaCompra;

        // Obteniendo el primer elemento de la lista
        System.out.println("El pirmer elemento de la mi ultima lista es: " + nuevaLista.get(0));

        //Actualizando la lista en el segundo elemento.
        miListaDeEnero.set(1,"Frijol");
        System.out.println("La lista de enero actual es: " + miListaDeEnero);

        //Eliminando un elemento de la lista segun su posicion.
        miListaDeEnero.remove(0);
        System.out.println("La lista de enero actual es: " + miListaDeEnero);

        //Eliminando un elemento de la lista segun el objeto.
        miListaDeEnero.remove("Cilantro");
        System.out.println("La lista de enero actual es: " + miListaDeEnero);

        miListaDeEnero.size();
    }
}
