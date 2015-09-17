  /**
 * @(#)primos.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;
public class primos {

    public primos() {
    	
    }
    public void nump(){
    	int contador =2;
    	boolean primo;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Digite un numero");
    	int lect1= sc.nextInt();    	  	   	
    		while(contador<=lect1){
    			primo = true;
    			for(int i=2;i<=contador/2;i++){  
         			if(contador%i==0)  
             		primo=false; 
            	}
            	if(primo==true){ 	
            		System.out.println(contador);		 
            	}
            	contador = contador + 1;		 
         	}  	
    }
}
