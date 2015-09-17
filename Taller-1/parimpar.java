/**
 * @(#)parimpar.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;
public class parimpar {

    public parimpar() {
    }
    public void ejercicioEnte(){
    	int num1;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Digite primer numero");
    	int lect1= sc.nextInt();
    	num1 = lect1;	
    	int num2;
    	System.out.println("Digite segundo numero");
    	int lect2= sc.nextInt();
    	num2 = lect2;
    	
    	if(num1 % 2 ==0){
    		System.out.println("El numero " + num1 + " es par");
    	}else{
    		System.out.println("El numero " + num1 + " es impar");
    	}
    	if(num2 % 2 ==0){
    		System.out.println("El numero " + num2 + " es par");
    	}else{
    		System.out.println("El numero " + num2 + " es impar");
    	}
    	
    	
    	if(num1 > num2){  
        	if(num1%num2 == 0)  
        		System.out.println("El numero " + num1 + " es multiplo de " + num2);
        	else  
				System.out.println("El numero " + num1 + " no es multiplo de " + num2);  
    	}else{  
        	if(num2%num1 == 0)  
        		System.out.println("El numero " + num2 + " es multiplo de " + num1);
        	else  
				System.out.println("El numero " + num2 + " no es multiplo de " + num1);
    		}  
    	
    	}
    
}
