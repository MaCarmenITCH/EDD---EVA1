
package eva1_8_arreglos_objetos;

public class EVA1_8_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        Prueba[ ] arregloPrueba = new Prueba [ 20 ];
        for (int i = 0; i < arregloPrueba.length; i++) {
            //Clase identificador = new Clase ();
            arregloPrueba[i]= new Prueba();
        }
        // Leer x
        for (Prueba prueba :arregloPrueba) {
            System.out.println(prueba.x);
        }
   
    }
    
}
class Prueba{
    int x = 100;
}
