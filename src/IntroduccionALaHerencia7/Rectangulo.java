package IntroduccionALaHerencia7;

public class Rectangulo extends Figura2D{
    private double anchura;

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    private double altura;

    @Override
    public double obtenerArea() {
        return anchura * altura;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * anchura + 2 * altura;
    }
}
