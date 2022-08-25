
package eva1.pkg3.heap;

public class EVA13HEAP {

    public static void main(String[] args) {
     int x = 10;
        
        //obj y obj2 guardan referencias, en java las direcciones de memoria se les llama referencias y en otros lenguajes apuntadores
        
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    
    }
    
}
class Prueba {
    public int valor=100;
}
