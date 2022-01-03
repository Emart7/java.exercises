package IntroduccionALaHerencia7;

public class Main {
    public static void main(String[] args) {

//        //Ejercicios con clase Personajes y Animales
//        Animal perro = new Animal("Lupus",4);
//        Animal otroPerro = new Animal("Lupus",4);
//        Animal gato = new Animal("silvestre",4);
//
//        System.out.println("Es igual el objeto de gato que el de perro? " + perro.equals(otroPerro));
//
//        System.out.println("Hashcode para perro: " + perro.hashCode());
//        System.out.println("Hashcode para gato: " + gato.hashCode());
//        System.out.println("Hashcode para otroPerro: " + otroPerro.hashCode());
//
//        System.out.println("Nuestro objeto perro en forma de String: " + perro.toString());


        //Ejemplos de las clases Reproductor
        ReproductorDeVideo reproductorDeVideo = new ReproductorDeVideo();
        reproductorDeVideo.reproducir();
        reproductorDeVideo.adelantar(5);
        reproductorDeVideo.rebobinar(5);
        reproductorDeVideo.pausar();
        reproductorDeVideo.parar();

        ReproductorDeAudio reproductorDeAudio = new ReproductorDeAudio();
        reproductorDeAudio.reproducir();
        reproductorDeAudio.adelantar(5);
        reproductorDeAudio.pausar();
        reproductorDeAudio.rebobinar(5);
        reproductorDeAudio.parar();

    }
}
