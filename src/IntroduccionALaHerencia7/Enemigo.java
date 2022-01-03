package IntroduccionALaHerencia7;

public class Enemigo extends Personaje{
    private static final int PUNTOS_DE_DANO = 10;

    public Enemigo(int posicionX, int PosicionY){
        super(posicionX,PosicionY);
    }

    public int obtenerPuntosDeDano(){
        return PUNTOS_DE_DANO;
    }

    public void emitirSonidoDeFuria(){
        System.out.println("grrrr");
    }
}
