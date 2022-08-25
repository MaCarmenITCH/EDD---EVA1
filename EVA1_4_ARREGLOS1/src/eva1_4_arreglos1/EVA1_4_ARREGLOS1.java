
package eva1_4_arreglos1;

public class EVA1_4_ARREGLOS1 {

    public static void main(String[] args) {
        int [ ] arregloEdades, arregloSalario, arregloCali;
        // Solo arreglo promedio es arreglo
        double arregloPromedio [ ], porcentaje;
        // LOS ARREGLOS SON OBJETOS   
        arregloEdades = new int [50];
        System.out.println(arregloEdades);
        
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "]  =  " + arregloEdades[i]);

        }
    }
    
}
