package OtrosTipoDeDatos;

public class ArraysDeUnaDimension {
    public static void main(String[] args) {

        //Creando un array [cantidad de espacio en memoria]
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "lunes";
        diasDeLaSemana[1] = "martes";
        diasDeLaSemana[2] = "miercoles";
        diasDeLaSemana[3] = "jueves";
        diasDeLaSemana[4] = "viernes";
        diasDeLaSemana[5] = "sabado";
        diasDeLaSemana[6] = "domingo";

        //Consultar un array
        System.out.println("El primer dia de la semana es: " + diasDeLaSemana[0]);

        //El contenido en llaves
        int numeros[] = {3, 43, 65, 4, 34, 8, -2};

        //Declaracion de variables
        int minimo, maximo;

        //Obtener el menor y el mayor numero del array
        minimo = maximo = numeros[0];
        for (int i = 0; i <= numeros.length -1; i++) {
            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        }
        System.out.println("El valor minimo del array es: " + minimo + " y el elemento maximo es: " + maximo);

        double[] miArrayDeDoubles = {2.3, 3.5, 4.9, 5.4};
    }
}
