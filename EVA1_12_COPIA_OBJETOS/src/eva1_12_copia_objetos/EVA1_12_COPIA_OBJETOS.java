
package eva1_12_copia_objetos;


public class EVA1_12_COPIA_OBJETOS {

    public static void main(String[] args) {

        int valor, copiaValor;
        
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        
        //ahora con objetos
        PruebaValor prueba =new PruebaValor ();  
        
        // prueba , pruebacopia son objetos
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor ();
        pruebaCopia = prueba;
        System.out.println("AHORA CON OBJETO");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba Copia " + pruebaCopia.x);
        prueba.x++;     
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba Copia "+ pruebaCopia.x);
    }
    
}
class PruebaValor{
    int x;
}