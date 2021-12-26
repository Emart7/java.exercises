public class TiposDeDatosPrimitivos {
    public static void main(String[] args) {
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;

        //Tipo de dato byte
        System.out.println();
        System.out.println("El tipo byte es un numero entero de 8 bits, es: " + elMenorByte);
        System.out.println("El tipo byte es un numero entero de 8 bits, es: " + elMayorByte);
        //Tipo de dato short
        System.out.println();
        System.out.println("El tipo short es un numero entero de 16 bits, es: " + Short.MIN_VALUE + elMenorByte);
        System.out.println("El tipo short es un numero entero de 16 bits, es: " + Short.MAX_VALUE + elMayorByte);
        //Tipo de dato int
        System.out.println();
        System.out.println("El tipo int es un numero entero de 32 bits, es: " + Integer.MIN_VALUE + elMenorByte);
        System.out.println("El tipo int es un numero entero de 32 bits, es: " + Integer.MAX_VALUE + elMayorByte);
        //Tipo de dato long
        System.out.println();
        System.out.println("El tipo long es un numero entero de 64 bits, es: " + Long.MIN_VALUE + elMenorByte);
        System.out.println("El tipo long es un numero entero de 64 bits, es: " + Long.MAX_VALUE + elMayorByte);

        //Tipo de dato float
        float variableFloat = 5.6f;

        //Tipo de dato double
        double variableDouble = 5.6;

        //Tipo de dato char
        char variableChar = 'a';

        //Tipo de dato boolean
        boolean trueBoolean = true;
        boolean falseBoolean = false;
    }
}
