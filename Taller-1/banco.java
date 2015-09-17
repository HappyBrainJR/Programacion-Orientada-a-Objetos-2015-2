/**
 * @(#)banco.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;
public class banco {

    public banco() {
    }
    public void retiro(){
    	int valoReti;
    	//int pri, val1, seg = 0;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Digite valor del retiro");
    	int LectReti= sc.nextInt();
    	if(LectReti%50!=0){
    		System.out.println("Valor no permitido");
    	}else{
    		int pri= LectReti%50000;//Modulo para sacar el sobrante
    		int val1= LectReti-pri;//Resto el sobrante al valor digitado
    		int seg= val1/50000;//divido y me dara la cantidad de billetes de 50000
    		//---------------------------------------------------------------------
    		int pri2= pri%20000;//modulo para sacar sobrante
    		int val2= pri-pri2;//Resto el sobrante al valor digitado
    		int seg2=val2/20000;//divido y me dara la cantidad de billetes de 20000
			//---------------------------------------------------------------------
			int pri3= pri2%10000;//modulo para sacar sobrante
    		int val3= pri2-pri3;//Resto el sobrante al valor digitado
    		int seg3=val3/10000;//divido y me dara la cantidad de billetes de 10000
			//---------------------------------------------------------------------
			int pri4= pri3%5000;//modulo para sacar sobrante
    		int val4= pri3-pri4;//Resto el sobrante al valor digitado
    		int seg4=val4/5000;//divido y me dara la cantidad de billetes de 5000
			//---------------------------------------------------------------------
			int pri5= pri4%2000;//modulo para sacar sobrante
    		int val5= pri4-pri5;//Resto el sobrante al valor digitado
    		int seg5=val5/2000;//divido y me dara la cantidad de billetes de 2000
			//---------------------------------------------------------------------
			int pri6= pri5%1000;//modulo para sacar sobrante
    		int val6= pri5-pri6;//Resto el sobrante al valor digitado
    		int seg6=val6/1000;//divido y me dara la cantidad de billetes de 1000
			//---------------------------------------------------------------------
			int pri7= pri6%500;//modulo para sacar sobrante
    		int val7= pri6-pri7;//Resto el sobrante al valor digitado
    		int seg7=val7/500;//divido y me dara la cantidad de monedas de 500
			//---------------------------------------------------------------------
			int pri8= pri7%200;//modulo para sacar sobrante
    		int val8= pri7-pri8;//Resto el sobrante al valor digitado
    		int seg8=val8/200;//divido y me dara la cantidad de monedas de 200
			//---------------------------------------------------------------------
			int pri9= pri8%100;//modulo para sacar sobrante
    		int val9= pri8-pri9;//Resto el sobrante al valor digitado
    		int seg9=val9/100;//divido y me dara la cantidad de billetes de 100
			//---------------------------------------------------------------------
			int pri10= pri9%50;//modulo para sacar sobrante
    		int val10= pri9-pri10;//Resto el sobrante al valor digitado
    		int seg10=val10/50;//divido y me dara la cantidad de billetes de 50
			//---------------------------------------------------------------------
    		System.out.println("cantidad de billetes de 50.000 " + seg);
    		System.out.println("cantidad de billetes de 20.000 " + seg2);
    		System.out.println("cantidad de billetes de 10.000 " + seg3);
    		System.out.println("cantidad de billetes de 5.000 " + seg4);
    		System.out.println("cantidad de billetes de 2.000 " + seg5);
    		System.out.println("cantidad de billetes de 1.000 " + seg6);
    		System.out.println("cantidad de monedas de 500 " + seg7);
			System.out.println("cantidad de monedas de 200 " + seg8);
			System.out.println("cantidad de monedas de 100 " + seg9);
			System.out.println("cantidad de monedas de 50 " + seg10);
    		
    	}
    	
    }
    
}
