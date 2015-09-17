/**
 * @(#)Ejecutable.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;
public class Ejecutable {
	
    public static void main (String args [] ) {
    	System.out.println("______________________________________");
    	System.out.println("Digite una opcion");
    	System.out.println("Digite 1 para ejercicio Integers");
    	System.out.println("Digite 2 para ejercicio Spaces");
    	System.out.println("Digite 3 para ejercicio	Average");
    	System.out.println("Digite 4 para ejercicio ATM");
    	System.out.println("Digite 5 para ejercicio Prime Numbers");
    	System.out.println("Digite 6 para salir");
    	System.out.println("______________________________________");
    	int opcion;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Digite numero: ");
    	int lectopc= sc.nextInt();
    	opcion = lectopc;	
    	if(opcion==1){
    		parimpar pi = new parimpar();
    		pi.ejercicioEnte();	
    	}else	if(opcion==2){
    				separar se = new separar();
    				se.ejerciSpac();
    		}else if(opcion==3){
    				promedio pro = new promedio();
    				pro.prom();	
    			}else	if(opcion==4){
    						banco ban = new banco();
    						ban.retiro();
    		
    					}else if(opcion==5){
    							primos prim= new primos();
    							prim.nump();
    		
    						} else if(opcion==6){
    								System.exit(0); 
    		
    							}else    							
    			    				System.out.println("Opcion no valida");
    		

    }
    
}   
