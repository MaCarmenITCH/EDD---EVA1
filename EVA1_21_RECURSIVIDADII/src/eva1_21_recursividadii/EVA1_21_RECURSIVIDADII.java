
package eva1_21_recursividadii;

public class EVA1_21_RECURSIVIDADII {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MAIN " + A());
    }
    public static String A(){
        return "A " + B();
    }
    public static String B(){
    return "B " + C();
}
    public static String C(){
    return "C";
    }
    
}