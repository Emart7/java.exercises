public class Casteo {
    public static void main(String[] args) {
        int variableDeTipoInt = 10;
        float variableDeTipoFloat = variableDeTipoInt;
        double variableDeTipoDouble = variableDeTipoFloat;

        double otraVariableDeTipoDouble = 2.76;

        int otraVariableDeTipoInt = (int) otraVariableDeTipoDouble;

        System.out.println("El resultado es: " + otraVariableDeTipoInt);

        byte variable1 = 5;
        byte variable2 = 10;

        byte suma = (byte) (variable1 + variable2);
        System.out.println("El resultado del casteo a byte es:" + suma);
    }
}
