
package eva1.pkg5.foreach;

public class EVA15FOREACH {

    public static void main(String[] args) {
         int[ ] arregloDatos = new int [50];
     for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) (Math.random() * 100);
        }
     // For_Each
     // Se usa para imprimir todos los datos de un arreglo
        for (int arregloDato : arregloDatos) {
            System.out.print("[" + arregloDato + "]");
        }

    }
    
}
