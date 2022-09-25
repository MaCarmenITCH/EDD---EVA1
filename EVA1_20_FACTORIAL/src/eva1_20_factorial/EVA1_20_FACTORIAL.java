
package eva1_20_factorial;

public class EVA1_20_FACTORIAL {
   
    public static void main(String[] args) {
        
        System.out.println(factorial(100));
    }
    
    public static int factorial(int valor){
        //factorial(0) -> 1
        if (valor ==0)
            return 1;
        else
            return valor * factorial(valor-1);
           
    }
}
