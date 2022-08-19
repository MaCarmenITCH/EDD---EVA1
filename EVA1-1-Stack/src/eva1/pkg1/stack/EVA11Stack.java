
package eva1.pkg1.stack;


public class EVA11Stack {

    public static void main(String[] args) {
        // Matodos estaticos --> no ocupan instanciaciòn
        System.out.println("Inicia Main");
        A();
        System.out.println("Retoma ejecuciòn Main");
        System.out.println("Termina Main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Retoma ejecuciòn A");
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        int i = 1;
        double d = 10.0;
        System.out.println("TErmina B");
    }
    
}

// El Heap almacena los objetos, y la direcciòn de los mismos se almacena en el stack. La variable 
// objeto ùnicamente almacena su direcciòn