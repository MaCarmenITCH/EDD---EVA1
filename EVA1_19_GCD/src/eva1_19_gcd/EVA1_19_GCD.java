
package eva1_19_gcd;


public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(gcd(181, 7));
    }
    
    
    public static int gcd(int dividiendo, int divisor){
        int residuo;
        residuo= dividiendo%divisor;
        
        if (residuo == 0){ 
        return divisor;
        
    } else{
            return gcd(divisor, residuo);
            
            }
    }
}
