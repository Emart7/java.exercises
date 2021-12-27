public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int numeroDos = 2;
        int numeroTres = 3;

        int resultadoSuma = numeroDos + numeroTres;
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = numeroTres - numeroDos;
        System.out.println("El resultado de la resta es: " + resultadoResta);

        int numeroDosConCambioDeSigno = -numeroDos;

        System.out.println("Si aplicamos el operador de cambio de signo, el resultado es: " + numeroDosConCambioDeSigno);

        double resultadoMultiplicacion = numeroTres * 3.5;
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        double resultadoDivision = (double) numeroDos / numeroTres;
        System.out.println("El resultado de la division es: " + resultadoDivision);

        int resultadoModulo = numeroTres % numeroDos;
        System.out.println("El resultado del modulo es: " + resultadoModulo);
    }
}
