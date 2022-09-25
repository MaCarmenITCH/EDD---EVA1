
package eva1_15_copia_arreglos;

public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        int[] arregloCopia = new int [arregloDatos.length];
        System.out.print("");
       System.out.print(arregloDatos);
        System.out.print(arregloCopia);
        //int cont = arregloDatos.length -1;
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] = arregloDatos[(arregloDatos.length - 1) - i];

        }

        //imprimir
        imprimir(arregloCopia);

    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }

    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");

        }
    }
}
