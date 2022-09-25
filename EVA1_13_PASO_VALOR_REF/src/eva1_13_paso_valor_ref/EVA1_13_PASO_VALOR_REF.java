
package eva1_13_paso_valor_ref;

public class EVA1_13_PASO_VALOR_REF {

    public static void main(String[] args) {

        int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado = " + valorPrueba);
        
        PruebaValor prueba = new PruebaValor();
        prueba.x= 100;
        System.out.println("Valor (obj) = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado (obj)= " + prueba.x);
        
    }
    public static void incVal(int valor) {
        valor++;
        
    }
      public static void incVal(PruebaValor pruebaVal) {
        pruebaVal.x++;
    
}

}
class PruebaValor{
    int x;
}