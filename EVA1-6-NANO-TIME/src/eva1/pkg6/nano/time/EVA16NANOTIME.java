
package eva1.pkg6.nano.time;

public class EVA16NANOTIME {

    public static void main(String[] args) {
  long ini =System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
