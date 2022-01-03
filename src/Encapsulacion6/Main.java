package Encapsulacion6;

public class Main {
    public static void main(String[] args) {

        //Ejercicio clase Hermano
//        System.out.println("La variable estatica apellio de la clase Hermano es: " + Hermano.apellido);
//
//        Hermano hermanoMenor = new Hermano();
//        hermanoMenor.nombre = "Adrian";
//        Hermano hermanoMayor = new Hermano();
//        hermanoMayor.nombre = "Julian";
//
//        System.out.println("El hermano menor se llama " + hermanoMenor.nombre + " " + hermanoMenor.apellido);
//        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);
//
//        hermanoMenor.nombre = "Luis";
//        System.out.println("El hermano menor se llama " + hermanoMenor.nombre + " " + hermanoMenor.apellido);
//        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);
//
//        hermanoMenor.apellido = "Vacca";
//        System.out.println("El hermano menor se llama " + hermanoMenor.nombre + " " + hermanoMenor.apellido);
//        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);


        //Ejercicio clase Juego

        Juego juego = new Juego(4);

        Juego.Contador contadorJuego = juego.new Contador();
        System.out.println("La puntuacion del juego inicial es: " + juego.obtenerPuntuacion());

        contadorJuego.incrementarPuntuacion(500);
        System.out.println("La puntuacion del juego en su primer incremento es : " + juego.obtenerPuntuacion());

    }
}
