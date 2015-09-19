/**
 * @(#)separar.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */

import java.util.*;

public class separar {

    public separar() {
    }
    public void ejerciSpac(){
    	int contador = 0;// Cuenta la cantidad de digitos que trae el numero
    	int numero;// Variable para conteo de digitos
    	int numero2;// Variable que usamos para sacar cada uno de los digitos
    	Scanner sc= new Scanner(System.in);//Invoco clase de java para leer datos
    	System.out.println("Digite un numero");//Pide dato
    	int lectura= sc.nextInt();//Lee los datos e teclado
    	numero = lectura;//se reasigna la variable
    	//se Crea un ciclo para sacar la cantidad de digitos
    	while (numero>0){
    		contador = contador + 1;
    		numero =numero/10;
    	}
    	System.out.println("El numero contiene " + contador + " digitos.");
    	int[ ]   vec = new  int[contador];//creamos un vector con la cantidad de digitos necesarios, y dados por el contador
    	numero2 = lectura;//reasigna variable
    	//Se genera ciclo para almacenar el numero en un vector
    	for(int i=0;i<contador;i++){
 			int auxiliar = numero2%10;//Modulamos el numero 
 			numero2 = numero2/10;//Eliminamos numero del valor inicial
 			vec[i]=vec[i] + auxiliar;//Asignamos dattos del modulador.
 			
    	}
    	int aux;//valiable auxiliar
    	int x=vec.length;//largo del array
    	for(int k=0;k<x/2;k++){//recorre el array hasta la mitad
    		aux=vec[x-1];//almacena ultimo numero
    		vec[x-1]=vec[k];//la ultima posicion ahora es el primer numero
    		vec[k]=aux;//primer numero se reemplaza por el ultimo (aux)
    		x--; //se disminuye de  izq a derecha el arreglo
    	}
    	//recorre arreglo invertido		
    	for (int m = 0; m < vec.length; m++)
    		//imprime  el arreglo invertido
        	System.out.print(vec[m] + "   ");
  
    }
  }  
