
package eva1.pkg11.ejemplos.arreglos;

import java.util.Scanner;

public class EVA1_11_EJEMPLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arregloCali[][];
        //primer dimension -> grupos
        //segunda dimension -> estudiantes por grupo
        //Determinar los grupos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de grupos: ");
        int iGpos = input.nextInt();
        arregloCali = new int[iGpos][];
        
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Cuantos estudiantes hay en el grupo " + (i + 1));
            int iEstu = input.nextInt();
            arregloCali[i] = new int[iEstu];
            for (int j = 0; j < arregloCali[i].length; j++) {
                arregloCali[i][j] = input.nextInt();
            }

        }
        for (int i = 0; i < arregloCali.length; i++) {
            for (int j = 0; j < arregloCali[i].length; j++) {

            }
        }

    }

}
