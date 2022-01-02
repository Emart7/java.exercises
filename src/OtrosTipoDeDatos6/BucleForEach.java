package OtrosTipoDeDatos6;

public class BucleForEach {
    public static void main(String[] args) {
        int [] numeros = {3, 45, 23, 64, 2, 34, -4, -56};

        int menor, mayor;

        menor = mayor = numeros[0];

        for(int i = 0; i <= numeros.length -1; i ++){
            if(numeros[i] > mayor) mayor = numeros[i];
            if(numeros[i] > menor) menor = numeros[i];
        }
        System.out.println("El valor minimo del array es: " + menor + " y el minimo es: " + menor);

        menor = mayor = numeros[0];
        for (int entero:numeros){
            System.out.println("En esta iteracion, entero tiene valor   de: " + entero);
            if (entero > mayor) mayor = entero;
            if (entero < menor) menor = entero;
            }
        System.out.println("El valor minimo del array es: " + menor + " y el minimo es: " + menor);

        int [][] arrayDeDosDimensiones = {{8,2,6},{-6,3,0},{-10,6,6}};
        for (int[] arrayDeUnaDimension: arrayDeDosDimensiones){
            System.out.println("En esta iteracion");
        }
    }

    }
