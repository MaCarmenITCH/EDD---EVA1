
package eva1_16_ejercicio_arreglos;

public class EVA1_16_EJERCICIO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arregloElementos = new int[50];
        int[] arregloCopia =new int [50];
        
        for (int i = 0; i < arregloElementos.length; i++) {
            arregloElementos[i] = ((int) (Math.random() * 100)) + 1;
            System.out.print(arregloElementos[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < arregloElementos.length; i++) {
            if (arregloElementos[i] % 2 == 0) {

            }

        }

    }

}
