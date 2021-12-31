package ClasesObjetosYMetodos4;

import java.security.cert.CertificateNotYetValidException;

public class Inferencia {
    public static void main(String[] args) {
        var numero = 3.3;
        var palabra = "casa";

        System.out.println("La variable palabra es de tipo: " + palabra.getClass().getSimpleName());

        var certificateNotYetValidException = new CertificateNotYetValidException();

        String property = System.getProperty("os.name");

        /*
        No se puede usar "var" en variables sin inicializar, en arrays,
        asignando un valor a varias variable.
         */
    }

}
