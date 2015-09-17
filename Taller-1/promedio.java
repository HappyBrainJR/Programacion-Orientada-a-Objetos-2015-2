* @(#)promedio.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;
public class promedio {

    public promedio() {
    }
    public void prom(){
    	System.out.println("Digite los numeros que desea promediar (9999 para terminar):");
        int num = 0, cantidad = 0, suma = 0, promedio = 0;       
        while (num != 9999){
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Digite el " +(cantidad+1) +" numero: ");
    	num = sc.nextInt();
    	cantidad = cantidad+1;
    	suma = suma + num;
    	}
        promedio = (suma-9999)/(cantidad-1);
        System.out.println("El promedio es: " +promedio );
        
    }
}
